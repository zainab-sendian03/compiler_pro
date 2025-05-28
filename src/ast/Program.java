package ast;

import java.util.ArrayList;

public class Program extends Node implements Addable<Node>{

    ArrayList<Node> children;

    public Program() {
        this.children = new ArrayList<>();
    }


    @Override
    public void add(Node item) {
        children.add(item);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node ast : this.children) {
            stringBuilder.append(ast).append("\n");
        }
        return stringBuilder.toString();
    }
}
