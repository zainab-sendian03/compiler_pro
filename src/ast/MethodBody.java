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
        StringBuilder sb = new StringBuilder();
        for (Node stmt : statement) {
            String generatedCode = stmt.generate();
            if (generatedCode != null) {
                sb.append("    ").append(generatedCode);
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return statement.toString();
    }
}
