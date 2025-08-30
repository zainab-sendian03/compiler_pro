package ast;

import java.util.List;
import java.util.stream.Collectors;

public class CompleteTag extends Element implements Addable<Node> {
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

    @Override
    public void add(Node child){
        elements.add(child);
    }

    @Override
    public String generate() {
        String childHtml = elements.stream()
                .map(Node::generate)
                .collect(Collectors.joining(""));

        for (Node attr : openTag.getAttributes()) {
            if (attr instanceof DirectiveAttribute) {
                if (((DirectiveAttribute) attr).getName().equals("ngIf")) {
                    String fullTag = createFullTag(childHtml);
                    return ((DirectiveAttribute) attr).generate(fullTag);
                }
            }
        }

        for (Node attr : openTag.getAttributes()) {
            if (attr instanceof DirectiveAttribute) {
                if (((DirectiveAttribute) attr).getName().equals("ngFor")) {
                    String tagContent = createFullTag(childHtml);
                    return ((DirectiveAttribute) attr).generate(tagContent);
                }
            }
        }
        return createFullTag(childHtml);
    }

    private String createFullTag(String childHtml) {
        String openTagStr = openTag.generate();
        String closeTagStr = (closedTag != null) ? closedTag.generate() : "";
        return openTagStr + childHtml + closeTagStr;
    }



    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("CompleteTag :{\n");
        builder.append("openTag:{ ").append(openTag).append("}\n");
        builder.append("elements: [\n");
        for (Node child : elements) {
            builder.append(child).append(",\n");
        }
        builder.append("],\n");
        builder.append("closedTag: ").append(closedTag).append("\n}");

        return builder.toString();

    }}
