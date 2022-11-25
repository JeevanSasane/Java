package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map2Demo {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("Jeevan",12);
        map.put("Amit",13);
        map.put("Manish",14);
//        System.out.println(map);
//        map.forEach((s,j)-> System.out.println(s+" "+j));
//
//        Map<String,Integer> map2=new HashMap<>();
//        map2.put("Satara",1);
//        map2.put("Pune",2);
//        map2.put("Mumbai",3);
//        System.out.println(map2);
//
//        Map<String, Integer> map3 = new HashMap<>();
//        map3.put("Pune", 10);
//        map3.put("Mumbai", 20);
//        map3.put("Nashik", 30);
//
//        System.out.println(map3);
//        System.out.println(map.keySet());

//        for(Map.Entry<String, Integer> m:map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
//
        List<Map<String,Integer>> list=new ArrayList<>();
        list.add(map);
        list.forEach(l->{
            l.forEach((a,b)->{
                System.out.println(a+" "+b);
            });
        });

    }
}
