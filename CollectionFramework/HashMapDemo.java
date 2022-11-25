package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("XYZ",1);
        map.put("ABC",2);
        map.put("PQR",3);

        List<Map<String,Integer>> list=new ArrayList<>();

        list.add(map);
        list.forEach(e-> System.out.println(e));

    }
}
