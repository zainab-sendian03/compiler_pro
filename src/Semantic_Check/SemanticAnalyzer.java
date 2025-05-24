package Semantic_Check;

import SymbolTable.Scope;
import SymbolTable.Symbol;

import java.util.List;

public class SemanticAnalyzer {
    DuplicatePropertyDefinitionTable duplicateTable = new DuplicatePropertyDefinitionTable();

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

    public DuplicatePropertyDefinitionTable getDuplicateErrors() {
        return duplicateTable;
    }
}
