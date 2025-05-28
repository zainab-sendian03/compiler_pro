package ast;

import java.util.List;

public class Type extends Node {
    private String typeName;
    private List<Type> unionTypes;

    public Type(String typeName) {
        this.typeName = typeName;
    }

    public Type(List<Type> unionTypes) {
        this.unionTypes = unionTypes;
    }

    @Override
    public String toString() {
        if (unionTypes != null && !unionTypes.isEmpty()) {
            return "Type{" +
                    "unionTypes=" + unionTypes +
                    '}';
        } else {
            return "Type{" +
                    "typeName='" + typeName + '\'' +
                    '}';
        }
    }

    // Getter methods
    public String getTypeName() {
        return typeName;
    }

    public List<Type> getUnionTypes() {
        return unionTypes;
    }
}
