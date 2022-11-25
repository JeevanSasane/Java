package finalDemo;

//Notes:
// ** final keyword:
//     1: to declare a constant or if u declare final variable you can not change value.
//     2: if you declare final method then you can not override the method
//     3: if you declare final class then you can not inherite the class

public class FinalDemo {

   final int i = 10;

    public void show()
    {
//        i=20;  //you can not change the value of final variable

    }

    public static void main(String[] args) {
        FinalDemo f1=new FinalDemo();
        f1.show();

        System.out.println(f1.i);
    }

}
