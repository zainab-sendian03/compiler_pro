package ast;

public class MethodDeclaration extends Node {
    String name;
    ParameterList parameters;
    Type type;
    MethodBody body;

    public MethodDeclaration(String name, ParameterList parameters, Type type, MethodBody body) {
        this.name = name;
        this.parameters = parameters;
        this.type = type;
        this.body = body;
    }

    @Override
    public String toString() {
        return name + "(" + parameters + "): " + type + " " + body;
    }
}
