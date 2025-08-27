package ArrayEasyLevel;

import java.util.*;

public class LeftRotateArrayByOne {

    public static int[] LeftRotateByOne(int arr[],int n)
    {
        int last = arr[0];
        for(int i=0; i<n-1; i++)
        {
            arr[i] = arr[i+1];
        }
        arr[n-1] = last;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int result[] = LeftRotateByOne(arr,n);
        System.out.println(Arrays.toString(result));
    }
}
