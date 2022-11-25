package multiThreading;

public class ThreadDemo {

    Thread t1;
    String name;

    public void ThreadDemo(String x){
        t1=new Thread();
        name=x;
        t1.start();
    }

    public void run() throws InterruptedException {
        System.out.println("In Run");

        for(int i=0;i<10;i++)
        {
            System.out.println(name);
        }

        Thread.sleep(1000);
    }
}
