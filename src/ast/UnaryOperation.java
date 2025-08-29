package ast;

public class UnaryOperation extends Node implements Expression {
    String operator;
    Expression expr;

    public UnaryOperation(String operator, Expression expr) {
        this.operator = operator;
        this.expr = expr;
    }

    @Override
    public String generate() {
        return operator + ((Node) expr).generate();
    }

    @Override
    public String toString() {
        return operator + expr.toString();
    }
}
