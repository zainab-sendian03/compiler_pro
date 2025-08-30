package ast;

import java.util.List;
import java.util.stream.Collectors;

public class OpenTag extends Node {
    private String tagName;
    private List<Node> attributes;

    public OpenTag(String tagName, List<Node> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public String getTagName() { return tagName; }
    public List<Node> getAttributes() { return attributes; }
    public void setTagName(String tagName) { this.tagName = tagName; }
    public void setAttributes(List<Node> attributes) { this.attributes = attributes; }

    @Override
    public String generate() {
        StringBuilder builder = new StringBuilder();
        builder.append("<").append(tagName);

        if (attributes != null && !attributes.isEmpty()) {
            for (Node attr : attributes) {
                if (attr instanceof DirectiveAttribute) {
                    if (((DirectiveAttribute) attr).getName().startsWith("(") && ((DirectiveAttribute) attr).getName().endsWith(")")) {
                        builder.append(" ").append(((DirectiveAttribute) attr).generate(""));
                    }
                } else {
                    builder.append(" ").append(attr.generate());
                }
            }
        }

        builder.append(">");
        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TagName:").append(tagName).append(",\n");
        builder.append("Attributes:[\n");
        for (Node child : attributes) {
            builder.append(child.toString()).append(",\n");
        }
        builder.append("]\n");
        return builder.toString();
    }
}
