package ast;

import java.util.ArrayList;

public class MethodBody extends Node implements Addable<Node>{

    ArrayList<Node> statement;

    public MethodBody() {
        this.statement = new ArrayList<>();
    }

    @Override
    public void add(Node child) {
        statement.add(child);
    }

    @Override
    public String toString() {
        return statement.toString();
    }


}
