package ArrayEasyLevel;

import java.util.HashMap;
import java.util.Map;

public class ArrayAnagram {
    public static boolean check(int[] a, int[] b){
        if(a.length!=b.length) return false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
            map.put(b[i],map.getOrDefault(b[i],0)-1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()!=0) return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {10,20,40,30};
        int[] b = {30,40,10,10};
        System.out.println(check(a,b));
    }
}
