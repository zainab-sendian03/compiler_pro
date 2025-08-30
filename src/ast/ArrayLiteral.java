package ast;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayLiteral extends Node implements Expression {
    public ArrayList<Expression> elements ;

    public void addElement(Expression expr) {
        elements.add(expr);
    }
    public ArrayLiteral() {}

    public ArrayLiteral(ArrayList<Expression> elements) {
        this.elements = elements;
    }

    public ArrayList<Expression> getElements() {
        return elements;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < elements.size(); i++) {
            Expression elem = elements.get(i);
            if (elem != null) {
                sb.append(((Node) elem).generate());
            } else {
                sb.append("null");
            }
            if (i < elements.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < elements.size(); i++) {
            Expression elem = elements.get(i);
            if (elem != null) {
                sb.append(((Node) elem).generate());
            } else {
                sb.append("null");
            }
            if (i < elements.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
