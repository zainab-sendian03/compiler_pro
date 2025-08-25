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
    public String generate() {
        if (typeName != null) {
            return typeName;
        } else if (unionTypes != null && !unionTypes.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < unionTypes.size(); i++) {
                sb.append(unionTypes.get(i).generate());
                if (i < unionTypes.size() - 1) {
                    sb.append(" | ");
                }
            }
            return sb.toString();
        }
        return "";
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
