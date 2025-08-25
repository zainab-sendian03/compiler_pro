package ast;

import java.util.List;

public class OpenTag extends Node {
    private String tagName;
    private List<Node> attributes;

    public OpenTag(String tagName, List<Node> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setAttributes(List<Node> attributes) {
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public List<Node> getAttributes() {
        return attributes;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);
        for (Node attr : attributes) {
            sb.append("  ").append(attr.generate());
        }
        sb.append(">");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TagName:").append(tagName).append(",").append("\n");
        builder.append("Attributes: [\n");
        for (Node child : attributes) {
            builder.append(child.toString()).append(",\n");
        }
        builder.append("]"+"\n");
        return builder.toString();
    }

}
//    @Override
//    public String toString() {
//        return "OpenTag { tagName: \"" + tagName + "\", attributes: " + attributes + " }";
//    }