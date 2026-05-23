package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasketI {
    public static int find(int[] arr){
        int l=0, r=0, max=0;
        Map<Integer, Integer> map = new HashMap<>();
        while(r<arr.length){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);

            if(map.size() > 2){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2};
        System.out.println(find(arr));
    }
}
