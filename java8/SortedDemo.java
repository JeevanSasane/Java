package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,22,3,41,5,6);

//        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Integer> list2=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list2);
    }
}

//emp id add salary