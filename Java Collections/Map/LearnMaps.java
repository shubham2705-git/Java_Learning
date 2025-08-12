package Map;
import java.util.*;
public class LearnMaps {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("us","United States");
        map.put("in","india");
        map.put("mn","india");
        map.putIfAbsent("en","england"); //in modifies
        map.remove("us","usa");

        ArrayList<String> keys = new ArrayList(map.keySet());
        System.out.println(keys);

        Collection<String> values = map.values();
        System.out.println(values);

        Set<Map.Entry<String, String>> entries = map.entrySet();
//        System.out.println(entries);

        for(Map.Entry<String, String> entry: entries)
        {
            System.out.println(entry.getKey()+", "+ entry.getValue());
        }

//        System.out.println(map.containsValue("india"));
//        System.out.println(map.get("in"));
//        System.out.println(map.containsKey("in"));
//        System.out.println(map.getOrDefault("gn","others"));
//        System.out.println(map);
    }
}
