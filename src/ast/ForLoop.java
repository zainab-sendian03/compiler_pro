package ast;

import java.util.ArrayList;

public class ForLoop extends Node implements Addable<Node>{
    VariableDeclaration init;
    Expression condition;
    Expression operation;
    ArrayList<Node> body;

    public ForLoop(VariableDeclaration init, Expression condition, Expression operation) {
        this.init = init;
        this.condition = condition;
        this.operation = operation;
        this.body = new ArrayList<>();
    }


    @Override
    public void add(Node child) {
        body.add(child);
    }

    @Override
    public String toString() {
        return "for (" + init + "; " + condition + "; " + operation + ") "+
                "\n"
                + body;
    }
}
