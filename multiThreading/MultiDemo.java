package multiThreading;

public class MultiDemo {
    public static void main(String args[])
            throws Exception
    {
        System.out.println("Starting of Main Thread");
        Thread t1=Thread.currentThread();
        System.out.println("main Thread="+t1);
        System.out.println("Please Wait....");

        Thread.sleep(2000);
        t1.setPriority(9);
        System.out.println("Thread="+t1);
        for(int a=1;a<=5;a++)
        {
            System.out.println("A="+a);
            Thread.sleep(1000);
        }
        System.out.println("End of main Thread");

    }
}
