package ast;

import java.util.List;

public class HtmlRoot extends Node{
    private List<Node> elements;
    public HtmlRoot(List<Node> children) {
        this.elements = children;
    }
    public void setElements(List<Node> elements) {
        this.elements = elements;
    }
    public List<Node> getChildren() {
        return elements;
    }

    public void add(Node child){
        elements.add(child);
    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("elements: [\n");
        for (Node child : elements) {
            builder.append(child).append(",\n");
        }
        builder.append("],\n");
        return builder.toString();

    }}

