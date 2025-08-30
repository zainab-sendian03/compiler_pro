package ast;

import java.util.ArrayList;

public class ObjectLiteral extends Node implements Expression {
    public ArrayList<Expression> properties = new ArrayList<>();

    public void addProperty(Expression pa) {
        properties.add(pa);
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        sb.append("{\n");
        for (int i = 0; i < properties.size(); i++) {
            sb.append("  ").append(((Node) properties.get(i)).generate());
            if (i < properties.size() - 1) {
                sb.append(",\n");
            }
        }
        sb.append("\n}");
        return sb.toString();
    }

    @Override
    public String toString() {
        return properties.toString();
    }
}
