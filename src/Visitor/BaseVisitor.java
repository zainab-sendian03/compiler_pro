package Visitor;

import Semantic_Check.SemanticAnalyzer;
import SymbolTable.SymbolTable;
import antlr.TypeScripteParser;
import SymbolTable.Symbol;
import antlr.TypeScripteParserBaseVisitor;
import ast.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class BaseVisitor extends TypeScripteParserBaseVisitor {
//    SymbolTable symbolTable = new SymbolTable();
private boolean insideArrayLiteral = false;

    private final Stack<String> scopeStack = new Stack<>();
    @Override
    public AST visitProgram(TypeScripteParser.ProgramContext ctx) {
        System.out.println();

        //System.out.println("Entering Program Scope");
        SymbolTable.createScope("Program Scope");
        Program program = new Program();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i) != null) {
                program.addChild((AST) visit(ctx.statement(i)));
            }
        }
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting Program Scope");

        return program;
    }

    @Override
    public AST visitImportStmt(TypeScripteParser.ImportStmtContext ctx) {
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
                importStatement.addIdentifiers(text);
            }
        }
        return importStatement;
    }

    @Override
    public AST visitComponentStmt(TypeScripteParser.ComponentStmtContext ctx) {
        TypeScripteParser.ComponentDeclarationContext innerCtx = ctx.componentDeclaration();

        //System.out.println("Entering Component Scope");
        SymbolTable.createScope("Component Scope");
        ComponentBody componentBody = (ComponentBody) visit(innerCtx.componentBody());
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        componentDeclaration.setComponentBody(componentBody);
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting Program Scope");
        return componentDeclaration;    }

    @Override
    public AST visitVariableStmt(TypeScripteParser.VariableStmtContext ctx) {
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
    public Object visitExprStmt(TypeScripteParser.ExprStmtContext ctx) {
        TypeScripteParser.ExpressionStatementContext innerCtx = ctx.expressionStatement();
        return visit(innerCtx.expression());
    }

    @Override
    public AST visitClassStmt(TypeScripteParser.ClassStmtContext ctx) {
        TypeScripteParser.ClassDeclarationContext innerCtx = ctx.classDeclaration();

        //System.out.println("Entering Class Scope");
        SymbolTable.createScope("Class Scope");
        String name = innerCtx.IDENTIFIER().getText();
        ClassDeclaration classDeclaration = new ClassDeclaration(name);
        if (innerCtx.classBody() != null) {
            ClassBody classBody = (ClassBody) visit(innerCtx.classBody());
            if (classBody != null) {
                for (AST member : classBody.members) {
                    classDeclaration.addBody(member);
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
                AST members = (AST) visit(ctx.children.get(i));
                if (members != null) {
                    classBody.addMember(members);
                }
            }
        }
        return classBody;    }

    @Override
    public AST visitForLoopStmt(TypeScripteParser.ForLoopStmtContext ctx) {
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
                AST bodyStatement = (AST) visit(innerCtx.statement(i));
                forLoop.addBodyStatement(bodyStatement);
            }
        }
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting ForLoop Scope");
        return forLoop;
    }

    @Override
    public AST visitIfStmt(TypeScripteParser.IfStmtContext ctx) {
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
    public AST visitComponentBody(TypeScripteParser.ComponentBodyContext ctx) {
        ComponentBody componentBody = new ComponentBody();
        for (TypeScripteParser.FieldContext fieldContext : ctx.field()) {
            Field field = (Field) visit(fieldContext);
            componentBody.addField(field);
        }

        return componentBody;    }


    @Override
    public AST visitSelectorFld(TypeScripteParser.SelectorFldContext ctx) {
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
                    type =innerCtx.primitiveType().literal().getText();;
                }
            } else {
                value = innerCtx.primitiveType().getText();
                type=innerCtx.primitiveType().getText();
            }
        }

        if (value == null) {
            value = "";
        }

        Symbol symbol = new Symbol("selector", type, value, SymbolTable.currentScope.getName(), innerCtx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);
        SymbolTable.addSymbolToCurrentScope("selector", type, value, innerCtx.getStart().getLine());

        return new SelectorField(value);
    }


    @Override
    public AST visitStandaloneFld(TypeScripteParser.StandaloneFldContext ctx) {
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
                    type =innerCtx.primitiveType().literal().getText();;
                }
            } else {
                value = innerCtx.primitiveType().getText();
                type=innerCtx.primitiveType().getText();
            }
        }

        if (value == null) {
            value = "";
        }       SymbolTable.addSymbolToCurrentScope("standalone", type, value,innerCtx.getStart().getLine());
        Symbol symbol = new Symbol("standalone", type, value   , SymbolTable.currentScope.getName(),innerCtx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);
            return new StandalongField(value);
    }

    @Override
    public AST visitImportsFld(TypeScripteParser.ImportsFldContext ctx) {
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
            importsField.addImport(importValue);

            SymbolTable.addSymbolToCurrentScope("imports",type , importValue, ctx.getStart().getLine());
            Symbol symbol = new Symbol("imports",type , importValue, SymbolTable.currentScope.getName(), ctx.getStart().getLine());
            SymbolTable.getSymbols().add(symbol);
        }

        return importsField;
    }

    @Override
    public AST visitTemplateFld(TypeScripteParser.TemplateFldContext ctx) {
        TypeScripteParser.TemplateFieldContext innerCtx = ctx.templateField();

        TemplateField templateField = new TemplateField();

        String value = innerCtx.primitiveType().getText();
        templateField.setTemplateString(value);

        String type;
        if (value.equals("true") || value.equals("false")) {
            type = "boolean";
        } else if (value.startsWith("\"") && value.endsWith("\"") || value.startsWith("`") && value.endsWith("`")) {
            type = "String";
        } else if (value.startsWith("[") && value.endsWith("]")) {
            type = "Array";
        } else {
            type = innerCtx.primitiveType().getText();

        }

        SymbolTable.addSymbolToCurrentScope("template",type,value, ctx.getStart().getLine());

        Symbol symbol = new Symbol("template",  type, value, SymbolTable.currentScope.getName(), ctx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);

        return templateField;
    }



    @Override
    public AST visitOtherFlds(TypeScripteParser.OtherFldsContext ctx) {
        TypeScripteParser.OtherFieldsContext innerCtx = ctx.otherFields();

        String fieldName = innerCtx.getText();
        Expression expression = (Expression) visit(innerCtx.expression());
        SymbolTable.addSymbolToCurrentScope(fieldName, fieldName, expression.toString(),innerCtx.getStart().getLine());
        Symbol symbol = new Symbol(fieldName, fieldName, expression.toString(), SymbolTable.currentScope.getName(),innerCtx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);
        return new OtherField(fieldName, expression);
    }

    @Override
    public AST visitPropertyDeclaration(TypeScripteParser.PropertyDeclarationContext ctx) {
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
    public AST visitMethodDeclaration(TypeScripteParser.MethodDeclarationContext ctx) {
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
    public AST visitParameterList(TypeScripteParser.ParameterListContext ctx)   {
        ParameterList parameterList = new ParameterList();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter(i) != null) {
                Parameter parameter = (Parameter) visit(ctx.parameter(i));
                parameterList.addParameter(parameter);
            }
        }
        return parameterList;    }

    @Override
    public AST visitParameter(TypeScripteParser.ParameterContext ctx) {
        String name = (ctx.IDENTIFIER() != null) ? ctx.IDENTIFIER().getText() : "undefined";
        String typeName = (ctx.type() != null) ? ctx.type().getText() : "undefined";
        Type type = new Type(typeName);

        SymbolTable.addSymbolToCurrentScope(name, typeName, "",ctx.getStart().getLine());
        Symbol symbol = new Symbol(name, typeName, "", SymbolTable.currentScope.getName(),ctx.getStart().getLine());
        SymbolTable.getSymbols().add(symbol);
        return new Parameter(name, type);    }

    @Override
    public AST visitMethodBody(TypeScripteParser.MethodBodyContext ctx) {
        MethodBody methodBody = new MethodBody();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i) != null) {
                AST statement = (AST) visit(ctx.statement(i));
                methodBody.addStatement(statement);
            }
        }
        return methodBody;    }

    @Override
    public AST visitType(TypeScripteParser.TypeContext ctx) {
        if (ctx.primitiveType() != null) {
            return (AST) visit(ctx.primitiveType());
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
    public AST visitPrimitiveType(TypeScripteParser.PrimitiveTypeContext ctx) {
        if (ctx.literal().NUMBER() != null) {
            return new PrimitiveType("number");
        } else if (ctx.MYSTRING() != null) {
            return new PrimitiveType("string");
        } else if (ctx.BOOLEAN() != null) {
            return new PrimitiveType("boolean");
        } else if (ctx.VOID() != null) {
            return new PrimitiveType("void");
        } else if (ctx.NULL() != null) {
            return new PrimitiveType("null");
        } else if (ctx.IDENTIFIER() != null) {
            return new PrimitiveType(ctx.IDENTIFIER().getText());
        }
        return null;    }
    @Override
    public AST visitArrayExpr(TypeScripteParser.ArrayExprContext ctx) {
        TypeScripteParser.ArrayLiteralContext innerCtx = ctx.arrayLiteral();

        insideArrayLiteral = true;
        ArrayLiteral arrayLiteral = new ArrayLiteral();
        for (int i = 0; i < innerCtx.expression().size(); i++) {
            if (innerCtx.expression(i) != null) {
                Expression element = (Expression) visit(innerCtx.expression(i));
                arrayLiteral.addElement(element);
            }
        }
        insideArrayLiteral = false;
        return arrayLiteral;
    }

    @Override
    public AST visitFunctionCallExpr(TypeScripteParser.FunctionCallExprContext ctx) {
        TypeScripteParser.FunctionCallContext innerCtx = ctx.functionCall();

        String functionName = innerCtx.getChild(0).getText();
        FunctionCall functionCall = new FunctionCall(functionName);
        List<String> arguments = new ArrayList<>();

        if (innerCtx.expression() != null) {
            for (int i = 0; i < innerCtx.expression().size(); i++) {
                Expression argument = (Expression) visit(innerCtx.expression(i));
                functionCall.addArgument(argument);
                arguments.add(argument.toString());

            }
        }
        for (int i = 0; i < innerCtx.DOT().size(); i++) {
            String chainedFunctionName = innerCtx.getChild(4 + i * 4).getText();
            FunctionCall chainedCall = new FunctionCall(chainedFunctionName);

            if (innerCtx.expression(i) != null) {
                for (int j = 0; j < innerCtx.expression().size(); j++) {
                    Expression chainedArgument = (Expression) visit(innerCtx.expression(j));
                    chainedCall.addArgument(chainedArgument);
                }
            }
            functionCall.addChainedCall(chainedCall);
        }
        SymbolTable.addSymbolToCurrentScope(functionName, "FunctionCall", "Arguments: " + arguments,innerCtx.getStart().getLine());

        return functionCall;    }

    @Override
    public AST visitArrowFunctionExpr(TypeScripteParser.ArrowFunctionExprContext ctx) {
        TypeScripteParser.ArrowFunctionContext innerCtx = ctx.arrowFunction();

        //System.out.println("Entering ArrowFunction Scope");
        SymbolTable.createScope("ArrowFunction Scope");
        ParameterList parameterList = null;
        if (innerCtx.parameterList() != null) {
            parameterList = (ParameterList) visit(innerCtx.parameterList());
        } else {
            parameterList = new ParameterList();
        }

        Expression expression = null;
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
    public AST visitOperationExpr(TypeScripteParser.OperationExprContext ctx) {
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
    public AST visitAssignmentExpr(TypeScripteParser.AssignmentExprContext ctx) {
        TypeScripteParser.AssignmentExpressionContext innerCtx = ctx.assignmentExpression();
        PropertyAccess propertyAccess = (PropertyAccess) visit(innerCtx.propertyAccess());
        Expression expression = (Expression) visit(innerCtx.expression());
        return new AssignmentExpression(propertyAccess, expression);    }

    @Override
    public AST visitPropertyAccessExpr(TypeScripteParser.PropertyAccessExprContext ctx) {
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
    public AST visitLiteral(TypeScripteParser.LiteralContext ctx) {
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
    public AST visitPropertyAssignment(TypeScripteParser.PropertyAssignmentContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        Expression value = (Expression) visit(ctx.expression());
        if (!insideArrayLiteral) {
            SymbolTable.addSymbolToCurrentScope(key, "", value.toString(), ctx.getStart().getLine());

        }
        return new PropertyAssignment(key, value);
    }




    @Override
    public Object visitCompleteElement(TypeScripteParser.CompleteElementContext ctx) {
        return super.visitCompleteElement(ctx);
    }

    @Override
    public Object visitSelfClosingElement(TypeScripteParser.SelfClosingElementContext ctx) {
        return super.visitSelfClosingElement(ctx);
    }


    @Override
    public Object visitOpenTag(TypeScripteParser.OpenTagContext ctx) {
        return super.visitOpenTag(ctx);
    }

    @Override
    public Object visitClosedTag(TypeScripteParser.ClosedTagContext ctx) {
        return super.visitClosedTag(ctx);
    }

    @Override
    public Object visitAngularExpression(TypeScripteParser.AngularExpressionContext ctx) {
        return super.visitAngularExpression(ctx);
    }

    @Override
    public Object visitNormalAttr(TypeScripteParser.NormalAttrContext ctx) {
        return super.visitNormalAttr(ctx);
    }

    @Override
    public Object visitBindingAttr(TypeScripteParser.BindingAttrContext ctx) {
        return super.visitBindingAttr(ctx);
    }

    @Override
    public Object visitDirectiveAttr(TypeScripteParser.DirectiveAttrContext ctx) {
        return super.visitDirectiveAttr(ctx);
    }

    @Override
    public Object visitEventAttr(TypeScripteParser.EventAttrContext ctx) {
        return super.visitEventAttr(ctx);
    }




}
