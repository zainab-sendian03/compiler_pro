package Visitor;


import Semantic_Check.SemanticCheck;
import SymbolTable.SymbolTable;
import SymbolTable.Symbol;

import ast.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;


public class BaseVisito extends TypeScripteParserBaseVisitor {
    SymbolTable symbolTable = new SymbolTable();
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
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.setSymbolTable(symbolTable);
        boolean ok = semanticCheck.check();
        if (!ok) {
            System.err.println("Semantic errors found:");
            for (String err : semanticCheck.getSemanticErrors()) {
                System.err.println(err);
            }
        }
        return program;
    }

    @Override
    public Node visitCompleteTag(TypeScripteParser.CompleteTagContext ctx) {
        CompleteTag completeTag = new CompleteTag(null, new ArrayList<>(), null);

        if (ctx.openTag() != null) {
            completeTag.setOpenTag((OpenTag) visit(ctx.openTag()));

        }
        String currentTagName = completeTag.getOpenTag() != null
                ? completeTag.getOpenTag().getTagName()
                : "Unknown";
        scopeStack.push(currentTagName);
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.getChild(i) != null) {

                if (ctx.getChild(i) instanceof TypeScripteParser.ElementContext) {
                    completeTag.getChildren().add((Node) visit(ctx.getChild(i)));
                } else if (ctx.getChild(i) instanceof TypeScripteParser.AngularExpressionContext) {
                    completeTag.getChildren().add((Node) visit(ctx.getChild(i)));
                }
            }
        }
        if (ctx.closedTag() != null) {
            completeTag.setClosedTag((ClosedTag) visit(ctx.closedTag()));
        }

        scopeStack.pop();
        return completeTag;
    }

    @Override
    public Node visitSelfClosingTag(TypeScripteParser.SelfClosingTagContext ctx) {
        SelfClosingTag selfTag = new SelfClosingTag(null, new ArrayList<>());
        String tagName = ctx.TAG_NAME().getText();
        selfTag.setTagName(tagName);
        scopeStack.push(tagName);
        for (int i = 0; i < ctx.content().size(); i++) {
            if (ctx.content(i) != null) {

                selfTag.getAttributes().add((ContentNode) visit(ctx.content(i)));
            }
        }
        String parentScope = scopeStack.size() > 1 ? scopeStack.get(scopeStack.size() - 2) : "Global";
        Symbol s = new Symbol(tagName, "Tag", null, parentScope);
        SymbolTable.getSymbols().add(s);

        scopeStack.pop();
        return selfTag;
    }


    @Override
    public OpenTag visitOpenTag(TypeScripteParser.OpenTagContext ctx) {
        OpenTag oTag = new OpenTag(null, new ArrayList<>());

        String tagName = ctx.TAG_NAME().getText();
        scopeStack.push(tagName);
        oTag.setTagName(tagName);
        for (int i = 0; i < ctx.content().size(); i++) {
            if (ctx.content(i) != null) {
                oTag.getAttributes().add((ContentNode) visit(ctx.content(i)));
            }
        }
        String parentScope = scopeStack.size() > 1 ? scopeStack.get(scopeStack.size() - 2) : "Global";
        Symbol ss = new Symbol(tagName, "Tag", null, parentScope);
        SymbolTable.getSymbols().add(ss);

        scopeStack.pop();
        return oTag;
    }

    @Override
    public ClosedTag visitClosedTag(TypeScripteParser.ClosedTagContext ctx) {
        ClosedTag cTag = new ClosedTag(null);
        String tagName = ctx.TAG_NAME().getText();
        cTag.setTagName(tagName);
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
    public ContentNode visitNormalAttribute(TypeScripteParser.NormalAttributeContext ctx) {
        NormalAttribute bAtt = new NormalAttribute(null, null);
        String name = ctx.IDENTIFIER().getText();
        String value = ctx.STRING().getText();
        value = value.substring(1, value.length() - 1);
        bAtt.setName(name);
        bAtt.setValue(value);
        String currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
        Symbol ssss = new Symbol(name, "NormalAttribute", value, currentScope);
        SymbolTable.getSymbols().add(ssss);

        return bAtt;
    }

    @Override
    public ContentNode visitBindingAttribute(TypeScripteParser.BindingAttributeContext ctx) {
        BindingAttribute dAtt = new BindingAttribute(null, null);

        String name = ctx.IDENTIFIER().getText();
        String value = ctx.STRING().getText();
        value = value.substring(1, value.length() - 1);
        dAtt.setName(name);
        dAtt.setValue(value);
        String currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
        Symbol sssss = new Symbol(name, "BindingAttribute", value, currentScope);
        SymbolTable.getSymbols().add(sssss);
        return dAtt;
    }

    @Override
    public ContentNode visitDirevtiveAttribute(TypeScripteParser.DirevtiveAttributeContext ctx) {
        DirectiveAttribute dAtt = new DirectiveAttribute(null, null);

        String name = ctx.IDENTIFIER().getText();
        String value = ctx.STRING().getText();
        value = value.substring(1, value.length() - 1);
        dAtt.setName(name);
        dAtt.setValue(value);
        String currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
        Symbol sssss = new Symbol(name, "DirectiveAttribute", value, currentScope);
        SymbolTable.getSymbols().add(sssss);
        return dAtt;
    }


    @Override
    public ContentNode visitEventAttribute(TypeScripteParser.EventAttributeContext ctx) {

        EventAttribute eAtt = new EventAttribute(null, null);
        String name = ctx.IDENTIFIER().getText();
        String value = ctx.STRING().getText();
        value = value.substring(1, value.length() - 1);
        eAtt.setName(name);
        eAtt.setValue(value);
        String currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
        Symbol ssssss = new Symbol(name, "EventAttribute", value, currentScope);
        SymbolTable.getSymbols().add(ssssss);
        return eAtt;
    }

    @Override
    public AST visitImportStatement(TypeScripteParser.ImportStatementContext ctx) {
        String module;

        if (ctx.STRING() != null) {
            module = ctx.STRING().getText().replace("\"", "").replace("'", "");
        } else if (ctx.getText().contains("Component")) {
            module = "Component";
        } else {
            throw new IllegalArgumentException("Invalid import statement: " + ctx.getText());
        }

        ImportStatement importStatement = new ImportStatement(module);

        for (int i = 0; i < ctx.children.size(); i++) {
            String text = ctx.getChild(i).getText();
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
    public AST visitComponentDeclaration(TypeScripteParser.ComponentDeclarationContext ctx) {
        //System.out.println("Entering Component Scope");
        SymbolTable.createScope("Component Scope");
        ComponentBody componentBody = (ComponentBody) visit(ctx.componentBody());
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        componentDeclaration.setComponentBody(componentBody);
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting Program Scope");
        return componentDeclaration;
    }

    @Override
    public AST visitComponentBody(TypeScripteParser.ComponentBodyContext ctx) {
        ComponentBody componentBody = new ComponentBody();
        for (TypeScripteParser.FieldContext fieldContext : ctx.field()) {
            Field field = (Field) visit(fieldContext);
            componentBody.addField(field);
        }

        return componentBody;
    }

    @Override
    public AST visitSelectorField(TypeScripteParser.SelectorFieldContext ctx){
        String selctor = ctx.STRING().getText();
        SymbolTable.addSymbolToCurrentScope("selctor", "String", selctor);
        Symbol symbol = new Symbol("selctor", "String", selctor, SymbolTable.currentScope.getName());
        SymbolTable.getSymbols().add(symbol);
        return new SelectorField(selctor);

    }

    @Override
    public AST visitStandaloneFld(TypeScripteParser.StandaloneFldContext ctx) {
        String standalone = ctx.TRUE() != null ? ctx.TRUE().getText() : ctx.FALSE().getText();
        SymbolTable.addSymbolToCurrentScope("standalone", "boolean", standalone);
        Symbol symbol = new Symbol("standalone", "boolean", standalone, SymbolTable.currentScope.getName());
        SymbolTable.getSymbols().add(symbol);
        return new StandalongField(standalone);
    }

    @Override
    public AST visitImportsFld(TypeScripteParser.ImportsFldContext ctx) {
        ImportsField importsField = new ImportsField();
        String id = ctx.getText();
        importsField.addImport(id);
        SymbolTable.addSymbolToCurrentScope(id, "imports", id);
        Symbol symbol = new Symbol(id, "imports", id, SymbolTable.currentScope.getName());
        SymbolTable.getSymbols().add(symbol);

        return importsField;
    }

    @Override
    public AST visitTemplateFld(TypeScripteParser.TemplateFldContext ctx) {
        if (ctx == null) {
            System.out.println("TemplateFieldContext is null");
            return null;
        }
        String templateString = ctx.BACKTICK(0).getText();
        List<Node> elements = ctx.element().stream()
                .map(elementCtx -> {
                    if (elementCtx == null) {
                        System.out.println("Null element in template");
                        return null;
                    }
                    return (Node) visit(elementCtx);
                })
                .collect(Collectors.toList());
        SymbolTable.addSymbolToCurrentScope("Template", "String", "");
        Symbol symbol = new Symbol("Template", "String", "", SymbolTable.currentScope.getName());
        SymbolTable.getSymbols().add(symbol);
        return new TemplateField(templateString, elements);
    }

    @Override
    public AST visitOtherFlds(TypeScripteParser.OtherFldsContext ctx) {
        String fieldName = ctx.getText();
        Expression expression = (Expression) visit(ctx.expression());
        SymbolTable.addSymbolToCurrentScope(fieldName, fieldName, expression.toString());
        Symbol symbol = new Symbol(fieldName, fieldName, expression.toString(), SymbolTable.currentScope.getName());
        SymbolTable.getSymbols().add(symbol);
        return new OtherField(fieldName, expression);
    }

    @Override
    public Object visitField(TypeScripteParser.FieldContext ctx) {
        if (ctx.importsField() != null) {
            return visitImportsField(ctx.importsField());
        }
        if (ctx.standaloneField() != null) {
            return visitStandaloneField(ctx.standaloneField());
        }
        if (ctx.selectorField() != null) {
            return visitSelectorField(ctx.selectorField());
        }
        if (ctx.templateField() != null) {
            return visitTemplateField(ctx.templateField());
        } else {
            return visitOtherFields(ctx.otherFields());
        }
    }

//    @Override
//    public AST visitSelectorField(TypeScripteParser.SelectorFieldContext ctx) {
//        String selctor = ctx.STRING().getText();
//        SymbolTable.addSymbolToCurrentScope("selctor", "String", selctor);
//        Symbol symbol = new Symbol("selctor", "String", selctor, SymbolTable.currentScope.getName());
//        SymbolTable.getSymbols().add(symbol);
//        return new SelectorField(selctor);
//
//    }

//    @Override
//    public AST visitTemplateField(TypeScripteParser.TemplateFieldContext ctx) {
//        if (ctx == null) {
//            System.out.println("TemplateFieldContext is null");
//            return null;
//        }
//        String templateString = ctx.BACKTICK(0).getText();
//        List<Node> elements = ctx.element().stream()
//                .map(elementCtx -> {
//                    if (elementCtx == null) {
//                        System.out.println("Null element in template");
//                        return null;
//                    }
//                    return (Node) visit(elementCtx);
//                })
//                .collect(Collectors.toList());
//        SymbolTable.addSymbolToCurrentScope("Template", "String", "");
//        Symbol symbol = new Symbol("Template", "String", "", SymbolTable.currentScope.getName());
//        SymbolTable.getSymbols().add(symbol);
//        return new TemplateField(templateString, elements);
//    }

    @Override
    public Node visitElement(TypeScripteParser.ElementContext ctx) {
        if (ctx.completeTag() != null) {
            return visitCompleteTag(ctx.completeTag());
        }
        if (ctx.selfClosingTag() != null) {
            return visitSelfClosingTag(ctx.selfClosingTag());
        }
        return null;
    }

//    @Override
//    public AST visitImportsField(TypeScripteParser.ImportsFieldContext ctx) {
//        ImportsField importsField = new ImportsField();
//            String id = ctx.getText();
//            importsField.addImport(id);
//            SymbolTable.addSymbolToCurrentScope(id, "imports", id);
//            Symbol symbol = new Symbol(id, "imports", id, SymbolTable.currentScope.getName());
//            SymbolTable.getSymbols().add(symbol);
//
//        return importsField;
//    }

//    @Override
//    public AST visitStandaloneField(TypeScripteParser.StandaloneFieldContext ctx) {
//        String standalone = ctx.TRUE() != null ? ctx.TRUE().getText() : ctx.FALSE().getText();
//        SymbolTable.addSymbolToCurrentScope("standalone", "boolean", standalone);
//        Symbol symbol = new Symbol("standalone", "boolean", standalone, SymbolTable.currentScope.getName());
//        SymbolTable.getSymbols().add(symbol);
//        return new StandalongField(standalone);
//    }

//    @Override
//    public AST visitOtherFields(TypeScripteParser.OtherFieldsContext ctx) {
//        String fieldName = ctx.getText();
//        Expression expression = (Expression) visit(ctx.expression());
//        SymbolTable.addSymbolToCurrentScope(fieldName, fieldName, expression.toString());
//        Symbol symbol = new Symbol(fieldName, fieldName, expression.toString(), SymbolTable.currentScope.getName());
//        SymbolTable.getSymbols().add(symbol);
//        return new OtherField(fieldName, expression);
//    }

    @Override
    public AST visitClassDeclaration(TypeScripteParser.ClassDeclarationContext ctx) {
        //System.out.println("Entering Class Scope");
        SymbolTable.createScope("Class Scope");
        String name = ctx.IDENTIFIER().getText();
        ClassDeclaration classDeclaration = new ClassDeclaration(name);
        if (ctx.classBody() != null) {
            ClassBody classBody = (ClassBody) visit(ctx.classBody());
            for (AST member : classBody.members) {
                classDeclaration.addBody(member);
            }
        }
        SymbolTable.addSymbolToCurrentScope(name, "Class", "");
        Symbol symbol = new Symbol(name, "Class", "", SymbolTable.currentScope.getName());
        SymbolTable.getSymbols().add(symbol);
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting Program Scope");
        return classDeclaration;
    }

    @Override
    public AST visitClassBody(TypeScripteParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) != null) {
                AST members = (AST) visit(ctx.children.get(i));
                if (members != null) {
                    classBody.addMember(members);
                }
            }
        }
        return classBody;
    }

    @Override
    public AST visitPropertyDeclaration(TypeScripteParser.PropertyDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Type type = ctx.type() != null ? new Type(ctx.type().getText()) : null;
        Expression value = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;

        SymbolTable.addSymbolToCurrentScope(name,"", value.toString());
        Symbol symbol = new Symbol(name, "", value.toString(), SymbolTable.currentScope.getName());
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
        SymbolTable.addSymbolToCurrentScope(name, "Function", type.getTypeName());
        Symbol symbol = new Symbol(name, "Function", type.getTypeName(), SymbolTable.currentScope.getName());
        SymbolTable.getSymbols().add(symbol);
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting Program Scope");
        return new MethodDeclaration(name, parameterList, type, methodBody);

    }

    @Override
    public AST visitParameterList(TypeScripteParser.ParameterListContext ctx) {
        ParameterList parameterList = new ParameterList();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter(i) != null) {
                Parameter parameter = (Parameter) visit(ctx.parameter(i));
                parameterList.addParameter(parameter);
            }
        }
        return parameterList;
    }


    @Override
    public AST visitParameter(TypeScripteParser.ParameterContext ctx) {
        String name = (ctx.IDENTIFIER() != null) ? ctx.IDENTIFIER().getText() : "undefined";
        String typeName = (ctx.type() != null) ? ctx.type().getText() : "undefined";
        Type type = new Type(typeName);

        SymbolTable.addSymbolToCurrentScope(name, typeName, "");
        Symbol symbol = new Symbol(name, typeName, "", SymbolTable.currentScope.getName());
        SymbolTable.getSymbols().add(symbol);
        return new Parameter(name, type);
    }

    @Override
    public AST visitMethodBody(TypeScripteParser.MethodBodyContext ctx) {
        MethodBody methodBody = new MethodBody();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i) != null) {
                AST statement = (AST) visit(ctx.statement(i));
                methodBody.addStatement(statement);
            }
        }
        return methodBody;
    }

    @Override
    public AST visitType(TypeScripteParser.TypeContext ctx) {
        if (ctx.primitiveType() != null) {
            return (AST) visit(ctx.primitiveType());
        }

        if (ctx.PIPE() != null) {
            Type leftType = (Type) visit(ctx.primitiveType());
            Type rightType = (Type) visit(ctx.type());

            List<Type> unionTypes = new ArrayList<>();
            if (leftType instanceof Type && leftType.getUnionTypes() != null) {
                unionTypes.addAll(leftType.getUnionTypes());
            } else {
                unionTypes.add(leftType);
            }

            if (rightType instanceof Type && rightType.getUnionTypes() != null) {
                unionTypes.addAll(rightType.getUnionTypes());
            } else {
                unionTypes.add(rightType);
            }

            return new Type(unionTypes);
        }

        return null;
    }

    @Override
    public AST visitPrimitiveType(TypeScripteParser.PrimitiveTypeContext ctx) {
        if (ctx.NUMBER() != null) {
            return new PrimitiveType("number");
        } else if (ctx.STRING() != null) {
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
        return null;
    }

    @Override
    public AST visitExpression(TypeScripteParser.ExpressionContext ctx) {
        if (ctx == null) {
            System.out.println("Visiting an empty or null expression");
            return null;
        }
        if (ctx.literal() != null) {
            return (AST) visitLiteral(ctx.literal());
        }
        if (ctx.arrayLiteral() != null) {
            return (AST) visitArrayLiteral(ctx.arrayLiteral());
        }
        if (ctx.objectLiteral() != null) {
            return (AST) visitObjectLiteral(ctx.objectLiteral());
        }
        if (ctx.functionCall() != null) {
            return (AST) visitFunctionCall(ctx.functionCall());
        }
        if (ctx.arrowFunction() != null) {
            return (AST) visitArrowFunction(ctx.arrowFunction());
        }
        if (ctx.operation() != null) {
            return (AST) visitOperation(ctx.operation());
        }
        if (ctx.assignmentExpression() != null) {
            return (AST) visitAssignmentExpression(ctx.assignmentExpression());
        }
        if (ctx.propertyAccess() != null) {
            return (AST) visitPropertyAccess(ctx.propertyAccess());
        }
        throw new UnsupportedOperationException("Unsupported expression type: " + ctx.getText());
    }

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
        throw new UnsupportedOperationException("Unknown literal type: " + ctxText);
    }

    @Override
    public AST visitArrayLiteral(TypeScripteParser.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral = new ArrayLiteral();
        for (int i = 0; i < ctx.expression().size(); i++) {
            if (ctx.expression(i) != null) {
                Expression element = (Expression) visit(ctx.expression(i));
                arrayLiteral.addElement(element);
            }
        }
        return arrayLiteral;
    }

    @Override
    public AST visitObjectLiteral(TypeScripteParser.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral();
        for (int i = 0; i < ctx.propertyAssignment().size(); i++) {
            PropertyAssignment property = (PropertyAssignment) visit(ctx.propertyAssignment(i));
            objectLiteral.addProperty(property);
        }
        return objectLiteral;
    }


    @Override
    public AST visitPropertyAssignment(TypeScripteParser.PropertyAssignmentContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        Expression value = (Expression) visit(ctx.expression());
        SymbolTable.addSymbolToCurrentScope(key, "String", value.toString());
        Symbol symbol = new Symbol(key, "String", value.toString(), SymbolTable.currentScope.getName());
        SymbolTable.getSymbols().add(symbol);
        return new PropertyAssignment(key, value);
    }

    @Override
    public AST visitFunctionCall(TypeScripteParser.FunctionCallContext ctx) {
        String functionName = ctx.getChild(0).getText();
        FunctionCall functionCall = new FunctionCall(functionName);
        List<String> arguments = new ArrayList<>();

        if (ctx.expression() != null) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                Expression argument = (Expression) visit(ctx.expression(i));
                functionCall.addArgument(argument);
                arguments.add(argument.toString());

            }
        }
        for (int i = 0; i < ctx.DOT().size(); i++) {
            String chainedFunctionName = ctx.getChild(4 + i * 4).getText();
            FunctionCall chainedCall = new FunctionCall(chainedFunctionName);

            if (ctx.expression(i) != null) {
                for (int j = 0; j < ctx.expression().size(); j++) {
                    Expression chainedArgument = (Expression) visit(ctx.expression(j));
                    chainedCall.addArgument(chainedArgument);
                }
            }
            functionCall.addChainedCall(chainedCall);
        }
        SymbolTable.addSymbolToCurrentScope(functionName, "FunctionCall", "Arguments: " + arguments);

        return functionCall;
    }


    @Override
    public AST visitArrowFunction(TypeScripteParser.ArrowFunctionContext ctx) {
        //System.out.println("Entering ArrowFunction Scope");
        SymbolTable.createScope("ArrowFunction Scope");
        ParameterList parameterList = null;
        if (ctx.parameterList() != null) {
            parameterList = (ParameterList) visit(ctx.parameterList());
        } else {
            parameterList = new ParameterList();
        }

        Expression expression = null;
        if (ctx.expression() != null) {
            expression = (Expression) visit(ctx.expression());
        } else {
            expression = new Literal("default expression");
        }
        SymbolTable.addSymbolToCurrentScope("ArrowFunction", "Function", "Parameters: " + parameterList.toString());

        SymbolTable.endCurrentScope();
        //System.out.println("Exiting ArrowFunction Scope");
        return new ArrowFunction(parameterList, expression);
    }


    @Override
    public AST visitOperation(TypeScripteParser.OperationContext ctx) {
        if (ctx.PLUS() != null || ctx.MINUS() != null || ctx.SLASH() != null || ctx.STAR() != null || ctx.MOD() != null || ctx.CLOSED_SYMBOL() != null || ctx.lt() != null) {
            String operator = ctx.getChild(1).getText();
            Expression left = new Identifier(ctx.IDENTIFIER().getText());

            Expression right = null;
            if (ctx.expression() != null) {
                right = (Expression) visit(ctx.expression());
            }

            return new Operation(left, operator, right);
        } else if ((ctx.PLUS() != null && ctx.getChild(2).getText().equals("+")) ||
                (ctx.MINUS() != null && ctx.getChild(2).getText().equals("-"))) {
            Expression identifier = new Identifier(ctx.IDENTIFIER().getText());
            String operator = ctx.getChild(1).getText() + ctx.getChild(2).getText();
            return new Operation(identifier, operator, null);
        } else {
            throw new IllegalArgumentException("Invalid operation");
        }
    }

    @Override
    public AST visitAssignmentExpression(TypeScripteParser.AssignmentExpressionContext ctx) {
        PropertyAccess propertyAccess = (PropertyAccess) visit(ctx.propertyAccess());
        Expression expression = (Expression) visit(ctx.expression());
        return new AssignmentExpression(propertyAccess, expression);

    }

    @Override
    public AST visitPropertyAccess(TypeScripteParser.PropertyAccessContext ctx) {
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

        return new PropertyAccess(objectName, propertyChain.toString());
    }


    @Override
    public AST visitExpressionStatement(TypeScripteParser.ExpressionStatementContext ctx) {
        Expression expression = (Expression) visit(ctx.expression());
        return new ExpressionStatement(expression);
    }

    @Override
    public AST visitForLoop(TypeScripteParser.ForLoopContext ctx) {

        VariableDeclaration init = null;
        if (ctx.variableDeclaration() != null) {
            init = (VariableDeclaration) visit(ctx.variableDeclaration());

        }
        Expression condition = null;
        if (ctx.expression(0) != null) {
            condition = (Expression) visit(ctx.expression(0));
        }

        Expression operation = null;
        if (ctx.expression(1) != null) {
            operation = (Expression) visit(ctx.expression(1));
        }
        ForLoop forLoop = new ForLoop(init, condition, operation);
        //System.out.println("Entering ForLoop Scope");
        SymbolTable.createScope("ForLoop Scope");
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i) != null) {
                AST bodyStatement = (AST) visit(ctx.statement(i));
                forLoop.addBodyStatement(bodyStatement);
            }
        }
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting ForLoop Scope");
        return forLoop;
    }

    @Override
    public AST visitIfStatement(TypeScripteParser.IfStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());
        //System.out.println("Entering If Scope");
        SymbolTable.createScope("If Scope");
        SymbolTable.addSymbolToCurrentScope("Condition", "Boolean", condition.toString());

        Statement ifBodyAST = (Statement) visit(ctx.statement(0));
        SymbolTable.endCurrentScope();
        //System.out.println("Exiting ForLoop Scope");
        Statement elseBodyAST = null;
        if (ctx.ELSE() != null) {
            //System.out.println("Entering Else Scope");
            SymbolTable.createScope("Else Scope");
            elseBodyAST = (Statement) visit(ctx.statement(1));
            SymbolTable.endCurrentScope();
            //System.out.println("Exiting ForLoop Scope");
        }

        return new IfStatement(condition, ifBodyAST, elseBodyAST);
    }


    @Override
    public AST visitVariableDeclaration(TypeScripteParser.VariableDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String typeName = ctx.getChild(0).getText();
        Type type = new Type(typeName);
        Expression expression = (Expression) visit(ctx.expression());

        // معالجة القيمة النصية (String)
        String rawValue = expression.toString();
        if (ctx.expression().getText().startsWith("\"") && ctx.expression().getText().endsWith("\"")) {
            rawValue = "\"" + rawValue + "\"";
        }

        SymbolTable.addSymbolToCurrentScope(name, typeName, rawValue);
        Symbol symbol = new Symbol(name, typeName, rawValue, SymbolTable.currentScope.getName());
        SymbolTable.getSymbols().add(symbol);

        return new VariableDeclaration(name, type, expression);
    }




    @Override
    public AST visitStatement(TypeScripteParser.StatementContext ctx) {
        if (ctx.importStatement() != null) {
            return visitImportStatement(ctx.importStatement());
        }
        if (ctx.componentDeclaration() != null) {
            return visitComponentDeclaration(ctx.componentDeclaration());
        }
        if (ctx.variableDeclaration() != null) {
            return visitVariableDeclaration(ctx.variableDeclaration());
        }
        if (ctx.objectLiteral() != null) {
            return visitObjectLiteral(ctx.objectLiteral());
        }
        if (ctx.expressionStatement() != null) {
            return visitExpressionStatement(ctx.expressionStatement());
        }
        if (ctx.classDeclaration() != null) {
            return visitClassDeclaration(ctx.classDeclaration());
        }
        if (ctx.forLoop() != null) {
            return visitForLoop(ctx.forLoop());
        }
        if (ctx.ifStatement() != null) {
            return visitIfStatement(ctx.ifStatement());
        }
        throw new UnsupportedOperationException("Unsupported Statement type: " + ctx.getText());
    }
}
