package ast;

public class Operation extends Node implements Expression {
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
    public String generate() {
        String leftStr = (left != null) ? left.toString() : "null";
        String rightStr = (right != null) ? right.toString() : "";
        if (right != null) return "(" + leftStr + " " + operator + " " + rightStr + ")";
        return leftStr + operator + operator; // ++ أو --
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