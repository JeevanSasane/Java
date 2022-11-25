package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//ArrayList stores duplicate values
//ArrayList maintains insertion order
//ArrayList uses dynamic array to store the element
//ArrayList grows or shrink automatically by 50%
public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
//        System.out.println(list);


        List<Integer> list2=new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(5);
        list2.add(6);
//        System.out.println(list.addAll(list2));  Add elements to list1
//        System.out.println(list.removeAll(list2)); //Remove common elements of list1 and list2
//        System.out.println(list.retainAll(list2)); // Retain Common elements of list1 and list2
//        System.out.println(list.remove(3));

//        System.out.println(list.lastIndexOf(3));

//        System.out.println(list.contains(3));
//        System.out.println(list.isEmpty());
//        list.clear();

//        System.out.println(list);


// ****  Different Ways to Create ArrayList


        List<Integer> list1=new ArrayList<>();
        List<Integer> list3= Arrays.asList(1,2,3,4,5);
        List<Integer> list4=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        List<Integer> list5=new ArrayList<>(List.of(1,2,3,4));

        List<Integer> list6=new ArrayList<>(){
            {
              add(30);
              add(40);
            }
        };
//        System.out.println(list3);
        System.out.println(list6);





    }
}
