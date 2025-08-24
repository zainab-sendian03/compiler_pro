package ast;

public class PropertyAccess extends Node implements Expression {
    public String objectName;
    public String propertyName;

    public PropertyAccess(String objectName, String propertyName) {
        this.objectName = objectName;
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        return objectName + "." + propertyName;
    }
}

