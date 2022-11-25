package CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> vector=new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        Iterator<Integer> iterator=vector.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(vector.subList(0,4));
        System.out.println(vector.get(3));
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
    }
}
