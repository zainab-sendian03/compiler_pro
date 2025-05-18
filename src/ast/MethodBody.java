package ast;

import java.util.ArrayList;

public class MethodBody extends AST {

    ArrayList<AST> statement;

    public MethodBody() {
        this.statement = new ArrayList<>();
    }

    public void addStatement(AST member) {
        this.statement.add(member);
    }

    @Override
    public String toString() {
        return statement.toString();
    }


}
