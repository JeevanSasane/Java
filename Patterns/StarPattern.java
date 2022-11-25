package Patterns;

public class StarPattern {

    public static void main(String[] args) {

        int i, j;
//        for(i=1;i<=5;i++)
//        {
//            for(j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//        for(i=4;i>=1;i--)
//        {
//            for(j=i;j>=1;j--)
//            {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }

//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
//        for(i=1;i<=5;i++)
//        {
//            for(j=4;j>=i;j--)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//    }
//}

        for (i = 1; i <= 5; i++) {
            for (j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}