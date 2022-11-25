package FileHandeling;

import java.io.File;
import java.io.IOException;

public class FileMethods {

    public static void main(String[] args) {

        try {
        File file=new File("D:\\codeKulJava\\src\\FileHandeling\\FileMethod.text");
        if(file.exists()) {
            System.out.println("File Alredy Exists");
        }else {
            file.createNewFile();
            System.out.println("File Successfully created");
        }

            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getCanonicalFile());
            System.out.println(file.getPath());
            System.out.println(file.canExecute());
            System.out.println(file.isHidden());


            File f1=new File("Test");
            f1.mkdir();

            File f2=new File("Test\\Test1.txt");
            f2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
