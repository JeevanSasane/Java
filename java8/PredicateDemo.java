package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateDemo {

    public static void main(String[] args) {

        Function<Integer,Integer> fun=(integer -> integer/2);

        System.out.println(fun.apply(10));
//        System.out.println(IntStream.range(1,12).sum());

//
//        List<Integer> list =Arrays.asList(1,2,3,44,5,6);
//        Predicate<Integer> max=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return  integer>5;
//            }
//        };

//        list.stream().filter(max).forEach(System.out::println);


//        List<Integer> list2=Arrays.asList(1,21,3,4,5);
//        int max1=list2.get(0);
//        for(int i=0;i<list2.size();i++){
//            if(list2.get(i)>max1){
//                max1=list2.get(i);
//            }
//        }
//        System.out.println("Max="+max1);

//
        List<Integer> list=Arrays.asList(1,2,3,4,5,7,2,3);
//        System.out.println(list.stream().max());

//        System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 7).max().getAsInt());


//        System.out.println(IntStream.of(list).max().getAsInt());



        Function<String,Integer> str=st->st.length();

        Function<String ,Integer > str2=s->s.length();















    }
}
