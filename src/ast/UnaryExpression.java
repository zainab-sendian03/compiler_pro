package ast;

public class UnaryExpression extends Node implements Expression {
    private final String operator;
    private final Expression inner;

    public UnaryExpression(String operator, Expression inner) {
        this.operator = operator;
        this.inner = inner;
    }

    @Override
    public String generate() {
        return operator + (inner != null ? ((Node) inner).generate() : "");
    }

    @Override
    public String toString() {
        return operator + (inner != null ? inner.toString() : "");
    }
}
