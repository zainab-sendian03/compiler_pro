package ast;

import java.util.ArrayList;

public class ArrayLiteral extends Node implements Expression {
    public ArrayList<Expression> elements = new ArrayList<>();

    public void addElement(Expression expr) {
        elements.add(expr);
    }

    public ArrayLiteral(ArrayList<Expression> elements) {
        this.elements = elements;
    }

    public ArrayList<Expression> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}

