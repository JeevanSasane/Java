package encapsulation;

// *** Notes ***
//Encapsulation:
//          Wrapping up Data into single unit E.g- class
//          In this we are declaring field as a private and giving access via public getter and setter

//Advantage:
//      1: You can make class Read only or write only.
//      2: You can write validation in public getter and setters.

public class EncapDemo {
    private int id;
    private String name;
    private String address;

    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
//        id=1;
        return id;
    }


    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }

    public static void main(String[] args) {
        EncapDemo e=new EncapDemo();
        e.setId(1);
        e.setName("Jeevan");
        e.setAddress("Satara");


        System.out.println("Id= "+e.id+" Name= "+e.name+" Address= "+ e.address);

        System.out.println("Id :"+e.id);
        System.out.println("Name :"+e.name);
        System.out.println("Address :"+e.address);

    }
}
