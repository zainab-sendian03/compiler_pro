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
        StringBuilder sb = new StringBuilder();
        sb.append("let ").append(name);
        if (value != null) {
            sb.append(" = ").append(((Node) value).generate());
        }
        sb.append(";\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return name + " = " + value;
    }
}
