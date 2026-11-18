package NumberBasedQuestions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachNumber {
    public static void find(int n){
        Map<Integer,Integer> map = new HashMap<>();
        while(n>0){
            int digit = n%10;
            map.put(digit, map.getOrDefault(digit,0)+1);
            n=n/10;
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            System.out.println(m.getKey()+"=>"+m.getValue());
        }
    }
    public static void main(String[] args) {
        int n = 235321;
        find(n);
    }
}
