package Semantic_Check;


import java.util.ArrayList;

public class DuplicatePropertyDefinitionTable {
    private final ArrayList<SemanticError> errors = new ArrayList<>();

    public void addError(SemanticError error) {
        errors.add(error);
    }

    public ArrayList<SemanticError> getErrors() {
        return errors;
    }

    public void printErrors() {
        System.out.println("=== Duplicate Property Definition Errors ===");
        if (!errors.isEmpty()) {
            for (SemanticError error : errors) {
                System.err.println(error);
            }
        }
    }
}
