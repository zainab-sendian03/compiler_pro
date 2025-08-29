package ast;
import java.util.ArrayList;
public class ConstructorDecl extends Node{
    public ArrayList<PropertyDeclaration> parameters = new ArrayList<>();
    public ArrayList<Statement> body = new ArrayList<>();
    public ConstructorDecl(ArrayList<PropertyDeclaration> parameters, ArrayList<Statement> body) {
        this.parameters = parameters;
        this.body = body;
    }

    // لاحظ: نستقبل properties من ClassBody لنولّدها تلقائياً داخل constructor
    // نولّد الكونستركتر مع خصائص الكلاس
    public String generate(ArrayList<PropertyDeclaration> props) {
        StringBuilder sb = new StringBuilder();
        sb.append("  constructor(");

        // نحدد أي parameters نستخدم: props من ClassBody أو الموجودين داخله
        ArrayList<PropertyDeclaration> paramsToUse =
                (props != null && !props.isEmpty()) ? props : parameters;

        if (paramsToUse != null && !paramsToUse.isEmpty()) {
            for (int i = 0; i < paramsToUse.size(); i++) {
                sb.append(paramsToUse.get(i).generate());
                if (i < paramsToUse.size() - 1) sb.append(", ");
            }
        }

        sb.append(") {\n");

        // جسم الكونستركتر (functionCall أو أي Statement)
        if (body != null && !body.isEmpty()) {
            for (Node stmt : body) {
                sb.append("    ").append(stmt.generate()).append("\n");
            }
        }

        sb.append("  }\n");
        return sb.toString();
    }

    @Override
    public String generate() {
        return generate(null);
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Constructor(");
        if (parameters != null && !parameters.isEmpty()) {
            sb.append("properties=[");
            for (int i = 0; i < parameters.size(); i++) {
                sb.append(parameters.get(i).toString());
                if (i < parameters.size() - 1) sb.append(", ");
            }
            sb.append("]");
        }
        if (body != null && !body.isEmpty()) {
            if (!sb.toString().endsWith("(")) sb.append(", ");
            sb.append("body=[");
            for (int i = 0; i < body.size(); i++) {
                sb.append(body.get(i).toString());
                if (i < body.size() - 1) sb.append(", ");
            }
            sb.append("]");
        }
        sb.append(")");
        return sb.toString();
    }
}