package ast;

import java.util.List;

public class TemplateField extends Field {
    private final String template;
    private final List<Node> elements;

    public TemplateField(String templateString, List<Node> elements) {
        super();
        this.template = templateString;
        this.elements = elements;
    }

    public String getTemplateString() {
        return template;
    }

    public List<Node> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "TemplateField{" +
                "template='" + template + '\'' +
                ", elements=" + elements +
                '}';
    }
}
