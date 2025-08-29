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

        // نولّد كل أعضاء الـ ClassBody (members)
        if (members != null && !members.isEmpty()) {
            for (Node member : members) {
                // إذا العضو هو PropertyDeclaration، نولده كـ parameter للكونستركتر
                if (member instanceof PropertyDeclaration) {
                    sb.append("  ").append(((PropertyDeclaration) member).generate()).append(";\n");
                } else {
                    // بقية الأنواع تولّد بشكل طبيعي
                    sb.append(member.generate());
                }
            }
        }

        return sb.toString();
    }


    @Override
    public String toString() {
        return members.toString();
    }
}
