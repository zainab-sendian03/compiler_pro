package ast;

public class ArrowFunction extends Node implements Expression {
    ParameterList parameters;
    Expression body;

    public ArrowFunction(ParameterList parameters, Expression body) {
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public void add(Expression child) {

    }

    @Override
    public String toString() {
        return parameters + " => " + body;
    }
}
