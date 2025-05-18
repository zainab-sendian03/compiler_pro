package ast;

public class PropertyDeclaration extends AST {

    String name;
    Type type;
    Expression value;

    public PropertyDeclaration(String name, Type type, Expression value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + ": " + type + " = " + value;
    }


}
