package java8;

public class DefaultAndStatic implements MyInterface2{

    @Override
    public void show() {
        System.out.println("in Show");
    }

    @Override
    public void get() {
        System.out.println("In get");
    }

    @Override
    public void set() {
        System.out.println("In Set");
    }

    public static void main(String[] args) {

        DefaultAndStatic obj=new DefaultAndStatic();
        obj.show();
        obj.dispaly();
        obj.get();
        obj.set();

        MyInterface2.test();
    }
}

interface MyInterface2{

    void show();

    default void dispaly(){
        System.out.println("In Display");
    }

    static void test(){
        System.out.println("In test");
    }

    void get();

    public void set();
}
