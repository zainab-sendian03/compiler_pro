package ast;

public class SelectorField extends Field {
    String selector;

    public SelectorField(String selector) {
        this.selector = selector;
    }

    @Override
    public String toString() {
        return "SelectorField{" +
                selector +
                '}' +"\n";
    }
}
