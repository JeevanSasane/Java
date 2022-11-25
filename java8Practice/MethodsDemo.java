package java8Practice;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsDemo {
    public static void main(String[] args) {

        //filer(predicate)
            //boolean value function
            //e->e>10 - returns  true or false


        //map(function)
            //each element operation
            //it returns a value


        List<String> list=List.of("Jeevan","Ankit","Nitin","Amit","Vishal","Abhay");
        List<String>names=list.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(names);


        List<Integer> list1=List.of(22,1,2,5,4,5,6);
        List<Integer>number=list1.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(number);

        list.stream().forEach(e->{
            System.out.println(e);
        });

        System.out.println();
        names.stream().forEach(System.out::println);

        System.out.println();
        //sorted

        list1.stream().sorted().forEach(System.out::println);
        List<Integer>comp= Collections.singletonList(list1.stream().min((x, y) -> x.compareTo(y)).get());
        System.out.println("Min "+comp);

        List<Integer>comp1= Collections.singletonList(list1.stream().max((x, y) -> x.compareTo(y)).get());
        System.out.println("Max "+comp1);
    }
}
