    package Semantic_Check;

    import SymbolTable.Scope;
    import SymbolTable.Symbol;
    import SymbolTable.SymbolTable;
    import static Main.Main.logger;

    import java.util.*;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class SemanticAnalyzer {
        DuplicatePropertyDefinitionTable duplicateTable = new DuplicatePropertyDefinitionTable();
    MismatchTypeOfPropertyTable mismatchTypeOfPropertyTable = new MismatchTypeOfPropertyTable();
        InvalidDirectiveExpression directiveTable =new InvalidDirectiveExpression();
        InvalidEventCall eventTable =new InvalidEventCall();
        MismatchedTagError tagsTable = new MismatchedTagError();
        private static final Map<String, String> predefinedTypes = new HashMap<>();
        static {
            predefinedTypes.put("selector", "String");
            predefinedTypes.put("standalone", "boolean");
            predefinedTypes.put("template", "String");
            predefinedTypes.put("imports", "Array");
        }
        public void checkDuplicateProperties(List<Scope> scopes) {
            for (Scope scope : scopes) {
                List<Symbol> symbols = scope.getSymbols();
                for (int i = 0; i < symbols.size(); i++) {
                    for (int j = i + 1; j < symbols.size(); j++) {
                        if (symbols.get(i).getName().equals(symbols.get(j).getName())) {
                            SemanticError error = new SemanticError(
                                    "Duplicate property '" + symbols.get(i).getName() + "' in scope '" + scope.getName() + "'", symbols.get(i).getName(),
                                    scope.getName(),symbols.get(i).getLineNumber()
                            );
                            duplicateTable. addError(error);
                        }
                    }
                }
            }
        }
        public void checkMismatchType(){
        for (Symbol symbol : SymbolTable.getSymbols()) {
            String type = symbol.getType();
            String expectedType = predefinedTypes.get(symbol.getName());
            if (expectedType != null && !type.equals(expectedType)) {
                SemanticError error = new SemanticError(
                        "Mismatch type for '" + symbol.getName() + "' in scope '" + symbol.getScope() +
                                "': expected '" + expectedType + "' but got '" + type + "'",
                        symbol.getName(),
                        symbol.getScope(),
                        symbol.getLineNumber()
                );
                mismatchTypeOfPropertyTable.addError(error);
            }
        }

        }
        public void checkInvalidDirectiveExpressions(List<Symbol> symbols) {


            for (Symbol directive : symbols) {
                if (directive.getType().equals("DirectiveAttribute") &&
                        (directive.getName().equals("ngIf") || directive.getName().equals("ngFor"))) {

                    String expression = directive.getValue();
                    String variableToCheck = null;

                    if (directive.getName().equals("ngIf")) {
                        if ((expression.startsWith("\"") && expression.endsWith("\"")) ||
                                (expression.startsWith("'") && expression.endsWith("'"))) {
                            expression = expression.substring(1, expression.length() - 1);
                        }
                        Pattern pattern = Pattern.compile("\\b[a-zA-Z_][a-zA-Z0-9_]*\\b");
                        Matcher matcher = pattern.matcher(expression);
                        if (matcher.find()) {
                            variableToCheck = matcher.group();
                        }

                    } else if (directive.getName().equals("ngFor")) {

                        Pattern pattern = Pattern.compile("of\\s+([\\w\\.]+)");
                        Matcher matcher = pattern.matcher(expression);
                        if (matcher.find()) {
                            variableToCheck = matcher.group(1);
                        }
                    }
                    if (variableToCheck != null) {
                        boolean found = false;
                        for (Symbol symbol : symbols) {
                            if (symbol.getName().equals(variableToCheck)
                                    && symbol.getScope().equals("Class Scope")) {
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            String message = "Directive '" + directive.getName() +
                                    "' uses undefined variable/expression: '" + variableToCheck + "'.";

                            SemanticError error = new SemanticError(
                                    message,
                                    directive.getName(),
                                    directive.getScope(),
                                    directive.getLineNumber()
                            );
                            directiveTable.addError(error);
                        }
                    }
                }
            }
        }
        public void checkInvalidEventCall(List<Symbol> symbols) {


            for (Symbol directive : symbols) {
                if (directive.getType().equals("EventAttribute")) {
                    String value = directive.getValue(); // مثل "selectItem(i)"
                    String functionName = null;

                    // استخراج اسم الدالة من القيمة (قبل أول قوس)
                    Pattern pattern = Pattern.compile("^\\s*([a-zA-Z_][a-zA-Z0-9_]*)\\s*\\(");
                    Matcher matcher = pattern.matcher(value);

                    if (matcher.find()) {
                        functionName = matcher.group(1); // مثلاً: selectItem
                    }

                    if (functionName != null) {
                        boolean found = false;

                        for (Symbol symbol : symbols) {
                            if (symbol.getType().equals("Function")
                                    && symbol.getName().equals(functionName)
                                    && symbol.getScope().equals("Function Scope")) {
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            SemanticError error = new SemanticError(
                                    "Calling undefined function: '" + functionName + "' from event '" + directive.getName() + "'",
                                    directive.getName(),
                                    directive.getScope(),
                                    directive.getLineNumber()
                            );
                            eventTable.addError(error);
                        }
                    }
                }
            }
        }
        public void checkTagMatching(List<Symbol> symbols) {
            Stack<Symbol> tagStack = new Stack<>();

            for (Symbol sym : symbols) {
                if (!"Tag".equals(sym.getType())) continue;

                switch (sym.getKind()) {
                    case "open":
                        tagStack.push(sym);
                        break;

                    case "close":
                        if (tagStack.isEmpty()) {
                            SemanticError error = new SemanticError(
                                    "Unexpected closing tag </" + sym.getName() + "> found with no matching opening tag.",
                                    sym.getName(),
                                    sym.getScope(),
                                    sym.getLineNumber());
                            tagsTable.addError(error);
                        } else {
                            Symbol top = tagStack.pop();
                            if (!top.getName().equals(sym.getName())) {
                                SemanticError error = new SemanticError(
                                        "Mismatched tag: expected closing </" + top.getName() + "> but found </" + sym.getName() + ">.",
                                        sym.getName(),
                                        sym.getScope(),
                                        sym.getLineNumber());
                                tagsTable.addError(error);
                            }
                        }
                        break;

                    case "selfClosing":
                        // Self-closing tag — no action needed
                        break;
                }
            }

            while (!tagStack.isEmpty()) {
                Symbol unclosed = tagStack.pop();
                SemanticError error = new SemanticError(
                        "Unclosed tag <" + unclosed.getName() + "> detected with no matching closing tag.",
                        unclosed.getName(),
                        unclosed.getScope(),
                        unclosed.getLineNumber());
                tagsTable.addError(error);
            }
        }



        public void analyzeAll(List<Scope> scopes,List<Symbol> symbols) {
            checkDuplicateProperties(scopes);
            checkMismatchType();
            checkInvalidDirectiveExpressions( symbols);
            checkInvalidEventCall( symbols);
            checkTagMatching( symbols);
            printErrorsGrouped();
        }
        public void printErrorsGrouped() {

            logger.warning("=== Duplicate Property Definition Errors ===");
            for (SemanticError error : duplicateTable.getErrors()) {
                logger.warning(error.toString());
            }

            logger.warning("\n=== Mismatch Type of Property ===");
            for (SemanticError error : mismatchTypeOfPropertyTable.getErrors()) {
                logger.warning(error.toString());
            }
            logger.warning("\n===  Invalid Directive Expression Errors ===");
            for (SemanticError error : directiveTable.getErrors()) {
                logger.warning(error.toString());
            }
            logger.warning("\n=== Invalid Event Call Errors ===");
            for (SemanticError error : eventTable.getErrors()) {
                logger.warning(error.toString());
            }
            logger.warning("\n=== Mismatched Tag Errors ===");
            for (SemanticError error : tagsTable.getErrors()) {
                logger.warning(error.toString());
            }
        }
    }

