package HashMap;

import java.util.HashMap;

public class LargestSubarrayOfSumZero {
    public static int maxLengthWithSumZero(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen=0, prefSum=0;
        map.put(0,-1);
        for(int i=0; i<arr.length; i++){
            prefSum+=arr[i];
            if(map.containsKey(prefSum)){
                maxLen=Math.max(maxLen,i-map.get(prefSum));
            }else{
                map.put(prefSum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10};
        int result = maxLengthWithSumZero(arr);
        System.out.println(result);
    }
}
