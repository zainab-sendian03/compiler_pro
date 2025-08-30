package ast;

import java.util.ArrayList;
import java.util.List;

public class PropertyAccess extends Node implements Expression {
    private final String base; // بدل String
    private final List<Accessor> accessors = new ArrayList<>(); // لكل DOT IDENTIFIER أو arrayLiteral
    private Literal orLiteral = null; // لو فيه || literal

    public PropertyAccess(String base) {
        this.base = base;
    }


    public void addAccessor(Accessor accessor) {
        accessors.add(accessor);
    }

    public void setOrLiteral(Literal literal) {
        this.orLiteral = literal;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(base);
        for (Accessor acc : accessors) {
            sb.append(acc.generate());
        }
        if (orLiteral != null) {
            sb.append(" || ").append(orLiteral.generate());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return generate();
    }
}
