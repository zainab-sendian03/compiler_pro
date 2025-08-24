package ast;

public class Text extends Node {

    private String text;
    private String identifier;

    public Text(String text, String identifier) {
        this.text = text;
        this.identifier = identifier;
    }

    public String getText() {
        return text;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Text: " + (text != null ? text : identifier);
    }
}
