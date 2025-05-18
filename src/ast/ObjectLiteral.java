package ast;

import java.util.ArrayList;

public class ObjectLiteral extends Expression {
    ArrayList<PropertyAssignment> properties;

    public ObjectLiteral() {
        this.properties = new ArrayList<>();
    }

    public void addProperty(PropertyAssignment property) {
        this.properties.add(property);
    }

    @Override
    public String toString() {
        return properties.toString()+ "\n";
    }
}
