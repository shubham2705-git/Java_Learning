package CognizantQuestions;

import java.util.HashMap;
import java.util.Map;

public class Cognizant2 {
    public static String print(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i+1);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int count=map.get(s.charAt(i));
            while(count!=0){
                ans.append(s.charAt(i));
                count--;
            }
            ans.append("-");
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "abcaba";
        System.out.println(print(s));
    }
}
