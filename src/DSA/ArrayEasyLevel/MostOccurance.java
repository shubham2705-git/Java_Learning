package ArrayEasyLevel;

import java.util.*;

public class MostOccurance {
    public static int findMostOcc(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxi = Collections.max(map.values());
        for(Map.Entry<Integer,Integer> e :map.entrySet()){
            if(e.getValue()==maxi){
                return e.getKey();
            }
        }
        return -1;
     }
    public static void main(String[] args) {
        int[] arr = {2,4,5,5,4,2,5};
        int ans = findMostOcc(arr);
        System.out.println(ans);
    }
}
