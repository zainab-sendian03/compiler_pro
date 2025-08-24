package ast;

public class AssignmentExpression extends Node implements Expression {
    Expression target;
    Expression value;

    public AssignmentExpression(Expression target, Expression value) {
        this.target = target;
        this.value = value;
    }


    @Override
    public String toString() {
        return target + " = " + value;
    }
}
