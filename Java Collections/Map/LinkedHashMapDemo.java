package Map;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f,true); //double linked list
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 30);

        linkedHashMap.get("Apple");
        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet())
        {
            System.out.println(entry.getKey()+":" + entry.getValue());
        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("shubham", 10);
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        System.out.println(linkedHashMap1);
        System.out.println(hashMap);
    }
}
