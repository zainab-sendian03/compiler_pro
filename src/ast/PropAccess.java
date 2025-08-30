package ast;

public class PropAccess extends Node implements Expression{
    public String objectName;
    public String propertyName;

    public PropAccess(String objectName, String propertyName) {
        this.objectName = objectName;
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        return objectName + "." + propertyName;
    }

    @Override
    public String generate() {
        return objectName + "." + propertyName;
    }
}
