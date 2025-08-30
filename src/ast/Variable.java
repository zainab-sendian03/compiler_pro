package ast;

public class Variable extends Node implements  Expression{
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String generate() {
        return name;
    }

    public String getName() {
        return name;
    }
}
