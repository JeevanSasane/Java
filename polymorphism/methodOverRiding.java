package polymorphism;

/*
* Method Overriding :- If two classes have same methods and same Signatures/Parameter List
*
* Advantage:
*   1: You are implementing parent class into child class
* */
public class methodOverRiding {

    public void sound()
    {
        System.out.println("Animal Sound");
    }
}

 class Cat extends methodOverRiding
{
    public void sound()
    {
        System.out.println("cat Sound");
    }
    public static void main(String[] args) {
        Cat c=new Cat();
        c.sound();
    }
}