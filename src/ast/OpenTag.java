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
        // نبدأ بـ "<" واسم الوسم
        StringBuilder builder = new StringBuilder();
        builder.append("<").append(this.tagName);

        // إذا كانت هناك خصائص (attributes)، نقم بمعالجتها
        if (this.attributes != null && !this.attributes.isEmpty()) {
            // نستخدم Stream API لمعالجة قائمة الخصائص
            // 1. نحول كل عقدة (Node) في القائمة إلى نص عبر استدعاء دالة generate() الخاصة بها
            // 2. نجمع النصوص الناتجة في سلسلة نصية واحدة، مع وضع مسافة " " كفاصل بينها
            String attributesString = this.attributes.stream()
                    .map(Node::generate) // استدعاء generate() لكل خاصية
                    .collect(Collectors.joining(" "));

            // نضيف مسافة قبل إضافة الخصائص، ثم نضيف سلسلة الخصائص
            builder.append(" ").append(attributesString);
        }

        // نغلق الوسم بـ ">"
        builder.append(">");

        return builder.toString();
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