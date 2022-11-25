package exceptionHandeling;

import java.util.Locale;

public class ExceptionDemo {

    public static void main(String[] args) {

        int i=10;
        int j=5;
        int k=0;
//        double k=0.0;

        try {
//            k=(double)i/j;
            k=i/j;

            try{
            String str=null;
            System.out.println(str.toUpperCase());
            }catch(NullPointerException e){
                System.out.println("Null Pointer==>"+e);
            }
            System.out.println("In try Block");

        }catch (ArithmeticException e){
            System.out.println("RunTime==>"+e);
        } finally {
            System.out.println("In Finally");
        }
        System.out.println(k);

        System.out.println("Hii");
    }
}
