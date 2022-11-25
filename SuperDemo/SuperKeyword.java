package SuperDemo;


//Notes:

//  1: It refers the immediate parent class variable
//  2: It refers the immediate parent class methods
//  3: It refers the immediate parent class constructor



public class SuperKeyword {

    int i=10;

    public void  show()
    {
        System.out.println("In super");
    }

    public SuperKeyword()
    {
        System.out.println("In SuperKeyword Constructor");
    }

    public SuperKeyword(int i)
    {
        System.out.println("In SuperKeyword Parameterised Constructor:"+i);
    }


}

class Sample extends SuperKeyword{


    public Sample()
    {
        super(9);
        System.out.println("In Sample Constructor");
    }

    public Sample(int i)
    {
        System.out.println("Sample Parameterised constructor"+i);
    }

    int i=20;

    public void display()
    {
        super.show();
        System.out.println("Using super keyword");
        System.out.println(super.i);
    }

    public static void main(String[] args) {

        Sample obj=new Sample(8);
//        obj.show();
        obj.display();
        System.out.println(obj.i);


    }
}
