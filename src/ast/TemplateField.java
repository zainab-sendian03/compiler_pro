package ast;

import java.util.ArrayList;
import java.util.List;

public class TemplateField extends Field  {
    private  String template;
    private final List<Node> elements;

    public TemplateField() {
        this.elements = new ArrayList<>();
    }

    public TemplateField(String templateString, List<Node> elements) {
        super();
        this.template = templateString;
        this.elements = elements;
    }
    public void setTemplateString(String template) {
        this.template = template;
    }


    public String getTemplateString() {
        return template;
    }

    public List<Node> getElements() {
        return elements;
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        // لا تضيف template نفسه لأنه فيه raw code رح يكرر
        for (Node element : elements) {
            sb.append(element.generate());
        }
        return sb.toString();
    }


    @Override
    public String generate() {
        StringBuilder htmlBuilder = new StringBuilder();

        // Generate HTML from elements, handling directives and bindings
        for (Node element : elements) {
            if (element != null) {
                htmlBuilder.append(element.generate());
            }
        }

        return "`" + htmlBuilder.toString() + "`";
    }

    @Override
    public String toString() {
        return "TemplateField{" +
                "template='" +
                ", elements=" + elements +
                '}';
    }
}