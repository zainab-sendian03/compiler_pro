package ast;

import java.util.ArrayList;

public class Program extends Node {
    public ArrayList<Node> statements = new ArrayList<>();

    public void addStatement(Node stmt) {
        statements.add(stmt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node stmt : statements) {
            sb.append(stmt).append("\n");
        }
        return sb.toString();
    }
}
