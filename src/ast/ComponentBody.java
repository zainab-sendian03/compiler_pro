package ast;

import java.util.ArrayList;
import java.util.List;

public class ComponentBody extends Node implements Addable<Field>{
    List<Field> fields;

    public ComponentBody() {
        this.fields = new ArrayList<>();
    }


    public List<Field> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        return "ComponentBody{" +"\n" + fields + "\n"+'}';
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (Field field : fields) {
            String generatedCode = field.generate();
            if (generatedCode != null) {
                sb.append(generatedCode);
            }
        }
        return sb.toString();
    }
    @Override
    public void add(Field item) {
        fields.add(item);
    }
}