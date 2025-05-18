package ast;

import java.util.ArrayList;

public class ForLoop extends AST {
    VariableDeclaration init;
    Expression condition;
    Expression operation;
    ArrayList<AST> body;

    public ForLoop(VariableDeclaration init, Expression condition, Expression operation) {
        this.init = init;
        this.condition = condition;
        this.operation = operation;
        this.body = new ArrayList<>();
    }

    public void addBodyStatement(AST statement) {
        this.body.add(statement);
    }

    @Override
    public String toString() {
        return "for (" + init + "; " + condition + "; " + operation + ") "+
                "\n"
                + body;
    }
}
