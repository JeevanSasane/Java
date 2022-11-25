package multiThreading;

public class producerConsumer {

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
}

class Producer implements Runnable{

    producerConsumer producerConsumer;

    public Producer(producerConsumer producerConsumer)
    {
        this.producerConsumer= producerConsumer;
        Thread t1=new Thread(this);
        t1.start();;
    }
    @Override
    public void run() {
        int i=0;

        while (true)
        {
            producerConsumer.setNum(i++);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements  Runnable{

    producerConsumer producerConsumer;

    public Consumer(producerConsumer producerConsumer)
    {
        this.producerConsumer=producerConsumer;
        Thread t1=new Thread(this);
        t1.start();;

    }

    @Override
    public void run() {
        int i=0;

        while (true)
        {
            producerConsumer.getNum();

            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class main{
    public static void main(String[] args) {
        producerConsumer producerConsumer =new producerConsumer();
        Producer producer=new Producer(producerConsumer);
        Consumer consumer=new Consumer(producerConsumer);
    }
}
