package Code_Generation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Page {
    private String pageName;
    protected FileWriter myWriter;
    private File file;

    public Page(String pageName ){
        this.pageName=pageName;
        try {
            // إنشاء كائن File يمثل دليل الإخراج
            File outputDir = new File("output");
            // التحقق مما إذا كان الدليل غير موجود، ثم إنشاؤه
            if (!outputDir.exists()){
                outputDir.mkdirs(); // .mkdirs() ينشئ جميع الأدلة اللازمة
            }

            String filePath = "output/"+pageName;
            file = new File(filePath);
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
            myWriter=  new FileWriter(file); // استخدم كائن File بدلاً من المسار النصي
        }catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace(); // طباعة تتبع الخطأ يساعد في فهم سبب المشكلة
        }
    }

    public void writeOnFile(String code){
        try {
            System.out.println(file.isFile());
            System.out.println(file.getName());
            myWriter.write(code);
            System.out.println("test write on file");
        } catch (IOException e) {
            System.out.println("An error occurred."+ e.getMessage());
            e.printStackTrace();
        }
    }

    public void closeFile(){
        try {
            if (myWriter != null) {
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}