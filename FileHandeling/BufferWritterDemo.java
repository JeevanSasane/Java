package FileHandeling;

import java.io.*;

public class BufferWritterDemo {
    public static void main(String[] args) {



//        How to generate pdf file using java
//        itext pdf java

        FileWriter f3 = null;
//        BufferWritter bufferWritter=null;
        BufferedWriter bufferWritter=null;
        try {
            f3 = new FileWriter("Buffer.txt");
            bufferWritter=new BufferedWriter(f3);
            bufferWritter.write("Jeevan sasane");
//            String str = "Jeevan";
//            f3.write(str + " Sasane");
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
