package ast;

import java.util.ArrayList;
import java.util.stream.Collectors;

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
        String params = parameters != null ? parameters.generate() : "";

        StringBuilder bodySb = new StringBuilder();
        if (body != null) {
            for (Node stmt : body) {
                if (stmt != null) {
                    bodySb.append("    ").append(stmt.generate()).append("\n");
                }
            }
        }

        return "  " + this.name + "(" + params + ") {\n" + bodySb + "  }\n";
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
