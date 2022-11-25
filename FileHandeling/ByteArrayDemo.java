package FileHandeling;

import java.io.*;

public class ByteArrayDemo {

    public static void main(String[] args) {

        try {
            FileOutputStream abj1=new FileOutputStream("abc1.txt");
            FileOutputStream abj2=new FileOutputStream("abc2.txt");

            ByteArrayOutputStream outputStream =new ByteArrayOutputStream();
            byte[] arr="Jeevan".getBytes();

            outputStream.write(arr);

            outputStream.writeTo(abj1);
            outputStream.writeTo(abj2);

            System.out.println("File Write Successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {

            FileInputStream fileInputStream=new FileInputStream("abc1.txt");
            FileInputStream fileInputStream1=new FileInputStream("abc2.txt");

            SequenceInputStream sequenceInputStream=new SequenceInputStream(fileInputStream,fileInputStream1);
//            for(int i=fileInputStream.read();i>=0;)
//            {
//                System.out.print((char)i);
//                i=fileInputStream.read();
//            }
//            System.out.println();
//            for(int i=fileInputStream1.read();i>=0;)
//            {
//                System.out.print((char)i);
//                i=fileInputStream1.read();
//            }

            for(int i=sequenceInputStream.read();i>=0;)
            {
                System.out.print((char) i);
                i=sequenceInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
