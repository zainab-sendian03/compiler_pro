package ast;

public class ArrowFunction extends Statement{
    public ParameterList parameters;
    public Node body;

    public ArrowFunction(ParameterList parameters, Node body) {
        this.parameters = parameters;
        this.body = body;
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(parameters.generate()).append(") => {\n");
        if (body instanceof Statement) {
            sb.append("  ").append(((Statement) body).generate());
        } else if (body instanceof Expression) {
            sb.append("  return ").append(((Node) body).generate()).append(";\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return parameters + " => " + body;
    }

}
