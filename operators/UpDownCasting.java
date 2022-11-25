package operators;

public class UpDownCasting {
    public static void main(String[] args) {

        System.out.println("Parent Class");
        Parent p1=new Parent();
        p1.show();

        System.out.println("\n");
        System.out.println("Child Class");
        Child c1=new Child();
        c1.show();
        c1.display();

        System.out.println("\n");
        System.out.println("Up Casting Parent Class");
        Parent objP=new Child(); //Up Casting
        objP.show();

        System.out.println("\n");
        System.out.println("Down Casting Child Class");
        Child obj=(Child) objP; //Down Casting
        obj.show();
        obj.display();


    }
}

class Parent{
    public void show()
    {
        System.out.println("In Parent");
    }
}

class  Child extends Parent
{
    public void display()
    {
        System.out.println("In Child");
    }

}
