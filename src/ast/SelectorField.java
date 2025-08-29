package ast;

public class SelectorField extends Field{
    String selector;

    public SelectorField(String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    @Override
    public String generate() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("// Selector: ").append(selector).append("\n");
        // يتم التأكد من أن قيمة selector لا تحتوي على علامات اقتباس
        // ثم تُضاف علامات الاقتباس الصحيحة هنا
        jsBuilder.append("const selector = '").append(selector.replace("'", "")).append("';\n");
        return jsBuilder.toString();
    }
    @Override
    public String toString() {
        return "SelectorField{" +
                selector +
                '}' +"\n";
    }
}
