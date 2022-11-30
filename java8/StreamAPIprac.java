package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPIprac {

    public static void main(String[] args) {

//
//        long count=strList.stream().filter(x->x.isEmpty()).count();
//
//        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
//
//        Function<Integer ,Integer> function=new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer*2;
//            }
//        };
//
//        list.stream().map(function).forEach(System.out::println);
//
//
//        List<String> strList= Arrays.asList("A","B","C");
//
//        Function<String,String> function1=f->f.toLowerCase();
//
//        strList.stream().map(function1).forEach(System.out::println);



        //** filter

//        int i=0;
//        Predicate<Integer> predicate=p->p.equals(8);
////        System.out.println(predicate.test(i));
//
//        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
//
//        Predicate<Integer> predicate1=p->p>5;
//        Function<Integer,Integer> function= f->f*2;
//        list.stream()
//                .map(function)
//                .filter(predicate)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        List<Integer> list=Arrays.asList(1,2,3,88,5,7);

        Set<Integer> list1=list.stream().
                sorted(Collections.reverseOrder()).collect(Collectors.toSet());
        System.out.println(list1);
    }

}
