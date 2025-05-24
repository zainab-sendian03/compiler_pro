package Semantic_Check;

import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;

import java.util.*;

public class SemanticAnalyzer {
    DuplicatePropertyDefinitionTable duplicateTable = new DuplicatePropertyDefinitionTable();
    MismatchTypeOfPropertyTable mismatchTypeOfPropertyTable = new MismatchTypeOfPropertyTable();
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
    public void analyzeAll(List<Scope> scopes) {
        checkDuplicateProperties(scopes);
        checkMismatchType();
        printErrorsGrouped();
    }
    public void printErrorsGrouped() {

        System.out.println("=== Duplicate Property Definition Errors ===");
        for (SemanticError error : duplicateTable.getErrors()) {
            System.out.println(error.toString());
        }

        System.out.println("\n=== Mismatch Type of Property ===");
        for (SemanticError error : mismatchTypeOfPropertyTable.getErrors()) {
            System.out.println(error.toString());
        }
    }
}

