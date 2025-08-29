package ast;

public class PropertyAccess extends Node implements Expression {
    public String objectName;

    public PropertyAccess(String objectName, String propertyName) {
        this.objectName = objectName;
    }
    
    @Override
    public String generate() {
        return objectName;
    }

    @Override
    public String toString() {
        return objectName;
    }
}
