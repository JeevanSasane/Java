package ControlFlowsStatements;

import java.util.Scanner;
public class Addition {
    public static void main(String[] args)
    throws Exception
    {
        Scanner sc=new Scanner(System.in);

        int no,sum=0;
        char ch;

        do {
            System.out.println("Enter any number");
            no=sc.nextInt();

            sum=sum+no;
            System.out.println("Do you want to continue:");

            ch=(char)System.in.read();
//            ch=sc.next().charAt(0);



        }while (ch=='y' || ch=='Y');

        System.out.println("Sum="+sum);
    }
}
