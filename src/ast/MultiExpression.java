package ast;

import java.util.List;

public class MultiExpression extends Node implements Expression {
    private final List<Expression> expressions;

    public MultiExpression(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }
    
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expressions.size(); i++) {
            sb.append(((Node) expressions.get(i)).generate());
            if (i < expressions.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return expressions.toString();
    }
}

