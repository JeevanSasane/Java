package multiThreading;

public class SynchronizedDemo {


    static int i;

    private static void increase(){
        synchronized (SynchronizedDemo.class){
            i++;
        }

    }

    //synchronized will lock thread for perticuller time
    public static void main(String[] args) throws InterruptedException {

//        SynchronizedDemo synchronizedDemo=new SynchronizedDemo();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=100;i++) {
                    increase();
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=100;i++){
                    increase();
                }
            }
        });

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=100;i++){
                    increase();
                }
            }
        });

        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=100;i++){
                increase();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println(i);


    }
}
