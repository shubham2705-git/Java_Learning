package ArrayEasyLevel;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static int[] moveZeroes(int[] arr){
        int count=0;
        int[] ans = new int[arr.length];

        for(int nums:arr)
        {
            if(nums!=0)
            {
                ans[count++] = nums;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,0,0,5,5,8,0,7,7,0,0,3,4,5,-1,-3,0,3,4,-3,-5};
        int[] result = moveZeroes(arr);
        System.out.println(Arrays.toString(result));
    }
}
