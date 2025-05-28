package ast;

public class PropertyAssignment extends Node {
    String name;
    Expression value;

    public PropertyAssignment(String name, Expression value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + ": " + value;
    }
}
