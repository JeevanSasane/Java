package Array;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int i,j;
        float per;

        System.out.println("Enter Marks of Subject:");
        for( i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        j=arr[0];
        for ( i=0;i< arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[i]=j;
        for ( i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        j=arr.length-1;
        for(i=0;i< arr.length;i++)
        {

        }


    }
}
