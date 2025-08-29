package ast;

public class InjectableBody extends Node {
    private String value;

    public InjectableBody(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public String generate() {
        return "providedIn: '" + value + "'";
    }

    @Override
    public String toString() {
        return "providedIn: " + value;
    }
}