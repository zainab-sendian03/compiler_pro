package ast;

import java.util.ArrayList;
import java.util.List;

public class PropertyAccess extends Node implements Expression {
    private boolean isThis;
    private String base;
    private List<Accessor> accessors = new ArrayList<>();

    // جديد: قيمة OR إذا كانت موجودة
    private Literal orLiteral = null;

    public PropertyAccess(boolean isThis, String base) {
        this.isThis = isThis;
        this.base = base;
    }

    public void addAccessor(Accessor accessor) {
        accessors.add(accessor);
    }

    // جديد: لتعيين قيمة OR
    public void setOrLiteral(Literal literal) {
        this.orLiteral = literal;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        if (isThis) {
            sb.append("this");
        } else if (base != null) {
            sb.append(base);
        }

        for (Accessor acc : accessors) {
            sb.append(acc.generate());
        }

        // لو فيه or literal
        if (orLiteral != null) {
            sb.append(" || ").append(orLiteral.generate());
        }

        return sb.toString();
    }
}
