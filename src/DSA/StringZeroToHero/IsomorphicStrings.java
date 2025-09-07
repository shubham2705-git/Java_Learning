package StringZeroToHero;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isomorphic(String s, String t){
        Map<Character,Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1) && map.get(c1)!=(c2)){
                return false;
            }else {
                if(map.containsValue(c2)) return false;
                map.put(c1,c2);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "ool";
        boolean result = isomorphic(s,t);
        System.out.println(result);
    }
}
