package java8;

public class DefaultAndStatic implements MyInterface2{

    public static void main(String[] args) {

        DefaultAndStatic obj=new DefaultAndStatic();
        obj.show();
        obj.dispaly();

        MyInterface2.test();

    }

    @Override
    public void show() {
        System.out.println("in Show");
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
}
