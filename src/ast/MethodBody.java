package ast;

import java.util.ArrayList;

public class MethodBody extends Statement implements Addable<Node> {

    ArrayList<Node> statement;

    public MethodBody() {
        this.statement = new ArrayList<>();
    }

    @Override
    public void add(Node child) {
        statement.add(child);
    }

    public ArrayList<Node> getStatements() {
        return statement;
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder("{\n");
        for (Node stmt : statement) {
            sb.append("  ").append(stmt.generate()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        return statement.toString();
    }
}
