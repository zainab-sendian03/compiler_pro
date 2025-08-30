package ast;

import java.util.ArrayList;
import java.util.Objects;

public class ClassDeclaration extends Node {
    public String name;
    public ArrayList<Node> body = new ArrayList<>();

    public ClassDeclaration(String name) {
        this.name = name;
    }

    public void add(Node node) {
        body.add(node);
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ").append(name).append(" {\n");

        // أولاً نجمع الـ properties
        ArrayList<PropertyDeclaration> props = new ArrayList<>();
        ConstructorDecl ctor = null;

        for (Node member : body) {
            if (member instanceof ConstructorDecl) {
                ctor = (ConstructorDecl) member;
            } else if (member instanceof PropertyDeclaration) {
                props.add((PropertyDeclaration) member);
            }
        }

        // نولّد constructor
        if (ctor != null) {
            sb.append("  ").append(ctor.generate()).append("\n");
        } else if (!props.isEmpty()) {
            if (Objects.equals(name, "Product")){
                sb.append("  constructor(");
                for (int i = 0; i < props.size(); i++) {
                    sb.append(props.get(i).name);
                    if (i < props.size() - 1) sb.append(", ");
                }
                sb.append(") {\n");
                for (PropertyDeclaration prop : props) {
                    sb.append("    this.").append(prop.name).append(" = ").append(prop.name).append(";\n");
                }
                sb.append("  }\n");
            }
          else {
                sb.append("  constructor()");

                sb.append("{\n");
                for (PropertyDeclaration prop : props) {
                    sb.append(prop.generate()).append(";\n");
                }
                sb.append("  }\n");
            }
        }// نولّد constructor
       else {
            // لا constructor ولا properties → نولّد constructor فاضي
            sb.append("  constructor() {}\n");
        }
        for (Node member : body) {
            if (!(member instanceof ConstructorDecl)) {
                if (member instanceof PropertyDeclaration){

                }else {
                    sb.append(member.generate());

                }
            }
        }
        sb.append("}\n");
        return sb.toString();
    }


    @Override
    public String toString() {
        return "class " + name + "{" + body + "}";
    }
}
