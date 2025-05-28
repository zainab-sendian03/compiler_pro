package ast;

import java.util.ArrayList;

public class ArrayLiteral extends Node implements Expression {
    ArrayList<Expression> elements;

    public ArrayLiteral() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(Expression  child){
            elements.add(child);

    }
    @Override
    public String toString() {
        return elements.toString();
    }
}
