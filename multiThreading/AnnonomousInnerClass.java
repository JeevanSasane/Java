package multiThreading;

public class AnnonomousInnerClass {

    public static void main(String[] args) {

        MyInterface myInterface=new MyInterface() {
            @Override
            public void show() {
                System.out.println("In show");
            }

            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        myInterface.show();
        myInterface.add(4,5);

    }
}

interface MyInterface{
    void show();
    int add(int a,int b);
}