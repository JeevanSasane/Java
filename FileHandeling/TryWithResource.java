package FileHandeling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {

        File file = new File("D:\\codeKulJava\\src\\FileHandeling\\SampleOne.text");
        try (FileWriter f3 = new FileWriter(file)) {
            String str = "Jeevan";
            f3.write(str + " Sasane");
            System.out.println("File Write Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }


        try(FileReader fr= new FileReader ("D:\\codeKulJava\\src\\FileHandeling\\SampleOne.text")) {

            for (int i = fr.read(); i >= 0; ) {
                System.out.print((char) i);
                i = fr.read();
            }
            System.out.println();
            System.out.println("File Read Successfully");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}