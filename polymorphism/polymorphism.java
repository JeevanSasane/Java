package polymorphism;

//Polymorphism=> The ability to take one form to many form
//or
//One thing have many actions

public class polymorphism {

    /*
    *  Method OverLoading: A class with multiple functions with same name but different number of arguments
    *
    * Rule:
    *   1 : Changing number of arguments
    *   2 : Changing the function DataType
    *
    * Advantage:
    *   1 : It increase the readability of program
    */

    public int add(int a,int b)
    {
        return a+b;
    }

    public  double add(double a,int b)
    {
        return a+b;
    }

}
class main
{
    public static void main(String[] args) {
        polymorphism p1=new polymorphism();
        System.out.println(p1.add(1,2));
        System.out.println(p1.add(11.5,3));

    }
}

