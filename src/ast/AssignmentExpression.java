package ast;

public class AssignmentExpression extends Expression {
    PropertyAccess target;
    Expression value;

    public AssignmentExpression(PropertyAccess target, Expression value) {
        this.target = target;
        this.value = value;
    }

    @Override
    public String toString() {
        return target + " = " + value;
    }
}
