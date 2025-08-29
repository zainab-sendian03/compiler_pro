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
        StringBuilder jsBuilder = new StringBuilder();

        // توليد JS لكل statement في البرنامج
        for (Node stmt : statements) {
            jsBuilder.append(stmt.generate()).append("\n");
        }

        return jsBuilder.toString(); // نرجع كل كود JS المتولد
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
