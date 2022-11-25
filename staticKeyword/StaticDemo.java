package staticKeyword;

public class StaticDemo {

    int id;
    String name;
    static String cmpName;

    static {
        cmpName="CodeKul";

        System.out.println("In Static Block");
    }
    public StaticDemo(int id, String name) {
        this.id = id;
        this.name = name;
//        this.cmpName = cmpName;
    }

    public static void show()
    {
        System.out.println("Static method");
    }

     static class inner
     {
        public static void show1()
        {
            System.out.println("Inner Static");
        }
     }

     class Inner2
     {
         public void show3()
         {
             System.out.println("Inner 2");
         }
     }





    public static void main(String[] args) {

        StaticDemo obj=new StaticDemo(1,"Jeevan");
        StaticDemo obj2=new StaticDemo(2,"Amit");
        StaticDemo obj3=new StaticDemo(2,"Tejas");

        System.out.println(obj.id+" "+obj.name+" "+cmpName);
        System.out.println(obj2.id+" "+obj2.name+" "+cmpName);
        System.out.println(obj3.id+" "+obj2.name+" "+cmpName);

        show();

        inner i1=new inner();
        i1.show1();

//        inner.show1();

        StaticDemo.Inner2 i2= obj.new Inner2();
        i2.show3();
    }
}
