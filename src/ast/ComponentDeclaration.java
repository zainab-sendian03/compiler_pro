package ast;

public class ComponentDeclaration extends Node {
    ComponentBody componentBody;

    public ComponentBody getComponentBody() {
        return componentBody;
    }

    public void setComponentBody(ComponentBody componentBody) {
        this.componentBody = componentBody;
    }

    @Override
    public String generate() {
        if (componentBody == null) {
            return "";
        }

        // Get the fields from the ComponentBody
        String selector = null;
        String template = null;
        StringBuilder classMembers = new StringBuilder();

        for (Field field : componentBody.getFields()) {
            if (field instanceof SelectorField) {
                selector = ((SelectorField) field).getSelector();
            } else if (field instanceof TemplateField) {
                template = ((TemplateField) field).generate();
            } else {
                // Collect other fields like properties and methods for the class body
                classMembers.append(field.generate()).append("\n");
            }
        }

        // This is a simplified class name for now.
        String className = "MyComponent";

        StringBuilder jsBuilder = new StringBuilder();

        // 1. Start with the component class definition
        jsBuilder.append("// Component: ").append(className).append("\n");
        jsBuilder.append("class ").append(className).append(" {\n");

        // 2. Add the class body content (properties, methods, etc.)
        jsBuilder.append(classMembers);

        // 3. Add the render method with the template
        if (template != null) {
            jsBuilder.append("  render() {\n");
            jsBuilder.append("    if (!this.container) return;\n");
            jsBuilder.append("    this.container.innerHTML = ").append(template).append(";\n");
            jsBuilder.append("  }\n");
        }

        jsBuilder.append("}\n\n");

        // 4. Add the instantiation logic
        if (selector != null) {
            jsBuilder.append("component = new ").append(className).append("(").append(selector).append(");\n");
        }

        return jsBuilder.toString();
    }
    @Override
    public String toString() {
        return "ComponentDeclaration{"+"\n" + componentBody + "\n"+'}';
    }
}