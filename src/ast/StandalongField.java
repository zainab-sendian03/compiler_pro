package ast;

public class StandalongField extends Field{
    String standalong;

    public StandalongField(String standalong) {
        this.standalong = standalong;
    }

    @Override
    public String toString() {
        return "StandalongField{" +
                standalong +
                '}'+"\n";
    }
}
