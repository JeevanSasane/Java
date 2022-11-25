package Array;

public class ArrayTwo {

    public static void main(String[] args) {

        int arr[]={1,3,6,9,2,3,9,6};

                for(int i=0,j=arr.length-1;i<=j;i++,j--)
                {
                    System.out.print(arr[i]*arr[j]+" ");

                }
    }
}
