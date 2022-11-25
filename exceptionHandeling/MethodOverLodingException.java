package exceptionHandeling;

public class MethodOverLodingException {

    public void display()
    throws Exception
    {
        System.out.println("In Display");
    }
    public static void main(String[] args) {

    }
}

class MethodOverRiding extends MethodOverLodingException{

    public void display()
    throws Exception
    {
        System.out.println("In Display MethodOverRiding");
    }
}


//** Rules:-

// 1: if parent class declare no Exception then you can declare only unchecked exception
// 2: if parent class declare exception then you can declare same exception
// 3: if parent class declare exception then you can declare child exception