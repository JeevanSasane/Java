package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEmpression {

    public static void main(String[] args) {

        MyInterface myInterface= ()-> {   //()anonymous inner function
            System.out.println("In Lambada");
        };
        myInterface.show();

        MyInterface1 myInterface1=(i,j)->{
            System.out.println(i+j);
        };

        myInterface1.add(5,10);


        List<Integer>list= Arrays.asList(1,2,3,4);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });


        MyInterface3 myInterface3=()-> {
                System.out.println("In set");
            };
        myInterface3.set();
    }
}
@FunctionalInterface
interface MyInterface{

    void show();
}

@FunctionalInterface
interface MyInterface1{

    void add(int i,int j);
}


@FunctionalInterface
interface MyInterface3{
    void set();
}