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
        // Find the directive attribute first
        DirectiveAttribute directive = null;
        for (Node attr : openTag.getAttributes()) {
            if (attr instanceof DirectiveAttribute) {
                directive = (DirectiveAttribute) attr;
                break;
            }
        }

        // Generate the inner content first
        String childrenContent = this.elements.stream()
                .map(Node::generate)
                .collect(Collectors.joining(""));

        if (directive != null) {
            // Generate the HTML for the tag itself (without the directive attribute)
            String tagHtml = openTag.generate() + childrenContent + closedTag.generate();
            // Pass the generated HTML to the directive's generate method
            return directive.generate(tagHtml);
        } else {
            // Standard generation if no directive is found
            StringBuilder builder = new StringBuilder();
            builder.append(this.openTag.generate());
            builder.append(childrenContent);
            if (this.closedTag != null) {
                builder.append(this.closedTag.generate());
            }
            return builder.toString();
        }
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



