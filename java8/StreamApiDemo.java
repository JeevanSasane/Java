package java8;

/*
*   stream API=it is sequence of object and it have many mothods we combile that method and produce desire result
*
* types - sequential and parallel stream(multithreading)
*
* operation- intermediate and terminal
*
* terminal - forEach(),reduce(),collect()
* intermediate - map(function),filter(Predicate),sorted()
*
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class StreamApiDemo {

    public static void main(String[] args) {

//        Function<Integer, Integer> fun=(integer)->integer*integer;
//        System.out.println(fun.apply(9));
//        Function<String,Integer> str=st->st.length();
//        System.out.println(str.apply("Jeevan"));

        List<String> list= Arrays.asList("Jeevan","Amitttttt","Manish");


        String longString=list.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longString);
    }
}
