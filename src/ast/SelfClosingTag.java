package ast;

import java.util.List;
import java.util.stream.Collectors;

public class SelfClosingTag extends Element {
    private String tagName;
    private List<Node> attributes;

    public SelfClosingTag(String tagName, List<Node> attributes) {
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
                    builder.append(" ").append(((DirectiveAttribute) attr).generate(""));
                } else {
                    builder.append(" ").append(attr.generate());
                }
            }
        }

        builder.append("/>");
        return builder.toString();
    }
}
