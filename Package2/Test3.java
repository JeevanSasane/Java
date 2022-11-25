package Package2;

import Package1.Test1;

public class Test3 extends Test1{

    public static void main(String[] args) {
        Test1 t2=new Test1();
        System.out.println(t2.j);


        Test3 obj=new Test3();
        System.out.println(obj.l);
    }
}
