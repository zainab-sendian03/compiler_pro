package ast;

public class AssignmentExpression extends Node implements Expression {
    PropertyAccess target;
    Expression value;

    public AssignmentExpression(PropertyAccess target, Expression value) {
        this.target = target;
        this.value = value;
    }

    @Override
    public void add(Expression child) {

    }

    @Override
    public String toString() {
        return target + " = " + value;
    }
}
