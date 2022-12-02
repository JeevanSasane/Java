package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,1);

        Optional<Integer> op=list.stream().reduce((a,b)->(a>b)?a:b);
        System.out.println(op.get());

        List<String> list1=Arrays.asList("Jeevan","Amit","Manish","Tejas");
//        Optional<String> op1= Optional.of(list1.stream().min(Comparator.comparing(String::length)).get());
        Optional<String > op1=list1.stream().reduce((a,b)->(a.length()<b.length())?a:b);

        System.out.println(op1.get());

    }
}
