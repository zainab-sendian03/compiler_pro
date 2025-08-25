package Semantic_Check;

import java.util.ArrayList;

public class InvalidRouteNavigation {
    private final ArrayList<SemanticError> errors = new ArrayList<>();
    public void addError(SemanticError error) {
        errors.add(error);
    }

    public ArrayList<SemanticError> getErrors() {
        return errors;
    }

}
