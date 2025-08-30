package ast;

public class ArrayAccessor extends Accessor {
    private String indexExpr; // ممكن يكون "0", "index", أو أي expression

    public ArrayAccessor(String indexExpr) {
        super((String) null); // parent class Accessor ممكن يحتوي على اسم للـ property العادية، هنا نخليها null
        this.indexExpr = indexExpr;
    }

    @Override
    public String generate() {
        return "[" + indexExpr + "]";
    }
}
