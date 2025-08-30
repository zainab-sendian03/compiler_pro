package ast;
import java.util.ArrayList;

public class ConstructorDecl extends Node{
    public ArrayList<PropertyDeclaration> parameters = new ArrayList<>();
    public ArrayList<Node> body = new ArrayList<>();

    public ConstructorDecl(ArrayList<PropertyDeclaration> parameters, ArrayList<Node> body) {
        this.parameters = parameters;
        this.body = body;
    }

    public ArrayList<PropertyDeclaration> getParameters() {
        return parameters;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("constructor(");
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).generate());
            if (i < parameters.size() - 1) sb.append(", ");
        }
        sb.append(") {\n");
        for (PropertyDeclaration param : parameters) {
            sb.append("    this.").append(param.name).append(" = ").append(param.name).append(";\n");
        }
        for (Node stmt : body) {
            sb.append("  ").append(stmt.generate()).append("\n"); // هنا generate لكل statement
        }
        sb.append("}");
        return sb.toString();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("constructor(");
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).generate());
            if (i < parameters.size() - 1) sb.append(", ");
        }
        sb.append(") {\n");
        for (PropertyDeclaration param : parameters) {
            sb.append("    this.").append(param.name).append(" = ").append(param.name).append(";\n");
        }

        for (Node stmt : body) {
            sb.append("  ").append(stmt.generate()).append("\n");
                 }
        sb.append("}");
        return sb.toString();
    }
}
