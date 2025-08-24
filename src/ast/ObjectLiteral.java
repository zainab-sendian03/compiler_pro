package ast;

import java.util.ArrayList;

public class ObjectLiteral extends Node implements Expression {
    public ArrayList<PropertyAssignment> properties = new ArrayList<>();

    public void addProperty(PropertyAssignment pa) {
        properties.add(pa);
    }

    @Override
    public String toString() {
        return properties.toString();
    }
}
