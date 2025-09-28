package ArrayEasyLevel;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {
    public static void findPairs(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
              if(arr[i]+arr[j]==target){
                  map.put(arr[i],arr[j]);
              }
            }
        }
            System.out.println(map);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int target = 9;
       findPairs(arr,target);
    }
}
