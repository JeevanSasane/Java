package java8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjectDemo {

    public static void main(String[] args) {

        // stream api -collection process
        // collection / group of object

        // 1- blank stream
        Stream<Object> emptyStream=Stream.empty();

        // 2 - array,object,collection
        String names[]={"Ankit","Jeevan","Nitin","Vishal"};

        Stream<String>stream=Stream.of(names);
        stream.forEach(e->{
            System.out.println(e);
        });

//        3 -
        Stream<Object> stream1=Stream.builder().build();


        IntStream stream2= (IntStream) Arrays.stream(new int[]{2,3,5,4,8,6});
        stream2.forEach(e->{
            System.out.println(e);
        });

        System.out.println();
        // 5 - list,set

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        Stream<Integer> stream3=list1.stream();
        stream3.forEach(e->{
            System.out.println(e);
        });


    }
}
