package ast;

public class DirectiveAttribute extends Content {
    private String name;
    private String value;

    public DirectiveAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String generate() {
        // This is a placeholder and should not be called directly.
        // The generate(String childHtml) method below is used.
        return "";
    }

    // New method to generate a JavaScript string with the child HTML content
    public String generate(String childHtml) {
        if (name.equals("ngFor")) {
            // value = "let item of items; let i = index"
            String arrayName = "items"; // Simplified for this example
            return "${" + arrayName + ".map((item, i) => `" + childHtml + "`).join('')}";
        } else if (name.equals("ngIf")) {
            // value = "selectedItem !== null"
            return "${(" + value + ") ? `" + childHtml + "` : ``}";
        }
        return "";
    }
    @Override
    public String toString() {
        return "DirectiveAttribute : AttributeName:" + name + ", AttributeValue:" + value + " ";
    }
}