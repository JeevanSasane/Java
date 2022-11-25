package Constructor;

//Constructor
//             Is a Special type of function which invoke automatically when we create object of class

//Rules:
//  1: class name and function name should be same
//  2: there is no return type to constructor
//  3: we can not declare constructor as abstract, final, static, synchronized

//Types:
//      1: default constructor
//      2: parameterised constructor

//Use:
//      1: it initialise variable to their default values


//Example:
//Default Constructor

public class ContructorDemo {

//    Default Constructor
    public ContructorDemo()
    {
        System.out.println("In Constructor");
    }

//    Parameterised Constructor
    public ContructorDemo(int a,int b)
    {
        int c=a+b;
        System.out.println("A+b="+c);
    }


    public static void main(String[] args)
    {
        ContructorDemo con=new ContructorDemo();
        ContructorDemo con2=new ContructorDemo(2,3);
    }
}

