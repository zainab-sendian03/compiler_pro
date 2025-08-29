package ast;

import java.util.ArrayList;

public class ClassDeclaration extends Node {
    public String name;
    public ArrayList<Node> body = new ArrayList<>();// الكلاس فيه body واحد

    public ClassDeclaration(String name) {
        this.name = name;
    }

    public void add(Node node) {
        body.add(node);
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ").append(this.name).append(" {\n");

        if (body != null && !body.isEmpty()) {
            for (Node node : body) {
                sb.append(node.generate());
            }
        }

        sb.append("}\n\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "class " + name + " { " + body + " }";
    }
}
