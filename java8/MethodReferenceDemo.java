package java8;

@FunctionalInterface
interface MyInterface4{

    void show();
}
public class MethodReferenceDemo {


    public void display(){
        System.out.println("In Display");
    }

    public void set(){
        System.out.println("In Set");
    }
    public static void main(String[] args) {
        MethodReferenceDemo methodReferenceDemo=new MethodReferenceDemo();

        MyInterface4 myInterface4=methodReferenceDemo::display;
        myInterface4.show();
        myInterface4=methodReferenceDemo::set;
        myInterface4.show();
    }
}
