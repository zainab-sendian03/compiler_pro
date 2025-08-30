package ast;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        StringBuilder builder = new StringBuilder();

        // افترض أن هذه الـ TemplateField هي الـ root component
        builder.append("render() {\n");
        builder.append("  const container = this.root.container;\n");

        // جمع كل عناصر HTML داخليًا
        String innerHTML = elements.stream()
                .map(Node::generate)
                .collect(Collectors.joining("\n"));

        builder.append("  container.innerHTML = `\n")
                .append(innerHTML)
                .append("\n`;\n");
        builder.append("}\n");

        return builder.toString();
    }




    @Override
    public String toString() {
        return "TemplateField{" +
                "template='" +
                ", elements=" + elements +
                '}';
    }
}
