package ast;

public class Operation extends Expression {
    String operator;
    Expression left;
    Expression right;


    public Operation(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public Operation(Expression left, String operator) {
        this.operator = operator;
        this.left = left;
        this.right = null;
    }

    @Override
    public String toString() {
        if (left != null && right != null) {
            return "(" + left + " " + operator + " " + right + ")";
        } else if (left != null) {
            return "(" + left + operator +operator + ")";
        }
        return "(" + operator + ")";
    }
}
