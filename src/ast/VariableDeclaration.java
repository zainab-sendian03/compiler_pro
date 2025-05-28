package ast;

public class VariableDeclaration extends Node {
    String name;
    Type type;
    Expression value;

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Expression getValue() {
        return value;
    }

    public VariableDeclaration(String name, Type type, Expression value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return type + " " + name + " = " + value;
    }
}
