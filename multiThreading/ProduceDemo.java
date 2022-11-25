package multiThreading;

public class ProduceDemo {

    int num;
    Boolean flag = false;
    public synchronized void getNum(){

        if(!flag)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("GET: "+this.num);
        flag=false;
        notify();
    }
    public synchronized void setNum(int num){

        if(flag)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.num=num;
        System.out.println("SET: "+num);
        flag=true;
        notify();
    }


    public static void main(String[] args) {

        ProduceDemo produceDemo=new ProduceDemo();


        Thread t1=new Thread(()->{
            int i=0;

            while (true)
            {
                produceDemo.setNum(i++);

                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();

        Thread t2=new Thread(()->{
            int i=0;

            while (true)
            {

                produceDemo.getNum();
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t2.start();


    }


}
