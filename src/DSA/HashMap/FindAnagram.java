package HashMap;
import java.util.HashMap;

public class FindAnagram {
    public static boolean findAna(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)) return false;
            int currFreq = map.get(ch);
            if(currFreq==1) {
                map.remove(ch);
            }else{
                map.put(ch,currFreq-1);
              }
            }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s = "shubham";
        String t = "hubhams";
        boolean result = findAna(s,t);
        System.out.println(result);
    }
}
