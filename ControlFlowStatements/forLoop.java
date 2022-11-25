package ControlFlowStatements;

import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {

        int arr[]=new int[5];

//        arr[0]=10;
//        arr[1]=12;
//        arr[2]=13;
//        arr[3]=14;
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array of size 5:");
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=sc.nextInt();
        }
//        System.out.println("\n");
//        System.out.println("Accepted Array:");
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0) {

                System.out.print(arr[i] + "Even ");
            }

            else
            {
                System.out.print(arr[i]+"Odd ");
            }
        }

    }
}
