package multiThreading;

public class runDemo implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("In Run Method");
    }
    public static void main(String[] args) {

        runDemo r1=new runDemo();
        Thread t1=new Thread(r1);
        t1.start();
//        System.out.println(t1.getName());
    }



}
