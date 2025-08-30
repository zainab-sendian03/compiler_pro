package ast;

public class AssignmentExpression extends Node implements Expression {
    Expression target;
    Expression value;

    public AssignmentExpression(Expression target, Expression value) {
        this.target = target;
        this.value = value;
    }
    @Override
    public String generate() {
        String left = (target != null) ? target.toString() : "null";
        String right = (value != null) ? value.toString() : "null";
        return left + " = " + right;
    }



    @Override
    public String toString() {
        String left = (target != null) ? target.toString() : "null";
        String right = (value != null) ? value.toString() : "null";
        return left + " = " + right;
    }
}
