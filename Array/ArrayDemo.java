package Array;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

//        int arr[]=new int[5];

//        Scanner sc=new Scanner(System.in);
//
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println("Enter Array Value");
//            arr[i]=sc.nextInt();
//        }

        int arr[]={6,1,2,3,4,4,5,5,6,6,6};
        int arr1[]={};
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                     System.out.println(arr[i]);
                     return;
                }
            }
        }


        }
    }

