package RevisionQuestions;

import java.util.Arrays;

public class PosNeg {
    public static int[] posNeg(int[] arr){
        int count1 = 0;
        int count2 = 1;
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                ans[count1] = arr[i];
                count1 += 2;
            }
            if(arr[i]<0){
                ans[count2] = arr[i];
                count2 += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int ans[] = posNeg(arr);
        System.out.println(Arrays.toString(ans));
    }
}
