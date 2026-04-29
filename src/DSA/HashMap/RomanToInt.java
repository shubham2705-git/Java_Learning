package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void convert(String s){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n = s.length()-1;
        int result=map.get(s.charAt(n));
        for(int i=n-1;i>=0;i--){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                result-=map.get(s.charAt(i));
            }else{
                result+=map.get(s.charAt(i));
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        convert(roman);
    }
}
