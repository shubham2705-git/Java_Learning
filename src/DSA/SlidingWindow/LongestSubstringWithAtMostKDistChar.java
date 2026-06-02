package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistChar {
    public static int find(String s,int k){
        int l = 0;
        int r = 0;
        int max =0;
        Map<Character,Integer> map = new HashMap<>();
        while(r<s.length()){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);

                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        if(map.size()<k){
            return -1;
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(find(s,k));
    }
}
