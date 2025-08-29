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
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (").append(((Node) condition).generate()).append(") {\n");
        for (Statement stmt : ifBody) {
            if (stmt != null) { // فحص إضافة: التأكد من أن الكائن ليس null
                sb.append("  ").append(stmt.generate());
            }
        }
        sb.append("}\n");
        if (!elseBody.isEmpty()) {
            sb.append("else {\n");
            for (Statement stmt : elseBody) {
                if (stmt != null) { // فحص إضافة: التأكد من أن الكائن ليس null
                    sb.append("  ").append(stmt.generate());
                }
            }
            sb.append("}\n");
        }
        return sb.toString();
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