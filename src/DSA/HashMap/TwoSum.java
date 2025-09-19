package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] findTwoSum(int[] arr,int target){
        int n = arr.length;
        int[] ans = {-1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            int partner = target-arr[i];
            if(mp.containsKey(partner)){
                ans = new int[]{i,mp.get(partner)};
                return ans;
              }
            mp.put(arr[i],i);
            }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10,12,10,15,-1,7,6,4,2,1};
        int target = 13;
        int[] ans = findTwoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
