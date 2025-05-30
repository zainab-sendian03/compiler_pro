package SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TagSymbolTable {
    private Stack<String> tagStack = new Stack<>();

    public TagSymbolTable() {
        this.tagStack = new Stack<>();
    }

    public Stack<String> getTagStack() {
        return tagStack;
    }

    public void pushTag(String tagName) {
        tagStack.push(tagName);
    }
    public String getCurrentScope() {
        return tagStack.isEmpty() ? "global" : tagStack.peek();
    }

}


