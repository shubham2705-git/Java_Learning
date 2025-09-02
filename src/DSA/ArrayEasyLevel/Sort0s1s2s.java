package ArrayEasyLevel;

import java.util.Arrays;

public class Sort0s1s2s {
    public static int[] sort012(int[] arr){
        int left=0;
        int mid=0;
        int right=arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
                int temp=arr[left];
                arr[left]=arr[mid];
                arr[mid]=temp;
                mid++;
                left++;
            }
            else if(arr[mid]==1) {
                mid++;
            }else{
                int temp=arr[right];
                arr[right]=arr[mid];
                arr[mid]=temp;
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={0,1,1,0,1,2,1,2,0,0,0};
        int[] result = sort012(arr);
        System.out.println(Arrays.toString(result));
    }
}
