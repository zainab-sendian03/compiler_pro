package ast;

import java.util.ArrayList;

public class ObjectLiteral  extends Node implements Expression {
    ArrayList<PropertyAssignment> properties;

    public ObjectLiteral() {
        this.properties = new ArrayList<>();
    }

    public void addProperty(PropertyAssignment property) {
        this.properties.add(property);
    }

    @Override
    public void add(Expression child) {

    }

    @Override
    public String toString() {
        return properties.toString()+ "\n";
    }
}
