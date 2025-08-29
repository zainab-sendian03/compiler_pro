package ast;

public class InjectableDeclaration extends Node {
    public String providedIn;

    public InjectableDeclaration(String providedIn) {
        this.providedIn = providedIn;
    }

    @Override
    public String generate() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("// Injectable Service\n");
        jsBuilder.append("class InjectableService {\n");
        jsBuilder.append("  constructor() {\n");

        jsBuilder.append("    this.providedIn = ").append(providedIn).append(";\n");
        jsBuilder.append("  }\n");
        jsBuilder.append("}\n\n");
        return jsBuilder.toString();
    }

    @Override
    public String toString() {
        return "@Injectable({ providedIn: " + providedIn + " })";
    }
}