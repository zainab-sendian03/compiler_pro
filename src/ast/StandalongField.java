package ast;

public class StandalongField extends Field {
    String standalong;

    public StandalongField(String standalong) {
        this.standalong = standalong;
    }


    @Override
    public String generate() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("// Standalone: ").append(standalong).append("\n");
        jsBuilder.append("standalone = ").append(standalong).append(";\n");
        return jsBuilder.toString();
    }

    @Override
    public String toString() {
        return "StandalongField{" +
                standalong +
                '}'+"\n";
    }
}
