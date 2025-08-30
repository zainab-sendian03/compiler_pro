package ast;

public class PropertyAssignment extends Node implements Expression {
    public Expression key;
    public Expression value;

    public PropertyAssignment(Expression key, Expression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String generate() {
        if (key == null) {
            return ((Node) value).generate(); // نطبع بس المفتاح
        }
        return ((Node) key).generate() ;
    }

    @Override
    public String toString() {
        if (value == null) {
            return key.toString();
        }
        return key + ":" + value;
    }
}
