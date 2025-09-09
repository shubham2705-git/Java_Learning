package ArrayMediumLevel;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] arr,int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==target) return new int[]{i,j};
            else if(sum<target) i++;
            else j--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target = 10;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
//----------------------------------------------------------------------------------------------------------------------
// =============== BruteForce Approach ===========================
/*        for(int i=0; i<arr.length; i++){
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};  */
//-----------------------------------------------------------------------------------------------------------------------
// =========== Better Approach <--Hashing -->=====================
/*        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<arr.length; i++){
            int more = target-arr[i];
            if(map.containsKey(more)){
                ans[0] = map.get(more);
                ans[1] = i;
            }
            else{
                map.put(arr[i],i);
            }
        }
        return ans;      */