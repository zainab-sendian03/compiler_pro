package ast;

import java.util.ArrayList;

public class ClassBody extends Node implements Addable<Node>{
    public ArrayList<Node> members;

    public ClassBody() {
        this.members = new ArrayList<>();
    }

    @Override
    public void add(Node child) {
        members.add(child);
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (Node member : members) {
            String generatedCode = member.generate();
            if (generatedCode != null) {
                sb.append(generatedCode);
            }
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return members.toString();
    }
}
