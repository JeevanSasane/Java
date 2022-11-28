package java8;

@FunctionalInterface
interface sayable{

    void say();

}

@FunctionalInterface
interface show{

    void show1();
}


public class MethodsReferencesPrac {

    public static void saySomething(){
        System.out.println("Hello,This is Static method..");
    }
    public static void main(String[] args) {

        sayable sayable = MethodsReferencesPrac::saySomething;
        sayable.say();

        show show=()-> {
                System.out.println("In show..!!!");
        };
        show.show1();





    }
}


