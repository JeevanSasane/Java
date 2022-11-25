package FileHandeling;

import java.io.*;
import java.util.Scanner;

public class BufferDemo {

    public static void main(String[] args) {

        File file=new File("Text3.txt");

        Scanner sc=new Scanner(System.in);

        try{
            FileOutputStream fileOutputStream=new FileOutputStream(file);

            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            System.out.println("Enter Value:");
            String str=sc.next();
            byte[] arr= str.getBytes();
            System.out.println("File Write Successfully");

            bufferedOutputStream.close();
            fileOutputStream.close();

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }


        try{
            FileInputStream fileInputStream=new FileInputStream(file);


            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

//            int i=fileInputStream.read();

            for (int i = bufferedInputStream.read(); i >= 0; ) {
                System.out.print((char) i);
                i =bufferedInputStream.read();
            }

            bufferedInputStream.close();
            fileInputStream.close();
        }catch (IOException f)
        {
//            System.out.println(f.getMessage());
            throw new RuntimeException(f);
        }

    }
}
