package HashMap;

import java.util.HashMap;
import java.util.Map;

public class checkIsomorphic {

    public static boolean isomorphic(String s, String t){
        Map<Character,Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            if (map.containsKey(sCh)) {
                if (map.get(sCh) != (tCh)) return false;
            } else if (map.containsValue(tCh)) {
                return false;
            } else {
                map.put(sCh, tCh);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "oll";
        boolean result = isomorphic(s,t);
        System.out.println(result);
    }
}
