package ast;

public class PropertyAssignment extends Node {
    public Expression key;
    public Expression value;

    public PropertyAssignment(Expression key, Expression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Node) key).generate()).append(": ");
        sb.append(((Node) value).generate());
        return sb.toString();
    }

    @Override
    public String toString() {
        return key + ":" + value;
    }
}