package RevisionQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                int add = arr[i]+arr[j];
                int more = target-add;
                if(map.containsKey(more)){
                    return new int[] {map.get(more),i,j};
                }
                map.put(arr[i],i);
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,6,2};
        int target = 11;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
