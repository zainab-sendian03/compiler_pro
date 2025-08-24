package ast;

public class PropertyAccess extends Node implements Expression {
    public String objectName;
    public String propertyName;

    @Override
    public String toString() {
        return objectName + "." + propertyName;
    }
}

