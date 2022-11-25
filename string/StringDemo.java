package string;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter name:");
//        String name=sc.nextLine();
//
//        System.out.println("your name is:"+name);
//

        //** Concatenation

//        String fname="Jeevan";
//        String lname="Sasane";
//        String fullName=fname+" "+lname;
//
//        System.out.println(fullName);
//        System.out.println(fullName.length());
//
//        for (int i=0;i<fullName.length();i++)
//        {
//            System.out.println(fullName.charAt(i));
//        }


//        compare

//        String fname="Jeevan";
//        String lname="Jeevan";
//
//
//        if(fname.compareTo(lname)==0){
//            System.out.println("String are Equals");
//        }else {
//            System.out.println("String are not Equal");ij
//        }

        String sen="My name is Jeevan";

        String name=sen.substring(11,sen.length());
        System.out.println(name);




    }


}
