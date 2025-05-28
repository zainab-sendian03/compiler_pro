package ast;

// القاعدة: closedTag
public class ClosedTag extends Node {
    private String tagName;

    public ClosedTag(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }



    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "TagName:"  + tagName  ;
    }

//    @Override
//    public String toString() {
//        return "</" + tagName + ">";
//    }
}

