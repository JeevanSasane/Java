package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StoredDemoPractice {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,211,3,44,5,6);

        Set<Integer> list1=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toSet());

        System.out.println(list1);

//
//        List<Integer> list = Arrays.asList(1,2,34,4,5);
//
//        Set<Integer> list1 = list.stream().
//                sorted(Collections.reverseOrder()).collect(Collectors.toSet());
//        System.out.println(list1);

    }
}
