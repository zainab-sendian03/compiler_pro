package ast;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {
    public ArrayList<Node> statements = new ArrayList<>();

    public void addStatement(Node stmt) {
        statements.add(stmt);
    }

    public List<Node> getStatements(){
        return statements;
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (Node stmt : statements) {
            String generatedCode = stmt.generate();
            if (generatedCode != null) {
                sb.append(generatedCode);
            }
        }
        return sb.toString();
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