package ast;

public class ExpressionStatement extends Statement {
    Expression expression;

    public ExpressionStatement(Expression expression) {
        this.expression = expression;
    }
    
    @Override
    public String generate() {
        if (expression == null) return "";
        return ((Node) expression).generate() + ";\n";
    }

    @Override
    public String toString() {
        return expression != null ? expression.toString() + ";" : "";
    }
}