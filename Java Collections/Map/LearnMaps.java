package Map;
import java.util.*;
public class LearnMaps {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("us","United States");
        map.put("in","india");
        map.putIfAbsent("en","england"); //in modifies

        System.out.println(map.get("in"));
        System.out.println(map.containsKey("in"));
        System.out.println(map);
        System.out.println(map.getOrDefault("gn","others"));
    }
}
