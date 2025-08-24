package ast;

public class PropertyAssignment extends Node {
    public Expression key;
    public Expression value;

    public PropertyAssignment(Expression key, Expression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ":" + value;
    }
}