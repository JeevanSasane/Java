package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkList1 {
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<>();

        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("B");
        l1.add("P");

        System.out.println("List is: "+l1);


        Iterator <Integer> it=new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };


    }
}
