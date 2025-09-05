package StringZeroToHero;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern,String s){
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        Map<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word=arr[i];
            if(map.containsValue(word) && !map.containsKey(c)){
                return false;
            }
            if(map.containsKey(c) && !map.get(c).equals(word)){
                return false;
            }
            else{
                map.put(c,word);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
}
