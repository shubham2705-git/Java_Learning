package StringZeroToHero;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingChar {
    public static int longestSubstring(String s){
        List<Character> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max = Math.max(max,list.size());
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        int result = longestSubstring(s);
        System.out.println(result);
    }
}
