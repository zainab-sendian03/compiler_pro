package ast;

import java.util.ArrayList;

public class Program extends AST {

    ArrayList<AST> children;

    public Program() {
        this.children = new ArrayList<>();
    }

    public void addChild(AST ast) {
        this.children.add(ast);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (AST ast : this.children) {
            stringBuilder.append(ast).append("\n");
        }
        return stringBuilder.toString();
    }
}
