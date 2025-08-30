package ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program extends Node {
    public ArrayList<Node> statements = new ArrayList<>();

    public void addStatement(Node stmt) {
        if (stmt != null) {
            statements.add(stmt);
        }
    }

    public List<Node> getStatements() {
        return Collections.unmodifiableList(statements);
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (Node stmt : statements) {
            String generatedCode = stmt.generate();
            if (generatedCode != null && !generatedCode.isBlank()) {
                sb.append(generatedCode).append("\n");
            }
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Program:\n");
        for (Node stmt : statements) {
            sb.append("  ").append(stmt).append("\n");
        }
        return sb.toString();
    }
}