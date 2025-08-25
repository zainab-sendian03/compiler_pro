package ast;

public class PropertyDeclaration extends Node {
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
        String declaration = name;
        if (value != null) {
            declaration += " = " + ((Node) value).generate();
        }
        return "  " + declaration + ";\n";
    }

    @Override
    public String toString() {
        return name + ": " + type + " = " + value;
    }
}