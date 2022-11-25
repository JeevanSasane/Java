package java8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMainOne {

    public static void main(String[] args) {

        //create a list and filter all even numbers from list
//  Create a List
        List<Integer> list=List.of(2,4,5,6,855,55,22,8,66);
        System.out.println(list);

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);

        List<Integer> list2=Arrays.asList(1,2,4,5,7,8,9);
        System.out.println(list2);

        //using stream API - find even numbers in list 1

//        Stream<Integer> stream = list.stream();
//        List<Integer>newList=stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer>newList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer>newList2=list.stream().filter(i->i>50).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
