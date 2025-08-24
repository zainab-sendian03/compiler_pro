package ast;

public class ArrowFunction extends Statement{
    public ParameterList parameters;
    public Node body;

    public ArrowFunction(ParameterList parameters, Node body) {
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        return parameters + " => " + body;
    }

}
