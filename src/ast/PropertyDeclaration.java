package ast;

public class PropertyDeclaration extends Node implements Expression{
    public String name;
    public Type type;
    public Expression value;

    public PropertyDeclaration(String name, Type type, Expression value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        if (this.value != null) {
            sb.append(" = ").append(((Node) this.value).generate());
        }

        return sb.toString();
    }



    @Override
    public String toString() {
        return name + ": " + type + " = " + value;
    }
}
