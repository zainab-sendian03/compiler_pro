package ast;


public class ThisExpression extends Node implements Expression {
    @Override
    public String generate() {
        return "this";
    }
}
