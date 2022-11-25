package Abstaction.abstractdemo;

class Cricket extends footBall{
    public void show1()
    {
        System.out.println("Show Cricket");
    }

}

public class footBall extends Sports {


    @Override
    public void play() {
        System.out.println("Playing FootBall");
    }

    public void show()
    {
        System.out.println("Playing Cricket");
    }

    public static void main(String[] args) {
        footBall f1=new footBall();
        f1.play();
        f1.show();
        f1.exercise();

        System.out.println("\n");
        Cricket c=new Cricket();
        c.show1();
    }
}


//HomeWork

//Difference between abstract class and interface

// Abstract class                                                            Interface

//1: we declare abstract class using abstract keyword                we use interface keyword
//2: we can write abstract + non-abstract methods in                 only abstract methods
//   abstract class
//3: private, protected, public, default variables                   public abstract by default
//4: we can extends another class to abstract class                  we can extends another interface
//5: partial abstraction                                             100% abstraction


