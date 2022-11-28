package java8;

public class MethodRefStatic {


    public static void display(){
        System.out.println("In Static");
    }
    public static void set(){
        System.out.println("In set");
    }

    public static void main(String[] args) {

        MyInterface5 myInterface5=MethodRefStatic::display;
        myInterface5.show();

        myInterface5=MethodRefStatic::set;
        myInterface5.show();
    }
}

interface MyInterface5{

    void show();
}
