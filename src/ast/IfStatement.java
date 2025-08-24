package ast;

import java.util.ArrayList;

public class IfStatement extends Node  {
    public Expression condition;
    public ArrayList<Statement> ifBody = new ArrayList<>();
    public ArrayList<Statement> elseBody = new ArrayList<>();

    public IfStatement(Expression condition) {
        this.condition = condition;
    }

    public void addToIfBody(Statement stmt) {
        ifBody.add(stmt);
    }

    public void addToElseBody(Statement stmt) {
        elseBody.add(stmt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("if(").append(condition).append(") {\n");
        for (Statement s : ifBody) sb.append("\t").append(s).append("\n");
        sb.append("}");
        if (!elseBody.isEmpty()) {
            sb.append(" else {\n");
            for (Statement s : elseBody) sb.append("\t").append(s).append("\n");
            sb.append("}");
        }
        return sb.toString();
    }
}
