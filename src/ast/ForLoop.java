package ast;

import java.util.ArrayList;

public class ForLoop extends Node implements Addable<Node>{
    VariableDeclaration init;
    Expression condition;
    Expression operation;
    ArrayList<Node> body;

    public ForLoop(VariableDeclaration init, Expression condition, Expression operation) {
        this.init = init;
        this.condition = condition;
        this.operation = operation;
        this.body = new ArrayList<>();
    }


    @Override
    public void add(Node child) {
        body.add(child);
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("for (");
        if (init != null) {
            sb.append(init.generate().replace(";\n", ""));
        }
        sb.append("; ");
        if (condition != null) {
            sb.append(((Node) condition).generate());
        }
        sb.append("; ");
        if (operation != null) {
            sb.append(((Node) operation).generate());
        }
        sb.append(") {\n");
        for (Node stmt : body) {
            if (stmt != null) {
                sb.append("  ").append(((Node) stmt).generate());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "for (" + init + "; " + condition + "; " + operation + ") "+
                "\n"
                + body;
    }
}
