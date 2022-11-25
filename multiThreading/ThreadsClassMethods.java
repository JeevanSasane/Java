package multiThreading;

public class ThreadsClassMethods {

    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In Run");
            }
        });

        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In T2");
            }
        });

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In T3");
            }
        });

        t2.setPriority(1);
        t3.setPriority(10);
        t2.start();
        t3.start();


    }
}
