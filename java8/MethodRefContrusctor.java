package java8;

interface MyInterface6{

    MethodRefContrusctor getConst();
}
public class MethodRefContrusctor {

    MethodRefContrusctor(){
        System.out.println("In Constructor");
    }

    public static void main(String[] args) {

        MyInterface6 myInterface6=MethodRefContrusctor::new;
        myInterface6.getConst();

    }
}
