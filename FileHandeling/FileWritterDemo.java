package FileHandeling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterDemo {

    public static void main(String[] args) {

//        File file=new File("Text1.text");
//
//        try{
//            FileWriter f3=new FileWriter(file);
//            String str="Jeevan";
//            f3.write(str+" Sasane");
//            System.out.println("File Write Successfully");
//            f3.close();
//        }catch (Exception e)
//        {
//            System.out.println(e);
//        }
        File file = new File("D:\\codeKulJava\\src\\FileHandeling\\Sample.text");
        FileWriter f3 = null;
        try {
            f3 = new FileWriter(file);
            String str = "Jeevan";
            f3.write(str + " Sasane");
            System.out.println("File Write Successfully");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                f3.close();
            } catch (IOException a) {
                System.out.println(a);
            }
        }


        FileReader fr=null;
        try {

             fr = new FileReader("D:\\codeKulJava\\src\\FileHandeling\\Sample.text");
            for (int i = fr.read(); i >= 0; ) {
                System.out.print((char) i);
                i = fr.read();
            }
            System.out.println();
            System.out.println("File Read Successfully");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
            }catch (IOException a)
            {
                throw new RuntimeException(a);
            }

        }
    }
}
