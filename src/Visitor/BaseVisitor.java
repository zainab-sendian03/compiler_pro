package Visitor;

import SymbolTable.SymbolTable;
import antlr.TypeScripteParser;
import SymbolTable.*;
import antlr.TypeScripteParserBaseVisitor;
import ast.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BaseVisitor extends TypeScripteParserBaseVisitor {
//    SymbolTable symbolTable = new SymbolTable();
private boolean insideArrayLiteral = false;
   static MyTable localTable = new MyTable();

    private final Stack<String> scopeStack = new Stack<>();

  //  private final Stack<String> scopeStack = new Stack<>();
    @Override
    public Node visitProgram(TypeScripteParser.ProgramContext ctx) {
        System.out.println();

        //System.out.println("Entering Program Scope");
        SymbolTable.createScope("Program Scope");
        Program program = new Program();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i) != null) {
                program.add((Node) visit(ctx.statement(i)));
            }
        }
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting Program Scope");

        return program;
    }

    @Override
    public Node visitImportStmt(TypeScripteParser.ImportStmtContext ctx) {
        TypeScripteParser.ImportStatementContext innerCtx = ctx.importStatement();

        String module ;

        if (innerCtx.STRING() != null) {
            module  = innerCtx.STRING().getText().replace("\"", "").replace("'", "");
        } else if (ctx.getText().contains("Component")) {
            module = "Component";
        } else {
            throw new IllegalArgumentException("Invalid import statement: " + innerCtx.getText());
        }

        ImportStatement importStatement = new ImportStatement(module);

        for (int i = 0; i < innerCtx.children.size(); i++) {
            String text = innerCtx.getChild(i).getText();
            if (text.equals("import") || text.equals("from") || text.equals("{") || text.equals("}") || text.equals(",")|| text.equals(";")) {
                continue;
            }
            if (!text.isEmpty()) {
                importStatement.add(text);
            }
        }
        return importStatement;
    }

    @Override
    public Node visitComponentStmt(TypeScripteParser.ComponentStmtContext ctx) {
        TypeScripteParser.ComponentDeclarationContext innerCtx = ctx.componentDeclaration();

        //System.out.println("Entering Component Scope");
        MyTable.createScope("Component Scope");
        ComponentBody componentBody = (ComponentBody) visit(innerCtx.componentBody());
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        componentDeclaration.setComponentBody(componentBody);
        MyTable.endCurrentScope();
        //System.out.println("Exiting Program Scope");
        return componentDeclaration;    }

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

        return new VariableDeclaration(name, type, expression);
    }
    @Override
    public Object visitObjectExpr(TypeScripteParser.ObjectExprContext ctx) {
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

        //System.out.println("Entering Class Scope");
        SymbolTable.createScope("Class Scope");
        String name = innerCtx.IDENTIFIER().getText();
        ClassDeclaration classDeclaration = new ClassDeclaration(name);
        if (innerCtx.classBody() != null) {
            ClassBody classBody = (ClassBody) visit(innerCtx.classBody());
            if (classBody != null) {
                for (Node member : classBody.members) {
                    classDeclaration.add(member);
                }
            } else {
                System.err.println("Warning: visit(classBody) returned null for class " + name);
            }}
        SymbolTable.addSymbolToCurrentScope(name, "Class", "",innerCtx.getStart().getLine());
        Symbol symbol = new Symbol(name, "Class", "", SymbolTable.currentScope.getName(),innerCtx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting Program Scope");
        return classDeclaration;    }

    @Override
    public Object visitClassBody(TypeScripteParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) != null) {
                Node members = (Node) visit(ctx.children.get(i));
                if (members != null) {
                    classBody.add(members);
                }
            }
        }
        return classBody;    }

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
        Expression condition = (Expression) visit(innerCtx.expression());
        //System.out.println("Entering If Scope");
        SymbolTable.createScope("If Scope");
        SymbolTable.addSymbolToCurrentScope("Condition", "Boolean", condition.toString(),innerCtx.getStart().getLine());

        Statement ifBodyAST = (Statement) visit(innerCtx.statement(0));
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting ForLoop Scope");
        Statement elseBodyAST = null;
        if (innerCtx.ELSE() != null) {
            //System.out.println("Entering Else Scope");
            SymbolTable.createScope("Else Scope");
            elseBodyAST = (Statement) visit(innerCtx.statement(1));
            SymbolTable.endCurrentScope();
            //System.out.println("Exiting ForLoop Scope");
        }
        return new IfStatement(condition, ifBodyAST, elseBodyAST);
    }

    @Override
    public Node visitComponentBody(TypeScripteParser.ComponentBodyContext ctx) {
        ComponentBody componentBody = new ComponentBody();
        for (TypeScripteParser.FieldContext fieldContext : ctx.field()) {
            Field field = (Field) visit(fieldContext);
            componentBody.add(field);
        }

        return componentBody;    }


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
        localTable.addSymbolToCurrentScope("selector", value,type,innerCtx.getStart().getLine());
        localTable.add("selector", MyTable.getCurrentScope().getName(),value,type,innerCtx.getStart().getLine());
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
        localTable.add("standalone",value, type   , SymbolTable.currentScope.getName(),innerCtx.getStart().getLine());
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
            localTable.add("imports",importValue , type, SymbolTable.currentScope.getName(), ctx.getStart().getLine());
        }

        return importsField;
    }

    @Override
    public Node visitBackTemplate(TypeScripteParser.BackTemplateContext ctx) {
        Node elementNode =(Node) visit(ctx.element());

        TemplateField templateField = new TemplateField();
        templateField.setTemplateString(ctx.getText());
        templateField.getElements().add(elementNode);

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
        localTable.add("template", value, type, SymbolTable.currentScope.getName(), ctx.getStart().getLine());

        return templateField;
    }


    @Override
    public Node visitOtherFlds(TypeScripteParser.OtherFldsContext ctx) {
        TypeScripteParser.OtherFieldsContext innerCtx = ctx.otherFields();

        String fieldName = innerCtx.getText();
        Expression expression = (Expression) visit(innerCtx.expression());
        localTable.addSymbolToCurrentScope(fieldName, fieldName, expression.toString(),innerCtx.getStart().getLine());
        localTable.add(fieldName, fieldName, expression.toString(), SymbolTable.currentScope.getName(),innerCtx.getStart().getLine());
        return new OtherField(fieldName, expression);
    }

    @Override
    public Node visitPropertyDeclaration(TypeScripteParser.PropertyDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Type type = ctx.type() != null ? new Type(ctx.type().getText()) : null;
        Expression value = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;

        assert value != null;
        SymbolTable.addSymbolToCurrentScope(name,"", value.toString(),ctx.getStart().getLine());
        Symbol symbol = new Symbol(name, "", value.toString(), SymbolTable.currentScope.getName(),ctx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);

        return new PropertyDeclaration(name, type, value);
    }

    @Override
    public Node visitMethodDeclaration(TypeScripteParser.MethodDeclarationContext ctx) {
        //System.out.println("Entering Function Scope");
        SymbolTable.createScope("Function Scope");
        String name = ctx.IDENTIFIER().getText();
        ParameterList parameterList = ctx.parameterList() != null ? (ParameterList) visit(ctx.parameterList()) : null;
        Type type = ctx.type() != null
                ? new Type(ctx.type().getText())
                : new Type("void");
        MethodBody methodBody = ctx.methodBody() != null
                ? (MethodBody) visit(ctx.methodBody())
                : new MethodBody();
        SymbolTable.addSymbolToCurrentScope(name, "Function", type.getTypeName(),ctx.getStart().getLine());
        Symbol symbol = new Symbol(name, "Function", type.getTypeName(), SymbolTable.currentScope.getName(),ctx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting Program Scope");
        return new MethodDeclaration(name, parameterList, type, methodBody);    }

    @Override
    public Node visitParameterList(TypeScripteParser.ParameterListContext ctx)   {
        ParameterList parameterList = new ParameterList();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter(i) != null) {
                Parameter parameter = (Parameter) visit(ctx.parameter(i));
                parameterList.addParameter(parameter);
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
                methodBody.add(statement);
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
            Type rightType = (Type) visit(ctx.type());

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
        ArrayLiteral arrayLiteral = new ArrayLiteral();
        for (int i = 0; i < innerCtx.expression().size(); i++) {
            if (innerCtx.expression(i) != null) {
                Expression element = (Expression) visit(innerCtx.expression(i));
                arrayLiteral.add(element);
            }
        }
        insideArrayLiteral = false;
        return arrayLiteral;
    }

    @Override
    public Node visitFunctionCallExpr(TypeScripteParser.FunctionCallExprContext ctx) {
        TypeScripteParser.FunctionCallContext innerCtx = ctx.functionCall();

        String functionName = innerCtx.getChild(0).getText();
        FunctionCall functionCall = new FunctionCall(functionName);
        List<String> arguments = new ArrayList<>();

        if (innerCtx.expression() != null) {
            for (int i = 0; i < innerCtx.expression().size(); i++) {
                Expression argument = (Expression) visit(innerCtx.expression(i));
                functionCall.add(argument);
                arguments.add(argument.toString());

            }
        }
        for (int i = 0; i < innerCtx.DOT().size(); i++) {
            String chainedFunctionName = innerCtx.getChild(4 + i * 4).getText();
            FunctionCall chainedCall = new FunctionCall(chainedFunctionName);

            if (innerCtx.expression(i) != null) {
                for (int j = 0; j < innerCtx.expression().size(); j++) {
                    Expression chainedArgument = (Expression) visit(innerCtx.expression(j));
                    chainedCall.add(chainedArgument);
                }
            }
            functionCall.addChainedCall(chainedCall);
        }
        SymbolTable.addSymbolToCurrentScope(functionName, "FunctionCall", "Arguments: " + arguments,innerCtx.getStart().getLine());

        return functionCall;    }

    @Override
    public Node visitArrowFunctionExpr(TypeScripteParser.ArrowFunctionExprContext ctx) {
        TypeScripteParser.ArrowFunctionContext innerCtx = ctx.arrowFunction();

        //System.out.println("Entering ArrowFunction Scope");
        SymbolTable.createScope("ArrowFunction Scope");
        ParameterList parameterList ;
        if (innerCtx.parameterList() != null) {
            parameterList = (ParameterList) visit(innerCtx.parameterList());
        } else {
            parameterList = new ParameterList();
        }

        Expression expression ;
        if (innerCtx.propertyAccess() != null) {
            expression = (Expression) visit(innerCtx.propertyAccess());
        } else {
            expression = new Literal("default expression");
        }
        SymbolTable.addSymbolToCurrentScope("ArrowFunction", "Function", "Parameters: " + parameterList.toString(),innerCtx.getStart().getLine());

        SymbolTable.endCurrentScope();
        //System.out.println("Exiting ArrowFunction Scope");
        return new ArrowFunction(parameterList, expression);    }

    @Override
    public Node visitOperationExpr(TypeScripteParser.OperationExprContext ctx) {
        TypeScripteParser.OperationContext innerCtx = ctx.operation();

        if (innerCtx.PLUS() != null || innerCtx.MINUS() != null || innerCtx.SLASH() != null || innerCtx.STAR() != null || innerCtx.MOD() != null || innerCtx.CLOSED_SYMBOL() != null || innerCtx.lt() != null) {
            String operator = innerCtx.getChild(1).getText();
            Expression left = new Identifier(innerCtx.IDENTIFIER().getText());

            Expression right = null;
            if (innerCtx.expression() != null) {
                right = (Expression) visit(innerCtx.expression());
            }

            return new Operation(left, operator, right);
        } else if ((innerCtx.PLUS() != null && innerCtx.getChild(2).getText().equals("+")) ||
                (innerCtx.MINUS() != null && innerCtx.getChild(2).getText().equals("-"))) {
            Expression identifier = new Identifier(innerCtx.IDENTIFIER().getText());
            String operator = innerCtx.getChild(1).getText() + innerCtx.getChild(2).getText();
            return new Operation(identifier, operator, null);
        } else {
            throw new IllegalArgumentException("Invalid operation");
        }    }

    @Override
    public Node visitAssignmentExpr(TypeScripteParser.AssignmentExprContext ctx) {
        TypeScripteParser.AssignmentExpressionContext innerCtx = ctx.assignmentExpression();
        PropertyAccess propertyAccess = (PropertyAccess) visit(innerCtx.propertyAccess());
        Expression expression = (Expression) visit(innerCtx.expression());
        return new AssignmentExpression(propertyAccess, expression);    }

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
        String key = ctx.IDENTIFIER().getText();
        Expression value = (Expression) visit(ctx.expression());
        if (!insideArrayLiteral) {
            SymbolTable.addSymbolToCurrentScope(key, "", value.toString(), ctx.getStart().getLine());

        }
        return new PropertyAssignment(key, value);
    }


    @Override
    public Node visitCompleteElement(TypeScripteParser.CompleteElementContext ctx) {
        TypeScripteParser.CompleteTagContext innerCtx = ctx.completeTag();
        if (innerCtx == null) {
            System.out.println("CompleteElementContext is null");
            return null;
        }
        CompleteTag completeTag = new CompleteTag(null, new ArrayList<>(), null);

        if (innerCtx.openTag() != null) {
            completeTag.setOpenTag((OpenTag) visit(innerCtx.openTag()));

        }
        String currentTagName = completeTag.getOpenTag() != null
                ? completeTag.getOpenTag().getTagName()
                : "Unknown";
        scopeStack.push(currentTagName);
        for (int i = 0; i < innerCtx.children.size(); i++) {
            if (innerCtx.getChild(i) != null) {

                if (innerCtx.getChild(i) instanceof TypeScripteParser.ElementContext) {
                    completeTag.getChildren().add((Node) visit(innerCtx.getChild(i)));
                } else if (innerCtx.getChild(i) instanceof TypeScripteParser.AngularExpressionContext) {
                    completeTag.getChildren().add((Node) visit(innerCtx.getChild(i)));
                }
            }
        }
        if (innerCtx.closedTag() != null) {
            completeTag.setClosedTag((ClosedTag) visit(innerCtx.closedTag()));
        }
        scopeStack.pop();
        return completeTag;

    }

    @Override
    public Node visitSelfClosingElement(TypeScripteParser.SelfClosingElementContext ctx) {
        TypeScripteParser.SelfClosingTagContext innerCtx = ctx.selfClosingTag();
        if (innerCtx == null) {
            System.out.println("SelfClosingTagContext is null");
            return null;
        }

        SelfClosingTag selfTag = new SelfClosingTag(null, new ArrayList<>());
        String tagName = innerCtx.TAG_NAME().getText();
        selfTag.setTagName(tagName);
        scopeStack.push(tagName);
        for (int i = 0; i < innerCtx.content().size(); i++) {
            if (innerCtx.content(i) != null) {

                selfTag.getAttributes().add((Node) visit(innerCtx.content(i)));
            }
        }
        String parentScope = scopeStack.size() > 1 ? scopeStack.get(scopeStack.size() - 2) : "Global";
        Symbol s = new Symbol(tagName, "Tag", null, parentScope,innerCtx.getStart().getLine());
        s.setKind("selfClosing");
        SymbolTable.getSymbols().add(s);

        scopeStack.pop();
        return selfTag;
    }


    @Override
    public Node visitOpenTag(TypeScripteParser.OpenTagContext ctx) {
        OpenTag oTag = new OpenTag(null, new ArrayList<>());

        String tagName = ctx.TAG_NAME().getText();
        scopeStack.push(tagName);
        oTag.setTagName(tagName);
        for (int i = 0; i < ctx.content().size(); i++) {
            if (ctx.content(i) != null) {
                oTag.getAttributes().add((Node) visit(ctx.content(i)));
            }
        }
        String parentScope = scopeStack.size() > 1 ? scopeStack.get(scopeStack.size() - 2) : "Global";
        Symbol ss = new Symbol(tagName, "Tag", null, parentScope,ctx.getStart().getLine());
        ss.setKind("open");
        SymbolTable.getSymbols().add(ss);

        scopeStack.pop();
        return oTag;
    }

    @Override
    public Node visitClosedTag(TypeScripteParser.ClosedTagContext ctx) {
        ClosedTag cTag = new ClosedTag(null);
        String tagName = ctx.TAG_NAME().getText();
        cTag.setTagName(tagName);
        String parentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
        Symbol s = new Symbol(tagName, "Tag", null, parentScope, ctx.getStart().getLine());
        s.setKind("close");
        SymbolTable.getSymbols().add(s);
        return cTag;
    }


    @Override
    public Node visitAngularExpression(TypeScripteParser.AngularExpressionContext ctx) {
        AngularExpression e = new AngularExpression(null);
        String expression = ctx.ANGULAR_EXPRESSION().getText();
        e.setExpression(expression);
        return e;
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
        String currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
        Symbol ssss = new Symbol(name, "NormalAttribute", value, currentScope,innerCtx.getStart().getLine());
        SymbolTable.getSymbols().add(ssss);

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
        String currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
        Symbol sssss = new Symbol(name, "BindingAttribute", value, currentScope,innerCtx.getStart().getLine());
        SymbolTable.getSymbols().add(sssss);
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
        String currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
        Symbol sssss = new Symbol(name, "DirectiveAttribute", value, currentScope,innerCtx.getStart().getLine());
        SymbolTable.getSymbols().add(sssss);
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
        String currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
        Symbol ssssss = new Symbol(name, "EventAttribute", value, currentScope,innerCtx.getStart().getLine());
        SymbolTable.getSymbols().add(ssssss);
        return eAtt;
    }



}
