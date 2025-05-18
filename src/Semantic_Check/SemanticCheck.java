package Semantic_Check;


import SymbolTable.*;


import java.util.ArrayList;
import java.util.*;


public class SemanticCheck {
    SymbolTable symbolTable;
    private List<String> semanticErrors = new ArrayList<>();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    public List<String> getSemanticErrors() {
        return semanticErrors;
    }
    public boolean check() {
        semanticErrors.clear();

       checkDuplicateVariables();

            // تحقق من استخدام المتغيرات قبل تعريفها
        checkVariableUsageBeforeDeclaration();

        // تحقق من توافق الأنواع (type checking)
        checkTypeMatching();

        return semanticErrors.isEmpty();
    }
    private void checkDuplicateVariables() {
        for (Scope scope : SymbolTable.getScopes()) {
            Set<String> seen = new HashSet<>();
            for (Symbol symbol : scope.getSymbols()) {
                if (seen.contains(symbol.getName())) {
                    semanticErrors.add("Semantic Error: Variable '" + symbol.getName() + "' is defined more than once in scope '" + scope.getName() + "'");
                } else {
                    seen.add(symbol.getName());
                }
            }
        }
    }
    private void checkVariableUsageBeforeDeclaration() {
        for (Symbol symbol : SymbolTable.getSymbols()) {
            if (symbol.getValue() != null && !symbol.getValue().equals("null")) {
                if (symbol.getValue().startsWith("\"") && symbol.getValue().endsWith("\"")) {
                    continue;
                }
                for (String token : symbol.getValue().split("\\W+")) {
                    if (token.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                        boolean declared = SymbolTable.isDeclaredBefore(symbol.getScope(), token, symbol.getName());
                        if (!declared) {
                            semanticErrors.add("Semantic Error: Variable '" + token + "' used before declaration in scope '" + symbol.getScope() + "'");
                        }
                    }
                }
            }

        }}
    private void checkTypeMatching() {
        for (Symbol symbol : SymbolTable.getSymbols()) {
            if (symbol.getValue() != null && !symbol.getValue().equals("null")) {
                // بسيطة: لو القيمة عدد والتايب مو Number
                if (symbol.getValue().matches("\\d+") && !symbol.getType().equals("var")) {
                    semanticErrors.add("Semantic Error: Type mismatch for variable '" + symbol.getName() + "'. Expected " + symbol.getType() + " but got number.");
                }
            }
        }
    }

}
