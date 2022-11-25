package FileHandeling;

import java.io.*;

public class FileHandelingDemo {

    public static void main(String[] args) {

        File file=new File("text.text");

        try {
            FileOutputStream f1=new FileOutputStream(file);
            String str=" Jeevan";
            byte arr[]=str.getBytes();
            f1.write(67);
            f1.write(arr);
            System.out.println("File Write Successfully");
        }catch (IOException e)
        {
//            System.out.println(e.getMessage());
            e.fillInStackTrace();
        }

//        System.out.println("Hiii");

        try {
            FileInputStream f2 = new FileInputStream(file);

//            int i=f2.read();
                int i;

//            while (i>=0)
//            {
//                System.out.print((char)i);
//                i=f2.read();
//            }

            for(i=f2.read();i>=0;)
            {
                System.out.print((char)i);
                i=f2.read();
            }


            System.out.println();
            System.out.println("File Read Successfully");
            f2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
