package Visitor;

import Semantic_Check.SemanticAnalyzer;
import SymbolTable.SymbolTable;
import SymbolTable.*;
import antlr.TypeScripteParser;
import antlr.TypeScripteParserBaseVisitor;
import ast.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;


import java.util.ArrayList;
import java.util.List;


public class BaseVisitor extends TypeScripteParserBaseVisitor {
    private boolean insideArrayLiteral = false;
    static MyTable localTable = new MyTable();
    private TagSymbolTable tagSymbolTable = new TagSymbolTable();
    private AttSymbolTable attSymbolTable = new AttSymbolTable();
    private SemanticAnalyzer analyzer;


    public BaseVisitor(SemanticAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    @Override
    public Node visitProgram(TypeScripteParser.ProgramContext ctx) {
        System.out.println();

        //System.out.println("Entering Program Scope");
        SymbolTable.createScope("Program Scope");
        Program program = new Program();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i) != null) {
                program.addStatement((Node) visit(ctx.statement(i)));
            }
        }
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting Program Scope");

        return program;
    }

    @Override
    public Node visitImportStmt(TypeScripteParser.ImportStmtContext ctx) {
        TypeScripteParser.ImportStatementContext innerCtx = ctx.importStatement();

        String module = innerCtx.STRING().getText().replace("\"", "").replace("'", "");

        ImportStatement importStatement = new ImportStatement(module);

        for (TerminalNode id : innerCtx.IDENTIFIER()) {
            importStatement.addIdentifier(id.getText());
        }
        for (TerminalNode comp : innerCtx.COMPONENT()) {
            importStatement.addIdentifier(comp.getText());
        }
        for (TerminalNode inj : innerCtx.INJECTABLE()) {
            importStatement.addIdentifier(inj.getText());
        }
        for (String importedId : importStatement.identifiers) {
            SymbolTable.addSymbolToCurrentScope(
                    importedId,
                    "Import",
                    "from " + module,
                    innerCtx.getStart().getLine());
            Symbol symbol = new Symbol(   importedId,
                    "Import",
                    "from " + module,
                    SymbolTable.currentScope.getName(),
                    innerCtx.getStart().getLine());

            SymbolTable.getSymbols().add(symbol);



        }
        return importStatement;
    }


    @Override
    public Node visitInjectableStmt(TypeScripteParser.InjectableStmtContext ctx) {
        TypeScripteParser.InjectableDeclarationContext innerCtx = ctx.injectableDeclaration();

        String providedIn = "";
        if (innerCtx.injectableBody() != null) {
            InjectableBody body = (InjectableBody) visit(innerCtx.injectableBody());
            providedIn = body.getValue();

        }

        SymbolTable.addSymbolToCurrentScope(
                "Injectable",
                "Service",
                "providedIn: " + providedIn,
                innerCtx.getStart().getLine()
        );
        Symbol symbol = new Symbol( "Injectable", "Service", "providedIn: " + providedIn, SymbolTable.currentScope.getName(), innerCtx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);
        return new InjectableDeclaration(providedIn);
    }


    @Override
    public Node visitInjectableBody(TypeScripteParser.InjectableBodyContext ctx) {
        String providedIn = ctx.STRING().getText();

        return new InjectableBody(providedIn);
    }



    @Override
    public Node visitComponentStmt(TypeScripteParser.ComponentStmtContext ctx) {
        TypeScripteParser.ComponentDeclarationContext innerCtx = ctx.componentDeclaration();

        String componentName = "Component" + innerCtx.getStart().getLine();
        MyTable.createScope("Component Scope: " + componentName);

        ComponentBody componentBody = (ComponentBody) visit(innerCtx.componentBody());
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        componentDeclaration.setComponentBody(componentBody);
        analyzer.checkMismatchType();
        analyzer.checkDuplicateProperties();
        MyTable.endCurrentScope();

        return componentDeclaration;
    }



    @Override
    public Node visitVariableStmt(TypeScripteParser.VariableStmtContext ctx) {
        TypeScripteParser.VariableDeclarationContext innerCtx = ctx.variableDeclaration();

        String name;
        String typeName = null;
        Expression expression;
        String rawValue = null;
        Type type = null;
        if (innerCtx instanceof TypeScripteParser.VarDeclWithKeywordContext varCtx) {
            name = varCtx.IDENTIFIER().getText();
            typeName = varCtx.getChild(0).getText(); // VAR | CONST | LET
            type = new Type(typeName);
            expression = (Expression) visit(varCtx.expression());
            rawValue = varCtx.expression().getText();
            if (expression.toString().startsWith("\"") && expression.toString().endsWith("\"")) {
                rawValue = "\"" + rawValue + "\"";
            }
        } else if (innerCtx instanceof TypeScripteParser.VarReassignmentContext expCtx) {
            name = expCtx.IDENTIFIER().getText();
            expression = (Expression) visit(expCtx.expression());
        } else {
            throw new RuntimeException("Unknown variable declaration type");
        }

        SymbolTable.addSymbolToCurrentScope(name, typeName, rawValue,innerCtx.getStart().getLine());
        Symbol symbol = new Symbol(name, typeName, rawValue, SymbolTable.currentScope.getName(),innerCtx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);

        return new VariableDeclaration(name, expression);
    }
    @Override
    public Node visitObjectExpr(TypeScripteParser.ObjectExprContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral();

        if (ctx.objectLiteral().propertyAssignment() != null) {
            for (int i = 0; i < ctx.objectLiteral().propertyAssignment().size(); i++) {
                PropertyAssignment property = (PropertyAssignment) visit(ctx.objectLiteral().propertyAssignment(i));
                objectLiteral.addProperty(property);
            }
        }

        return objectLiteral;
    }


    @Override
    public Node visitClassStmt(TypeScripteParser.ClassStmtContext ctx) {
        TypeScripteParser.ClassDeclarationContext innerCtx = ctx.classDeclaration();

        String name = innerCtx.IDENTIFIER().getText();
        ClassDeclaration classDeclaration = new ClassDeclaration(name);

        SymbolTable.addSymbolToCurrentScope(
                name,
                "Class",
                "",
                innerCtx.getStart().getLine()
        );
        Symbol symbol = new Symbol(
                name,
                "Class",
                "",
                SymbolTable.currentScope.getName(),
                innerCtx.getStart().getLine()
        );
        SymbolTable.getSymbols().add(symbol);

        SymbolTable.createScope("Class Scope: " + name);
        if (innerCtx.classBody() != null) {
            ClassBody classBody = (ClassBody) visit(innerCtx.classBody());
            if (classBody != null) {
                for (Node member : classBody.members) {
                    classDeclaration.add(member);
                }
            } else {
                System.err.println("Warning: visit(classBody) returned null for class " + name);
            }
        }
        SymbolTable.endCurrentScope();

        return classDeclaration;
    }


    @Override
    public Node visitClassBody(TypeScripteParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) != null) {
                Node members = (Node) visit(ctx.children.get(i));
                if (members != null) {
                    classBody.add(members);
                }
            }
        }
        return classBody;
    }

    @Override
    public Node visitForLoopStmt(TypeScripteParser.ForLoopStmtContext ctx) {
        TypeScripteParser.ForLoopContext innerCtx = ctx.forLoop();
        VariableDeclaration init = null;
        if (innerCtx.variableDeclaration() != null) {
            init = (VariableDeclaration) visit(innerCtx.variableDeclaration());

        }
        Expression condition = null;
        if (innerCtx.expression(0) != null) {
            condition = (Expression) visit(innerCtx.expression(0));
        }

        Expression operation = null;
        if (innerCtx.expression(1) != null) {
            operation = (Expression) visit(innerCtx.expression(1));
        }
        ForLoop forLoop = new ForLoop(init, condition, operation);
        //System.out.println("Entering ForLoop Scope");
        SymbolTable.createScope("ForLoop Scope");
        for (int i = 0; i < innerCtx.statement().size(); i++) {
            if (innerCtx.statement(i) != null) {
                Node bodyStatement = (Node) visit(innerCtx.statement(i));
                forLoop.add(bodyStatement);
            }
        }
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting ForLoop Scope");
        return forLoop;
    }

    @Override
    public Node visitIfStmt(TypeScripteParser.IfStmtContext ctx) {
        TypeScripteParser.IfStatementContext innerCtx = ctx.ifStatement();

        Expression condition;
        if (innerCtx.expression().size() == 1) {
            condition = (Expression) visit(innerCtx.expression(0));
        } else {
            ArrayList<Expression> expressions = new ArrayList<>();
            for (TypeScripteParser.ExpressionContext exprCtx : innerCtx.expression()) {
                expressions.add((Expression) visit(exprCtx));
            }
            condition = new MultiExpression(expressions);
        }

        IfStatement ifStmt = new IfStatement(condition);

        SymbolTable.createScope("If Scope");
        for (TypeScripteParser.StatementContext stmtCtx : innerCtx.statement()) {
            Statement stmt = (Statement) visit(stmtCtx);
            ifStmt.addToIfBody(stmt);
        }
        SymbolTable.endCurrentScope();

        if (innerCtx.ELSE() != null) {
            SymbolTable.createScope("Else Scope");
            Statement elseStmt = (Statement) visit(innerCtx.statement(innerCtx.statement().size() - 1));
            ifStmt.addToElseBody(elseStmt);
            SymbolTable.endCurrentScope();
        }

        return ifStmt;
    }


    @Override
    public Node visitComponentBody(TypeScripteParser.ComponentBodyContext ctx) {
        ComponentBody componentBody = new ComponentBody();
        for (TypeScripteParser.FieldContext fieldContext : ctx.field()) {
            Field field = (Field) visit(fieldContext);
            componentBody.add(field);
        }

        return componentBody;
    }



    @Override
    public Node visitSelectorFld(TypeScripteParser.SelectorFldContext ctx) {
        TypeScripteParser.SelectorFieldContext innerCtx = ctx.selectorField();

        String value = null;
        String type = null;

        if (innerCtx.primitiveType() != null) {
            if (innerCtx.primitiveType().literal() != null) {
                if (innerCtx.primitiveType().literal().TRUE() != null) {
                    value = "true";
                    type = "true";
                } else if (innerCtx.primitiveType().literal().FALSE() != null) {
                    value = "false";
                    type = "false";
                } else if (innerCtx.primitiveType().literal().NUMBER() != null) {
                    value = innerCtx.primitiveType().literal().NUMBER().getText();
                    type= "int";
                } else if (innerCtx.primitiveType().literal().STRING() != null) {
                    value = innerCtx.primitiveType().literal().STRING().getText();
                    type = "String";

                } else {
                    value = innerCtx.primitiveType().literal().getText();
                    type =innerCtx.primitiveType().literal().getText();
                }
            } else {
                value = innerCtx.primitiveType().getText();
                type=innerCtx.primitiveType().getText();
            }
        }

        if (value == null) {
            value = "";
        }
        localTable.addSymbolToCurrentScope("selector", value, type, innerCtx.getStart().getLine());
        localTable.add("selector",value, type   , MyTable.currentScope.getName(),innerCtx.getStart().getLine());
        return new SelectorField(value);
    }


    @Override
    public Node visitStandaloneFld(TypeScripteParser.StandaloneFldContext ctx) {
        TypeScripteParser.StandaloneFieldContext innerCtx = ctx.standaloneField();
        String value = null;
        String type = null;

        if (innerCtx.primitiveType() != null) {
            if (innerCtx.primitiveType().literal() != null) {
                if (innerCtx.primitiveType().literal().TRUE() != null) {
                    value = innerCtx.primitiveType().literal().TRUE().getText();
                    type = "boolean";
                } else if (innerCtx.primitiveType().literal().FALSE() != null) {
                    value = innerCtx.primitiveType().literal().FALSE().getText();
                    type = "boolean";
                } else if (innerCtx.primitiveType().literal().NUMBER() != null) {
                    value = innerCtx.primitiveType().literal().NUMBER().getText();
                    type= "int";
                } else if (innerCtx.primitiveType().literal().STRING() != null) {
                    value = innerCtx.primitiveType().literal().STRING().getText();
                    type = "String";
                } else {
                    value = innerCtx.primitiveType().literal().getText();
                    type =innerCtx.primitiveType().literal().getText();
                }
            } else {
                value = innerCtx.primitiveType().getText();
                type=innerCtx.primitiveType().getText();
            }
        }

        if (value == null) {
            value = "";
        }
        localTable.addSymbolToCurrentScope("standalone", value, type,innerCtx.getStart().getLine());
        localTable.add("standalone",value, type   , MyTable.currentScope.getName(),innerCtx.getStart().getLine());
        return new StandalongField(value);
    }

    @Override
    public Node visitImportsFld(TypeScripteParser.ImportsFldContext ctx) {
        TypeScripteParser.ImportsFieldContext innerCtx = ctx.importsField();

        ImportsField importsField = new ImportsField();
        for (TypeScripteParser.PrimitiveTypeContext primCtx : innerCtx.primitiveType()) {
            String importValue = primCtx.getText();

            String type;
            if (importValue.equals("true") || importValue.equals("false")) {
                type = "boolean";
            } else if (importValue.startsWith("\"") && importValue.endsWith("\"") ) {
                type = "String";
            } else if (importValue.startsWith("[") && importValue.endsWith("]")) {
                type = "Array";
            } else {
                type = primCtx.getText();

            }
            importsField.add(importValue);

            localTable.addSymbolToCurrentScope("imports",importValue , type, ctx.getStart().getLine());
            localTable.add("imports",importValue , type, MyTable.currentScope.getName(), ctx.getStart().getLine());
        }

        return importsField;
    }

    @Override
    public Node visitBackTemplate(TypeScripteParser.BackTemplateContext ctx) {
        TemplateField templateField = new TemplateField();
        templateField.setTemplateString(ctx.getText());

        for (TypeScripteParser.ElementContext elemCtx : ctx.element()) {
            Node elementNode = (Node) visit(elemCtx);
            if (elementNode != null) {
                templateField.getElements().add(elementNode);
            }
        }

        return templateField;
    }

    @Override
    public Node visitTemplateFld(TypeScripteParser.TemplateFldContext ctx) {
        TypeScripteParser.TemplateFieldContext innerCtx = ctx.templateField();

        Node primitiveNode = (Node) visit(innerCtx.primitiveType());
        TemplateField templateField = new TemplateField();

        String value;
        String type;

        if (primitiveNode instanceof PrimitiveType) {
            value = innerCtx.primitiveType().getText();
            templateField.setTemplateString(value);

            if (value.equals("true") || value.equals("false")) {
                type = "boolean";
            } else if ((value.startsWith("\"") && value.endsWith("\"")) ) {
                type = "String";
            } else if (value.startsWith("[") && value.endsWith("]")) {
                type = "Array";
            } else {
                type = innerCtx.primitiveType().getText();
            }

        } else if (primitiveNode instanceof TemplateField) {
            templateField = (TemplateField) primitiveNode;
            value = templateField.getTemplateString();
            type = "String";

        } else {
            value = innerCtx.getText();
            type = innerCtx.getText();
        }

        localTable.addSymbolToCurrentScope("template", value, type, ctx.getStart().getLine());
        localTable.add("template", value, type, MyTable.currentScope.getName(), ctx.getStart().getLine());

        return templateField;
    }

    @Override
    public Node visitOtherFlds(TypeScripteParser.OtherFldsContext ctx) {
        TypeScripteParser.OtherFieldsContext innerCtx = ctx.otherFields();

        String fieldName = innerCtx.getText();
        Expression expression = (Expression) visit(innerCtx.expression());
        localTable.addSymbolToCurrentScope(fieldName, fieldName, expression.toString(),innerCtx.getStart().getLine());
        localTable.add(fieldName, fieldName, expression.toString(), MyTable.currentScope.getName(),innerCtx.getStart().getLine());
        return new OtherField(fieldName, expression);
    }

    @Override
    public Node visitPropertyDeclaration(TypeScripteParser.PropertyDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Type type = ctx.type() != null ? new Type(ctx.type().getText()) : null;

        Expression value = null;
        if (ctx.expression() != null) {
            value = (Expression) visit(ctx.expression());

        }

        String valueStr = (value != null) ? value.toString() : "";
        AttSymbol p = new AttSymbol(name, "", valueStr, ctx.getStart().getLine());
        AttSymbolTable.getSymbols().add(p);

        SymbolTable.addSymbolToCurrentScope(
                name,
                ctx.type() != null ? ctx.type().getText() : "any"
                ,
                valueStr,
                ctx.getStart().getLine());
        Symbol symbol = new Symbol(   name,
                ctx.type() != null ? ctx.type().getText() : "any"
                ,
                valueStr,
                SymbolTable.currentScope.getName(),
                ctx.getStart().getLine());

        SymbolTable.getSymbols().add(symbol);
        return new PropertyDeclaration(name, type, value);
    }

    @Override
    public Node visitConstructorCall(TypeScripteParser.ConstructorCallContext ctx) {
        String className = ctx.IDENTIFIER().getText();

        Expression genericType = null;
        if (ctx.lt() != null && ctx.type() != null) {
            genericType =new Literal(ctx.type().getText()) {
            };
        }

        Expression argument = null;
        if (ctx.expression() != null) {
            argument = (Expression) visit(ctx.expression());
        }
        SymbolTable.addSymbolToCurrentScope(
                className,
                "Constructor",
                "",
                ctx.getStart().getLine()
        );
        Symbol symbol = new Symbol(
                className,
                "Constructor",
                "",
                SymbolTable.currentScope.getName(),
                ctx.getStart().getLine()
        );
        SymbolTable.getSymbols().add(symbol);
        return new ConstructorCall(className, argument, genericType);
    }


    @Override
    public Node visitConstructorExpr(TypeScripteParser.ConstructorExprContext ctx) {
        TypeScripteParser.ConstructorContext innerCtx = ctx.constructor();

        // جمع الخصائص
        ArrayList<PropertyDeclaration> params = new ArrayList<>();
        for (TypeScripteParser.PropertyDeclarationContext pCtx : innerCtx.propertyDeclaration()) {
            params.add((PropertyDeclaration) visit(pCtx));
        }

        // جمع body (مثلاً functionCall)
        ArrayList<Statement> bodyCall = new ArrayList<>();
        if (innerCtx.functionCall() != null) {
            bodyCall.add((Statement) visit(innerCtx.functionCall()));
        }

        return new ConstructorDecl(params, bodyCall);
    }



    @Override
    public Node visitMethodDeclaration(TypeScripteParser.MethodDeclarationContext ctx) {
        SymbolTable.createScope("Function Scope");

        String name = ctx.IDENTIFIER().getText();
        ParameterList parameterList = ctx.parameterList() != null ? (ParameterList) visit(ctx.parameterList()) : null;

        Type type = ctx.type() != null ? new Type(ctx.type().getText()) : new Type("void");

        MethodBody methodBodyNode = ctx.methodBody() != null ? (MethodBody) visit(ctx.methodBody()) : new MethodBody();

        // إنشاء AST للميثود باستخدام الـ statements
        MethodDeclaration methodDeclaration = new MethodDeclaration(name, parameterList, methodBodyNode.getStatements());

        // إضافة للـ symbol table إذا بدك
        AttSymbol m = new AttSymbol(name, "Function", type.getTypeName(), ctx.getStart().getLine());
        AttSymbolTable.getSymbols().add(m);

        SymbolTable.endCurrentScope();

        return methodDeclaration;
    }


    @Override
    public Node visitParameterList(TypeScripteParser.ParameterListContext ctx)   {
        ParameterList parameterList = new ParameterList();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter(i) != null) {
                Parameter parameter = (Parameter) visit(ctx.parameter(i));
                parameterList.add(parameter);
            }
        }
        return parameterList;    }

    @Override
    public Node visitParameter(TypeScripteParser.ParameterContext ctx) {
        String name = (ctx.IDENTIFIER() != null) ? ctx.IDENTIFIER().getText() : "undefined";
        String typeName = (ctx.type() != null) ? ctx.type().getText() : "undefined";
        Type type = new Type(typeName);

        SymbolTable.addSymbolToCurrentScope(name, typeName, "",ctx.getStart().getLine());
        Symbol symbol = new Symbol(name, typeName, "", SymbolTable.currentScope.getName(),ctx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);
        return new Parameter(name, type);    }

    @Override
    public Node visitMethodBody(TypeScripteParser.MethodBodyContext ctx) {
        MethodBody methodBody = new MethodBody();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i) != null) {
                Node statement = (Node) visit(ctx.statement(i));
                if (statement != null) {
                    methodBody.add(statement);
                } else {
                    System.out.println("Warning: statement is null at index " + i);
                }

            }
        }
        return methodBody;    }

    @Override
    public Node visitType(TypeScripteParser.TypeContext ctx) {
        if (ctx.primitiveType() != null) {
            return (Node) visit(ctx.primitiveType());
        }

        if (ctx.PIPE() != null) {
            Type leftType = (Type) visit(ctx.primitiveType());
            Type rightType = (Type) visit((ParseTree) ctx.type());

            List<Type> unionTypes = new ArrayList<>();
            if (leftType != null && leftType.getUnionTypes() != null) {
                unionTypes.addAll(leftType.getUnionTypes());
            } else {
                unionTypes.add(leftType);
            }

            if (rightType != null && rightType.getUnionTypes() != null) {
                unionTypes.addAll(rightType.getUnionTypes());
            } else {
                unionTypes.add(rightType);
            }

            return new Type(unionTypes);
        }

        return null;    }

    @Override
    public Node visitPrimitiveType(TypeScripteParser.PrimitiveTypeContext ctx) {
        if (ctx.literal() != null && ctx.literal().NUMBER() != null) {
            return new PrimitiveType("number");
        } else if (ctx.MYSTRING() != null) {
            return new PrimitiveType("String");
        } else if (ctx.BOOLEAN() != null) {
            return new PrimitiveType("boolean");
        } else if (ctx.VOID() != null) {
            return new PrimitiveType("void");
        } else if (ctx.NULL() != null) {
            return new PrimitiveType("null");
        } else if (ctx.IDENTIFIER() != null) {
            return (Node) visit(ctx.IDENTIFIER());
        }else if (ctx.backTemplate() != null) {
            return (Node) visit(ctx.backTemplate());
        }

        return null;
    }

    @Override
    public Node visitArrayExpr(TypeScripteParser.ArrayExprContext ctx) {
        TypeScripteParser.ArrayLiteralContext innerCtx = ctx.arrayLiteral();

        insideArrayLiteral = true;
        ArrayLiteral arrayLiteral = new ArrayLiteral(new ArrayList<>()); // تهيئة

        for (int i = 0; i < innerCtx.expression().size(); i++) {
            if (innerCtx.expression(i) != null) {
                Expression element = (Expression) visit(innerCtx.expression(i));
                arrayLiteral.addElement(element);
                //System.out.println("Visited element: " + element);

                if (element instanceof Literal) {
                    String value = ((Literal) element).getStringValue();
                    NavigateTable.addNavigate("navigate", value, innerCtx.getStart().getLine());
                }



            }
        }

        insideArrayLiteral = false;

        return arrayLiteral; // رجعنا ArrayLiteral كامل
    }



    @Override
    public Node visitExprStmt(TypeScripteParser.ExprStmtContext ctx) {
        TypeScripteParser.ExpressionStatementContext innerCtx = ctx.expressionStatement();

        Expression exprNode = innerCtx.expression() != null ? (Expression) visit(innerCtx.expression()) : null;
        return new ExpressionStatement(exprNode);
    }


    @Override
    public Node visitFunctionCallExpr(TypeScripteParser.FunctionCallExprContext ctx) {
        TypeScripteParser.FunctionCallContext innerCtx = ctx.functionCall();

        String functionName = innerCtx.getChild(0).getText();
        FunctionCall functionCall = new FunctionCall(functionName);
        List<String> arguments = new ArrayList<>();

        if (innerCtx.expression() != null) {
            for (int i = 0; i < innerCtx.expression().size(); i++) {
                Node node = (Node) visit(innerCtx.expression(i));
                if (node instanceof Expression) {
                    Expression argument = (Expression) node;
                    functionCall.addArgument(argument);
                    arguments.add(argument.toString());
                } else {
                    // في حال الـ visit رجع null أو مش Expression
                    arguments.add("null");
                }
            }
        }

        // التعامل مع chained calls
        for (int i = 0; i < innerCtx.getChildCount(); i++) {
            ParseTree child = innerCtx.getChild(i);
            if (child.getText().equals(".") && i + 1 < innerCtx.getChildCount()) {
                String chainedFunctionName = innerCtx.getChild(i + 1).getText();
                FunctionCall chainedCall = new FunctionCall(chainedFunctionName);
                functionCall.addChainedCall(chainedCall);
            }
        }

        SymbolTable.addSymbolToCurrentScope(
                functionName,
                "FunctionCall",
                "Arguments: " + arguments,
                innerCtx.getStart().getLine()
        );

        Symbol symbol = new Symbol(
                functionName,
                "FunctionCall",
                "Arguments: " + arguments,
                SymbolTable.currentScope.getName(),
                innerCtx.getStart().getLine()
        );
        SymbolTable.getSymbols().add(symbol);

        return functionCall;
    }


    @Override
    public Node visitArrowFunctionExpr(TypeScripteParser.ArrowFunctionExprContext ctx) {
        TypeScripteParser.ArrowFunctionContext innerCtx = ctx.arrowFunction();

        SymbolTable.createScope("ArrowFunction Scope");

        ParameterList parameterList;
        if (innerCtx.parameterList() != null) {
            parameterList = (ParameterList) visit(innerCtx.parameterList());
        } else if (innerCtx.IDENTIFIER() != null) {
            parameterList = new ParameterList();
            parameterList.add(new Parameter(innerCtx.IDENTIFIER().getText()));
        } else {
            parameterList = new ParameterList();
        }

        Node expression;
        if (innerCtx.getRuleContext(TypeScripteParser.MethodBodyContext.class,0) != null) {
            expression = (Node) visit(innerCtx.getRuleContext(TypeScripteParser.MethodBodyContext.class,0));
        } else if (innerCtx.getRuleContext(TypeScripteParser.FunctionCallContext.class,0) != null) {
            expression = (Node) visit(innerCtx.getRuleContext(TypeScripteParser.FunctionCallContext.class,0));
        } else {
            expression = new Literal("default expression");
        }

        SymbolTable.addSymbolToCurrentScope(
                "ArrowFunction",
                "Function",
                "Parameters: " + parameterList.toString(),
                innerCtx.getStart().getLine()
        );

        Symbol symbol = new Symbol(
                "ArrowFunction",
                "Function",
                "Parameters: " + parameterList.toString(),
                SymbolTable.currentScope.getName(),
                innerCtx.getStart().getLine()
        );
        SymbolTable.getSymbols().add(symbol);
        SymbolTable.endCurrentScope();

        return new ArrowFunction(parameterList, expression);
    }


    @Override
    public Node visitOperationExpr(TypeScripteParser.OperationExprContext ctx) {
        TypeScripteParser.OperationContext innerCtx = ctx.operation();

        Expression left = null;
        Expression right = null;
        String operator = null;

        // لو عندنا identifier كبداية
        if (innerCtx.IDENTIFIER() != null) {
            left = new Identifier(innerCtx.IDENTIFIER().getText());
        }

        // التعامل مع keys + expression
        if (innerCtx.keys() != null) {
            operator = innerCtx.keys().getText();

            // expression ممكن تكون موجودة بعد keys
            if (innerCtx.expression() != null && !innerCtx.expression().isEmpty()) {
                right = (Expression) visit(innerCtx.expression());
            }

            return new Operation(left, operator, right);
        }

        // التعامل مع ++ و --
        if (innerCtx.PLUS() != null && innerCtx.getChildCount() == 2 && innerCtx.getChild(1).getText().equals("+")) {
            operator = "++";
            return new Operation(left, operator, null);
        } else if (innerCtx.MINUS() != null && innerCtx.getChildCount() == 2 && innerCtx.getChild(1).getText().equals("-")) {
            operator = "--";
            return new Operation(left, operator, null);
        }

        throw new IllegalArgumentException("Invalid operation");
    }


    @Override
    public Node visitAssignmentExpr(TypeScripteParser.AssignmentExprContext ctx) {
        TypeScripteParser.AssignmentExpressionContext innerCtx = ctx.assignmentExpression();

        Expression target = null;
        Expression value = null;

        // left-hand side
        if (innerCtx.propertyAccess() != null) {
            target = (Expression) visit(innerCtx.propertyAccess());
        } else if (innerCtx.arrayLiteral() != null) {
            target = (Expression) visit(innerCtx.arrayLiteral());
        }

        // right-hand side
        if (innerCtx.expression() != null) {
            value = (Expression) visit(innerCtx.expression());
        }

        return new AssignmentExpression(target, value);
    }



    @Override
    public Node visitPropertyAccessExpr(TypeScripteParser.PropertyAccessExprContext ctx) {
        if (ctx.getChildCount() < 1) {
            throw new IllegalArgumentException("Invalid property access: no children found.");
        }
        String objectName = ctx.getChild(0).getText();

        StringBuilder propertyChain = new StringBuilder(objectName);
        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            if (ctx.getChild(i) == null || !".".equals(ctx.getChild(i).getText())) {
                throw new IllegalArgumentException("Expected '.' in property access.");
            }
            if (ctx.getChild(i + 1) == null) {
                throw new IllegalArgumentException("Expected property identifier after '.'.");
            }
            propertyChain.append(".").append(ctx.getChild(i + 1).getText());
        }

        return new PropertyAccess(objectName, propertyChain.toString());    }

    @Override
    public Node visitLiteral(TypeScripteParser.LiteralContext ctx) {
        if (ctx.NULL() != null) {
            return new Literal();
        }
        if (ctx.STRING() != null) {
            String stringVal = ctx.STRING().getText().replace("\"", "");
            return new Literal(stringVal);
        }
        if (ctx.NUMBER() != null) {
            Integer integerVal = Integer.parseInt(ctx.NUMBER().getText());
            return new Literal(integerVal);
        } if (ctx.IDENTIFIER() != null) {
            String idVal = ctx.IDENTIFIER().getText();
            return new Literal(idVal);
        }
        if (ctx.TRUE() != null) {
            return new Literal(true);
        } else if (ctx.FALSE() != null) {
            return new Literal(false);
        }
        String ctxText = ctx.getText();
        throw new UnsupportedOperationException("Unknown literal type: " + ctxText);    }

    @Override
    public Node visitPropertyAssignment(TypeScripteParser.PropertyAssignmentContext ctx) {
        Node keyNode = (Node) visit(ctx.expression(0));
        Node valueNode = null;
        if (ctx.expression().size() > 1) {
            valueNode = (Node) visit(ctx.expression(1));
        }

        Expression key = keyNode instanceof Expression ? (Expression) keyNode : new Literal("unknown");
        Expression value = valueNode instanceof Expression ? (Expression) valueNode : new Literal("null");

        if (!insideArrayLiteral) {
            SymbolTable.addSymbolToCurrentScope(
                    key.toString(), "", value.toString(), ctx.getStart().getLine()
            );
        }

        Symbol symbol = new Symbol(
                key.toString(), "", value.toString(),
                SymbolTable.currentScope.getName(),
                ctx.getStart().getLine()
        );
        SymbolTable.getSymbols().add(symbol);
        if (key.toString().equals("path")) {
            NavigateTable.addNavigate("route", value.toString(),ctx.getStart().getLine());
        }

        return new PropertyAssignment(key, value);
    }

    @Override
    public Node visitHtmlRoot(TypeScripteParser.HtmlRootContext ctx) {
        SymbolTable.createScope("HTML Scope");
        HtmlRoot root=new HtmlRoot( new ArrayList<>());
        for (int i = 0; i < ctx.element().size(); i++) {
            if (ctx.element(i) != null) {
                root.getChildren().add((Node) visit(ctx.element(i)));
            }
        }
        SymbolTable.endCurrentScope();
        return root;
    }

    @Override
    public Element visitCompleteElement(TypeScripteParser.CompleteElementContext ctx) {
        TypeScripteParser.CompleteTagContext innerCtx = ctx.completeTag();
        if (innerCtx == null) {
            System.out.println("CompleteElementContext is null");
            return null;
        }
        CompleteTag completeTag = new CompleteTag(null, new ArrayList<>(), null);

        if (innerCtx.openTag() != null) {
            completeTag.setOpenTag((OpenTag) visit(innerCtx.openTag()));

        }
        for (int i = 0; i < innerCtx.children.size(); i++) {
            if (innerCtx.getChild(i) != null) {

                if (innerCtx.getChild(i) instanceof TypeScripteParser.ElementContext) {
                    completeTag.getChildren().add((Node) visit(innerCtx.getChild(i)));
                } else if (innerCtx.getChild(i) instanceof TypeScripteParser.AngularExpressionContext) {
                    completeTag.getChildren().add((Node) visit(innerCtx.getChild(i)));
                }
              else if (innerCtx.getChild(i) instanceof TypeScripteParser.TextContext) {
                completeTag.getChildren().add((Node) visit(innerCtx.getChild(i)));
                }

           }
        }
        if (innerCtx.closedTag() != null) {
            completeTag.setClosedTag((ClosedTag) visit(innerCtx.closedTag()));
        }
        return completeTag;

    }

@Override
public Node visitSelfClosingElement(TypeScripteParser.SelfClosingElementContext ctx) {
    TypeScripteParser.SelfClosingTagContext innerCtx = ctx.selfClosingTag();
    if (innerCtx == null) return null;
    SelfClosingTag selfTag = new SelfClosingTag(null, new ArrayList<>());
    String tagName = innerCtx.TAG_NAME().getText();
    selfTag.setTagName(tagName);
    for (int i = 0; i < innerCtx.content().size(); i++) {
        if (innerCtx.content(i) != null) {

            selfTag.getAttributes().add((Node) visit(innerCtx.content(i)));
        }
    }

    return selfTag;
}

    @Override
    public Node visitOpenTag(TypeScripteParser.OpenTagContext ctx) {
        OpenTag oTag = new OpenTag(null, new ArrayList<>());
        String tagName = ctx.TAG_NAME().getText();
        oTag.setTagName(tagName);
        tagSymbolTable.pushTag(tagName);
        for (int i = 0; i < ctx.content().size(); i++) {
           if (ctx.content(i) != null) {
               oTag.getAttributes().add((Node) visit(ctx.content(i)));
           }
       }

        return oTag;
    }

    @Override
    public Node visitClosedTag(TypeScripteParser.ClosedTagContext ctx) {
        ClosedTag cTag = new ClosedTag(null);
        String tagName = ctx.TAG_NAME().getText();
        cTag.setTagName(tagName);
        int line = ctx.getStart().getLine();
        String scope = tagSymbolTable.getCurrentScope();
        analyzer.checkTagMatching(tagName, line, tagSymbolTable, scope);
        return cTag;
    }


    @Override
    public Node visitAngularExpression(TypeScripteParser.AngularExpressionContext ctx) {
        AngularExpression e = new AngularExpression(null);
        String expression = ctx.ANGULAR_EXPRESSION().getText();
        if (expression.startsWith("{{") && expression.endsWith("}}")) {
            expression = expression.substring(2, expression.length() - 2).trim();
        }
        System.out.print(expression);
        e.setExpression(expression);
        return e;
    }

    @Override
    public Node visitText(TypeScripteParser.TextContext ctx) {
        Text t = new Text(null,null);
        if (ctx.TEXT() != null) {
            String text=ctx.TEXT().getText();
            t.setText(text);
            t.setIdentifier(null);
        } else {
            String text=ctx.IDENTIFIER().getText();
            t.setText(null);
            t.setIdentifier(text);
        }
        return t;
    }

    @Override
    public Node visitNormalAttr(TypeScripteParser.NormalAttrContext ctx) {
        TypeScripteParser.NormalAttributeContext innerCtx = ctx.normalAttribute();
        if (innerCtx == null) {
            System.out.println("NormalAttributeContext is null");
            return null;
        }
        NormalAttribute bAtt = new NormalAttribute(null, null);
        String name = innerCtx.IDENTIFIER().getText();
        String value = innerCtx.STRING().getText();
        value = value.substring(1, value.length() - 1);
        bAtt.setName(name);
        bAtt.setValue(value);
        return bAtt;
    }

    @Override
    public Node visitBindingAttr(TypeScripteParser.BindingAttrContext ctx) {

        TypeScripteParser.BindingAttributeContext innerCtx = ctx.bindingAttribute();
        if (innerCtx == null) {
            System.out.println("BindingAttributeContext is null");
            return null;
        }
        BindingAttribute dAtt = new BindingAttribute(null, null);

        String name = innerCtx.IDENTIFIER().getText();
        String value = innerCtx.STRING().getText();
        value = value.substring(1, value.length() - 1);
        dAtt.setName(name);
        dAtt.setValue(value);
        return dAtt;
    }

    @Override
    public Node visitDirectiveAttr(TypeScripteParser.DirectiveAttrContext ctx) {
        TypeScripteParser.DirevtiveAttributeContext innerCtx = ctx.direvtiveAttribute();
        if (innerCtx == null) {
            System.out.println("DirectiveAttributeContext is null");
            return null;
        }
        DirectiveAttribute dAtt = new DirectiveAttribute(null, null);

        String name = innerCtx.IDENTIFIER().getText();
        String value = innerCtx.STRING().getText();
        value = value.substring(1, value.length() - 1);
        dAtt.setName(name);
        dAtt.setValue(value);
        AttSymbol s3 = new AttSymbol(name, "DirectiveAttribute", value,innerCtx.getStart().getLine());
        attSymbolTable.getSymbols().add(s3);
        //analyzer.checkInvalidDirectiveExpression(s3);

        return dAtt;
    }


    @Override
    public Node visitEventAttr(TypeScripteParser.EventAttrContext ctx) {

        TypeScripteParser.EventAttributeContext innerCtx = ctx.eventAttribute();
        if (innerCtx == null) {
            System.out.println("EventAttributeContext is null");
            return null;
        }

        EventAttribute eAtt = new EventAttribute(null, null);
        String name = innerCtx.IDENTIFIER().getText();
        String value = innerCtx.STRING().getText();
        value = value.substring(1, value.length() - 1);
        eAtt.setName(name);
        eAtt.setValue(value);
        AttSymbol s4 = new AttSymbol(name, "EventAttribute", value,innerCtx.getStart().getLine());
        attSymbolTable.getSymbols().add(s4);
        //analyzer.checkEventCallImmediate(s4 );
        return eAtt;
    }
    @Override
    public Node visitTwoWayBindingAttr(TypeScripteParser.TwoWayBindingAttrContext ctx) {

        TypeScripteParser.TwoWayBindingAttributeContext innerCtx = ctx.twoWayBindingAttribute();
        if (innerCtx == null) {
            System.out.println("TwoWayBindingAttributeContext is null");
            return null;
        }

        TwoWayBindingAttribute tAtt = new TwoWayBindingAttribute(null, null);
        String name = innerCtx.IDENTIFIER().getText();
        String value = innerCtx.STRING().getText();
        value = value.substring(1, value.length() - 1);
        tAtt.setName(name);
        tAtt.setValue(value);
        AttSymbol s5 = new AttSymbol(name, "TwoWayBindingAttribute", value,innerCtx.getStart().getLine());
        attSymbolTable.getSymbols().add(s5);
        return tAtt;
    }


}
