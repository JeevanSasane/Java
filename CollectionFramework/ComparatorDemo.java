package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    int id;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        ComparatorDemo obj1 = new ComparatorDemo(52, "Jeevan", "Satara");
        ComparatorDemo obj2 = new ComparatorDemo(98, "Amit", "Satara");
        ComparatorDemo obj3 = new ComparatorDemo(26, "Tejas", "Satara");

        List<ComparatorDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Comparator<ComparatorDemo> c=new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                if(o1.id==o2.id){
                    return 0;
                } else if (o1.id>o2.id) {
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        Comparator<ComparatorDemo> c1=new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                return o1.name.compareTo(o1.name);
            }
        };
        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });
    }
}