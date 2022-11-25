package CollectionFramework;


// LinkedList stores duplicate values
// LinkedList maintains insertion order
// LinkedList uses doubly linked list to stores the elements


import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2=new LinkedList<>();
        list2.addAll(list);

        System.out.println(list2);


        System.out.println(list);
    }
}
