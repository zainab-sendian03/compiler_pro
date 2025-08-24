package ast;

public class Parameter extends Node {
    String name;
    Type type;

    public Parameter(String name, Type type) {
        this.name = name;
        this.type = type;
    }
    public Parameter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + type;
    }
}
