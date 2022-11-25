import java.util.Scanner;

public class RoundeFigure {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double i;
        System.out.println("Enter any number: ");
        i= sc.nextDouble();

        double div = i % 100;
        if (div <= 25) {
            System.out.println(fl(i));
        } else if (div > 25 && div <= 50) {
            System.out.println(cl(i));
        } else if (div > 50 && div <= 74) {
            System.out.println(fl(i));
        } else if (div >= 75) {
            System.out.println(cl(i));
        }
//        System.out.println(Math.floor(i));
//        System.out.println(Math.ceil(i));
    }

    private static double fl(double i) {
        return 50 * (Math.floor(Math.abs(i / 50)));
    }

    private static double cl(double i) {
        return 50 * (Math.ceil(Math.abs(i / 50)));
    }
}
