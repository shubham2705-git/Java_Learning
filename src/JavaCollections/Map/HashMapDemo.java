package Map;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "shubham");
        map.put(8,"neha");
        map.put(3,"sagar");

//        System.out.println(map);
//        String student = map.get(3);
//        System.out.println(student);
//        System.out.println(map.get(88));
//        System.out.println(map.containsKey(2));
//        System.out.println(map.containsValue("shubham"));

        Set<Integer> keys = map.keySet();
        for(int i: keys)
        {
            System.out.println(i +"::"+map.get(i));
        }

        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer,String>entry:entries)
        {
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }

        Collection<String> values =  map.values();
        for(String str : values)
        {
            System.out.println("Value1 =" + str);
        }
    }
}
