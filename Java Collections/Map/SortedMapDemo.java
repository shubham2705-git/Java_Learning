package Map;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String> map = new TreeMap<>();
        map.put(90,"vivek");
        map.put(99,"shubham");
        map.put(78,"mohit");
        map.put(77,"vipul");
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(91)); //exclude 91
        System.out.println(map.tailMap(91));  // include 91
    }
}
