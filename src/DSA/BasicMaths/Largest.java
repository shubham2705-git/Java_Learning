package BasicMaths;

import java.util.Arrays;

public class Largest {

    public static int[] moveZeroes(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0)
            {
                i=j;
                break;
            }
        }
        for(int j=i+1;j< arr.length;j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                arr[j]=0;
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,0,4,0,5,6,0,0,7,0,0};
        int[] ans = moveZeroes(arr);
        System.out.println(Arrays.toString(ans));
    }
}
