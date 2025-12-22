package CognizantQuestions;

import java.util.HashMap;
import java.util.Map;

public class Cognizant5 {
    public static int print(String s1,String s2){
        int count=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>0){
                map.put(ch,map.get(ch)-1);
            }
            else{
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s1="ABD";
        String s2="AABCCAD";
        System.out.println(print(s1,s2));
    }
}
