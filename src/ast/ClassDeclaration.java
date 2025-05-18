package ast;

import java.util.ArrayList;

public class ClassDeclaration extends AST {
    String name;
    ArrayList<AST> body;

    public ClassDeclaration(String name) {
        this.name = name;
        this.body = new ArrayList<>();
    }

    public void addBody(AST ast) {
        this.body.add(ast);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (AST ast : body) {
            stringBuilder.append(ast).append("\n");
        }
        return stringBuilder.toString();
    }
}
