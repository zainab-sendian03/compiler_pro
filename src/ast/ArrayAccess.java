package ast;

public class ArrayAccess extends Node implements Expression {
    public Expression array;
    public Expression index;

    public ArrayAccess(Expression array, Expression index) {
        this.array = array;
        this.index = index;
    }

    @Override
    public String generate() {
        return ((Node) array).generate() + "[" + ((Node) index).generate() + "]";
    }

    @Override
    public String toString() {
        return ((Node) array).generate() + "[" + ((Node) index).generate() + "]";
    }
}
