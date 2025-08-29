package ast;

public class SpreadExpression extends Node implements Expression {
    private final Expression inner;

    public SpreadExpression(Expression inner) {
        this.inner = inner;
    }

    public Expression getInner() {
        return inner;
    }
    @Override
    public String generate() {
        if (inner != null) {
            return "..." + ((Node) inner).generate();
        }
        return "...";
    }

    @Override
    public String toString() {
        return "..." + inner.toString();
    }
}