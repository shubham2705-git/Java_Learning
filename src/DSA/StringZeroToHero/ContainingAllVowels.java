package StringZeroToHero;

import java.util.HashMap;
import java.util.Map;

public class ContainingAllVowels {
    public static boolean valid(String s){
        s = s.toLowerCase();
        Map<Character,Boolean> map = new HashMap<>();
        map.put('a',false);
        map.put('e',false);
        map.put('i',false);
        map.put('o',false);
        map.put('u',false);
        for(int i=0;i<s.length();i++){
            if("aeiou".indexOf(s.charAt(i))!=-1) map.put(s.charAt(i),true);
        }
        for(Map.Entry<Character,Boolean> m : map.entrySet()){
            if(m.getValue()==false) return false;
        }
        return true;
    }
    public static void find(String s) {
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (valid(str[i])) System.out.println(str[i]);
        }
    }
    public static void main(String[] args) {
        String s = "This is the Education System";
        find(s);
    }
}
