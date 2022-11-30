package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIpractice implements Actor{

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        });
        list.forEach(e-> System.out.println(e));
    }

    @Override
    public void act() {

    }

    @Override
    public void speak() {

    }
}

 interface Actor{

    void act();
    void speak();
}