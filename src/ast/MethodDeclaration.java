package ast;

import java.util.ArrayList;

public class MethodDeclaration extends Statement {
    public String name;
    public ParameterList parameters;
    public ArrayList<Node> body = new ArrayList<>();

    public MethodDeclaration(String name, ParameterList parameters, ArrayList<Node> body) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ").append(name).append("(");
        if (parameters != null) {
            sb.append(parameters.generate());
        }
        sb.append(") {\n");
        for (Node stmt : body) {
            sb.append("    ").append(stmt.generate());
        }
        sb.append("  }\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("function ").append(name).append("(").append(parameters).append(") {\n");
        for (Node stmt : body) {
            sb.append("  ").append(stmt != null ? stmt.toString() : "null").append("\n");
        }
        sb.append("}");
        return sb.toString();
    }


}