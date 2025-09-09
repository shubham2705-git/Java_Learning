package ArrayMediumLevel;

import java.util.Arrays;

public class RearrangeElementsBySign {
    public static int[] rearrange(int[] arr){
// ============= Optimal Solution =====================
        int n = arr.length;
        int pos = 0;
        int neg = 1;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                ans[neg] = arr[i];
                neg += 2;
            }else{
                ans[pos] = arr[i];
                pos += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] result = rearrange(arr);
        System.out.println(Arrays.toString(result));
    }
}
//---------------------------------------------------------------------------------------------------------------------
// ====================== BruteForce Approach ===============================
/*        int[] pos = new int[arr.length/2];
        int[] neg = new int[arr.length/2];
        int poss = 0;
        int negg = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                pos[poss++] = arr[i];
            }
            if(arr[i]<0) {
                neg[negg++] = arr[i];
            }
        }
        for(int i=0; i<arr.length/2; i++){
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
        }
        return arr;     */
