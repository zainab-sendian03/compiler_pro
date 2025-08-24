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
    public String toString() {
        return expressions.toString();
    }
}

