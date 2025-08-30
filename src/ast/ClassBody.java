package ast;

import java.util.ArrayList;

public class ClassBody extends Node implements Addable<Node> {
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

        // أول شي اجمع كل members
        boolean hasConstructor = false;
        ArrayList<PropertyDeclaration> properties = new ArrayList<>();

        for (Node member : members) {
            if (member instanceof ConstructorDecl) {
                hasConstructor = true;
                sb.append(member.generate()).append("\n");
            } else if (member instanceof PropertyDeclaration) {
                properties.add((PropertyDeclaration) member);
            }
        }

        // إذا ما في constructor، نولّد واحد فاضي
        if (!hasConstructor) {
            sb.append("constructor() {}\n");
        }

        return sb.toString();
    }


    @Override
    public String toString() {
        return members.toString();
    }
}
