package ast;

import java.util.List;

public class CompleteTag extends Node {
    int i=0;
    private OpenTag openTag;
    private List<Node> elements;
    private ClosedTag closedTag;

    public CompleteTag(OpenTag openTag, List<Node> children, ClosedTag closedTag) {
        this.openTag = openTag;
        this.elements = children;
        this.closedTag = closedTag;
    }

    public void setOpenTag(OpenTag openTag) {
        this.openTag = openTag;
    }

    public void setElements(List<Node> elements) {
        this.elements = elements;
    }

    public void setClosedTag(ClosedTag closedTag) {
        this.closedTag = closedTag;
    }

    public OpenTag getOpenTag() {
        return openTag;
    }

    public List<Node> getChildren() {
        return elements;
    }

    public ClosedTag getClosedTag() {
        return closedTag;
    }

    public void addChild(Node child){
        elements.add(child);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("CompleteTag :{\n");
        builder.append("openTag:{ ").append(openTag).append("}\n");
        builder.append("elements: [\n");
        for (Node child : elements) {
            builder.append("").append(child).append(",\n");
        }
        builder.append("],\n");
        builder.append("closedTag: ").append(closedTag).append("\n}");

        return builder.toString();

    }}

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append(openTag.toString()).append("\n");
//        for (Node child : elements) {
//            builder.append(child.toString()).append("\n");
//        }
//        builder.append(closedTag.toString()).append("\n");
//        return builder.toString();
//    }

