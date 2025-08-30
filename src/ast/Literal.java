package ast;

import ast.Expression;
import ast.Node;

public class Literal extends Node implements Expression {
    private final Object value;
    public Literal(Object value) {
        this.value = value;
    }
    public  Literal(){
        this.value = null;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value == null ? "null" : value.toString();
    }

    @Override
    public String generate() {
        return value == null ? "null" : value.toString();
    }
}
