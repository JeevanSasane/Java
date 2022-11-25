package operators;

interface MyInterface{

}
public class MarkerDemo implements MyInterface{

    public void add(){
        System.out.println("In Add Method");
    }

    public static void main(String[] args) {
        MarkerDemo obj=new MarkerDemo();

        if(obj instanceof MyInterface)
        {
            obj.add();
        }
    }

}
