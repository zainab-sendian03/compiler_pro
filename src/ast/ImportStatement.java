package ast;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ImportStatement extends Node {
    public ArrayList<String> identifiers = new ArrayList<>();
    public String fromModule;

    public ImportStatement(String fromModule) {
        this.fromModule = fromModule;
    }

    public void addIdentifier(String id) {
        identifiers.add(id);
    }

    @Override
    public String generate() {
        // نحافظ على السطر كـ import JS إن كان module مسموح؛
        // لكن إن كنت تريد ملف غير module (تشغيل مباشر في المتصفح),
        // يمكنك توليد تعليق يشرح ما كان يُستورَد.
        if (this.fromModule.startsWith("@") || this.fromModule.contains("rxjs")) {
            // نحول إلى تعليق لأننا سنستبدل وظائف rxjs يدويًا
            return "// original import from " + this.fromModule + " : { "
                    + String.join(", ", this.identifiers) + " }\n";
        } else {
            return "import { " + String.join(", ", this.identifiers) + " } from \"" + this.fromModule + "\";\n";
        }
    }


    @Override
    public String toString() {
        return "import { " + String.join(", ", identifiers) + " } from \"" + fromModule + "\";";
    }
}
