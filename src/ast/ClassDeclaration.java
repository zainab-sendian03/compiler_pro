package ast;

import java.util.ArrayList;

public class ClassDeclaration extends Node {
    public String name;
    public ArrayList<Node> body = new ArrayList<>();

    public ClassDeclaration(String name) {
        this.name = name;
    }

    public void add(Node node) {
        body.add(node);
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ").append(name).append(" {\n");
        for (Node member : body) {
            sb.append(member.generate());
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "class " + name + "{" + body+ "}";
    }
}
