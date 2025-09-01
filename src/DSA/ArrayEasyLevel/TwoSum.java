package ArrayEasyLevel;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] arr,int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i==j) continue;
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target = 14;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));

    }
}
