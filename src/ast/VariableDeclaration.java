package ast;

public class VariableDeclaration extends Node implements  Expression {
    public String name;
    public Expression value;

    public VariableDeclaration(String name, Expression value) {
        this.name = name;
        this.value = value;
    }
    @Override
    public String generate() {
        return "let " + name + " = " + ((Node) value).generate() + ";\n";
    }

    @Override
    public String toString() {
        return name + " = " + value;
    }
}
