package ast;

import java.util.ArrayList;

public class ArrayLiteral extends Node implements Expression {
    public ArrayList<Expression> elements = new ArrayList<>();

    public void addElement(Expression expr) {
        elements.add(expr);
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < elements.size(); i++) {
            sb.append(((Node) elements.get(i)).generate());
            if (i < elements.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}

