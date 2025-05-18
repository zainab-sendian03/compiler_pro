package ast;

import java.util.ArrayList;

public class ArrayLiteral extends Expression {
    ArrayList<Expression> elements;

    public ArrayLiteral() {
        this.elements = new ArrayList<>();
    }

    public void addElement(Expression element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
