package ast;

import java.util.List;

public class SelfClosingTag extends Node {
    private String tagName;
    private List<ContentNode> attributes;

    public SelfClosingTag(String tagName, List<ContentNode> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setAttributes(List<ContentNode> attributes) {
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public List<ContentNode> getAttributes() {
        return attributes;
    }

    public void addChild(ContentNode child) {
        attributes.add(child);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SelfClosingTag :");
        builder.append("TagName:" + tagName + ",").append("\n");
        builder.append("Attributes:[\n");
        for (ContentNode child : attributes) {
            builder.append(" ").append(child.toString()).append(",\n");
        }
        builder.append("]" + "\n");
        return  builder.toString();
    }
}



//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("<"+ tagName +" ");
//        for (ContentNode child : attributes) {
//            builder.append(child.toString());
//        }
//        builder.append("/>"+"\n");
//        return builder.toString();
//    }



