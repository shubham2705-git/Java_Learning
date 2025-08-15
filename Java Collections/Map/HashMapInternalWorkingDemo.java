package Map;
import java.util.*;

public class HashMapInternalWorkingDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("shubham",10);
        System.out.println(fruitMap);

        fruitMap.replaceAll((k,v)->v*2);
        System.out.println(fruitMap);
    }
}
