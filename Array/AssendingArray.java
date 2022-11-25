package Array;

public class AssendingArray {

    public static void main(String[] args) {

        int arr[]={3,5,9,1,6,4};
        int max;

        System.out.println("Original Array");

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    max=arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;
                }

            }

        }
        System.out.println();
        System.out.println("Array in Assending order");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
