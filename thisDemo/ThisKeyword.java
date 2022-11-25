package thisDemo;

//Notes:
// ** this:
//          1: this keyword used to refer current class instance variable
//          2: this keyword is used to invoke current class methods
//          3: this keyword is used to invoke current class constructor
public class ThisKeyword {

    int id;
    String name;
    String address;

    public void show()
    {
        System.out.println("in Show Method");
    }

    public void display()
    {
        System.out.println("In Display method");
        this.show();
    }
    public ThisKeyword(int id,String name,String address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.show();
//        this.display();
    }

    public ThisKeyword()
    {
        this(2,"Amit","Satara");
        System.out.println("Id      :"+this.id);
        System.out.println("name    :"+this.name);
        System.out.println("Address :"+this.address);


    }

    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(1,"Jeevan","Satara");

        System.out.println("Id      :"+obj.id);
        System.out.println("name    :"+obj.name);
        System.out.println("Address :"+obj.address);

        System.out.println("\n");

        ThisKeyword obj2=new ThisKeyword();

    }
}
