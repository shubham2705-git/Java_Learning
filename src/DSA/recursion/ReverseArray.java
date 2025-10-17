package recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr,int l,int r){
        if(l>=r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse( arr,l+1,r-1);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,9,6,7};
        int l = 0;
        int r = arr.length-1;
        reverse(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }

}
