package ast;

public class ArrowFunction extends Expression {
    ParameterList parameters;
    Expression body;

    public ArrowFunction(ParameterList parameters, Expression body) {
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        return parameters + " => " + body;
    }
}
