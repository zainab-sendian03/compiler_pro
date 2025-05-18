package ast;

import java.util.ArrayList;

public class ClassBody extends AST {
    public ArrayList<AST> members;

    public ClassBody() {
        this.members = new ArrayList<>();
    }

    public void addMember(AST member) {
        this.members.add(member);
    }

    @Override
    public String toString() {
        return members.toString();
    }
}
