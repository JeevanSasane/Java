package Inheritance;

public class college {
    int id;
    String name;
    String address;

    public void set()
    {
        id=1;
        name="YCIS";
        address="Satara";
    }

    public void show()
    {
        System.out.println("This is College Class \n");
        System.out.println("Id="+id);
        System.out.println("name="+name);
        System.out.println("Address"+address);
    }


}
class teacher extends college
{
    public void set()
    {
        id=1;
        name="Vaibhav sir";
        address="Pune";
    }

    public void show()
    {
        System.out.println("This is Teacher Class \n");
        System.out.println("Id="+id);
        System.out.println("name="+name);
        System.out.println("Address"+address);
    }

}

class students extends teacher
{
    public void set()
    {
        id=1;
        name="Jeevan";
        address="Satara";
    }

    public void show()
    {
        System.out.println("This is Student Class \n");
        System.out.println("Id="+id);
        System.out.println("name="+name);
        System.out.println("Address"+address);
    }

}

class room extends teacher
{
    public void set()
    {
        id=1;
        name="Class1";
        address="Pune";
    }

    public void show()
    {
        System.out.println("This is Room Class \n");
        System.out.println("Id="+id);
        System.out.println("name="+name);
        System.out.println("Address="+address);
    }

}

class Main{
    public static void main(String[] args) {
        college clg=new college();
        clg.set();
        clg.show();

        teacher t1=new teacher();
        t1.set();
        t1.show();

        students s1=new students();
        s1.set();
        s1.show();

        room r1=new room();
        r1.set();
        r1.show();
    }
}



