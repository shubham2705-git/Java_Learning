package ArrayEasyLevel;

import java.util.Arrays;

public class MergeTwoArray {
    public static int[] merge(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length+arr2.length];
        int i=0;
        for(int e:arr1) ans[i++]=e;
        for(int e:arr2) ans[i++]=e;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40};
        System.out.println(Arrays.stream(arr1).min().getAsInt());
        int[] arr2 = {1,2,3,4};
        int[] result = merge(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
}
