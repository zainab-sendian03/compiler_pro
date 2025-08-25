package ast;
import java.util.ArrayList;

public class ConstructorDecl extends Node{
    public ArrayList<PropertyDeclaration> parameters = new ArrayList<>();
    public ArrayList<Statement> body = new ArrayList<>();

    public ConstructorDecl(ArrayList<PropertyDeclaration> parameters, ArrayList<Statement> body) {
        this.parameters = parameters;
        this.body = body;
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("  constructor(");
        if (parameters != null) {
            for (int i = 0; i < parameters.size(); i++) {
                sb.append(((Node) parameters.get(i)).generate());
                if (i < parameters.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(") {\n");
        if (body != null) {
            for (Statement stmt : body) {
                sb.append("    ").append(stmt.generate());
            }
        }
        sb.append("  }\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Constructor(");

        // خصائص
        if (parameters != null && !parameters.isEmpty()) {
            sb.append("properties=[");
            for (int i = 0; i < parameters.size(); i++) {
                sb.append(parameters.get(i).toString());
                if (i < parameters.size() - 1) sb.append(", ");
            }
            sb.append("]");
        }
        if (body != null && !body.isEmpty()) {
            if (!sb.toString().endsWith("(")) sb.append(", ");
            sb.append("body=[");
            for (int i = 0; i < body.size(); i++) {
                sb.append(body.get(i).toString());
                if (i < body.size() - 1) sb.append(", ");
            }
            sb.append("]");
        }

        sb.append(")");
        return sb.toString();
    }
}
