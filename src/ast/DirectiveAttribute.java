package ast;

public class DirectiveAttribute extends Content {
    private String name;
    private String value;

    public DirectiveAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public String getValue() { return value; }
    public void setName(String name) { this.name = name; }
    public void setValue(String value) { this.value = value; }

    // هذا generate الرئيسي للـ directives
    @Override
    public String generate() {
        return "";
    }

    public String generate(String childHtml) {
        if (name.equals("ngFor")) {
            String[] parts = value.split("of");
            String itemName = parts[0].replace("let", "").trim();
            String arrayName = parts[1].split(";")[0].trim();
            String indexName = "i";

            return "${" + arrayName + ".map((" + itemName + ", " + indexName + ") => `" + childHtml + "`).join('')}";
        } else if (name.equals("ngIf")) {
            return "${(" + value + ") ? `" + childHtml + "` : ``}";
        } else if (name.startsWith("(") && name.endsWith(")")) {
            String eventName = name.substring(1, name.length() - 1);
            String componentName = getComponentName();
            return "on" + eventName + "=\"myApp." + componentName + "." + value + "\"";
        }
        return "";
    }

    private String getComponentName() {
        if (value.contains("listComponent")) {
            return "listComponent";
        } else if (value.contains("addComponent")) {
        } else if (value.contains("editComponent")) {
            return "editComponent";
        }
        return "listComponent";
    }

    @Override
    public String toString() {
        return "DirectiveAttribute : AttributeName:" + name + ", AttributeValue:" + value + " ";
    }
}
