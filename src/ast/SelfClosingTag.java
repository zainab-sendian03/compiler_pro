package ast;

import java.util.List;
import java.util.stream.Collectors;

public class SelfClosingTag extends Element implements Addable<Node>{
    private String tagName;
    private List<Node> attributes;

    public SelfClosingTag(String tagName, List<Node> attributes) {
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
    public void add(Node item) {
        attributes.add(item);
    }


    @Override
    public String generate() {
        StringBuilder builder = new StringBuilder();

        // 1. ابدأ بـ "<" واسم الوسم
        builder.append("<").append(this.tagName);

        // 2. قم بتوليد الخصائص (نفس المنطق المستخدم في OpenTag)
        if (this.attributes != null && !this.attributes.isEmpty()) {
            builder.append(" ");
            builder.append(this.attributes.stream()
                    .map(Node::generate)
                    .collect(Collectors.joining(" ")));
        }
        // 3. أغلق الوسم بـ ">"
        builder.append("/>");

        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SelfClosingTag :");
        builder.append("TagName:").append(tagName).append(",").append("\n");
        builder.append("Attributes:[\n");
        for (Node child : attributes) {
            builder.append(" ").append(child.toString()).append(",\n");
        }
        builder.append("]" + "\n");
        return  builder.toString();
    }
}







