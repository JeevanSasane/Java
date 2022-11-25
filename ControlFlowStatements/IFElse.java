package ControlFlowStatements;

import java.util.Scanner;

public class IFElse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//            System.out.println("Enter any 3 number:");
//            int no1 = sc.nextInt();
//            int no2 = sc.nextInt();
//            int no3 = sc.nextInt();

//            if (no1 > no2) {
//                System.out.println(no1+" is Greater");
//            }
//            else if(no2>no3){
//                System.out.println(no2+" is Greater");
//            }
//            else
//            {
//                System.out.println(no3+" is Greater");
//            }

//        if(no1+no2+no3==180)
//        {
//            System.out.println("It is a Triangle");
//
//            if(no1==90 || no2==90 || no3==90)
//            {
//                System.out.println("It is a RIght angled Triangle");
//            }
//            else
//            {
//                System.out.println("But not Right Angled Triangle");
//            }
//        }
//
//        else
//        {
//            System.out.println("It is not Triangle");
//        }


        int i=-10;
        String str= (i>0)?"Positive":"Negative";
        System.out.println(str);
    }
}
