package ast;

import java.util.ArrayList;

public class ClassDeclaration extends Node implements Addable<Node>{
    String name;
    ArrayList<Node> body;

    public ClassDeclaration(String name) {
        this.name = name;
        this.body = new ArrayList<>();
    }


    @Override
    public void add(Node child) {
        body.add(child);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node ast : body) {
            stringBuilder.append(ast).append("\n");
        }
        return stringBuilder.toString();
    }
}
