package ArrayEasyLevel;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static int[] moveAllZeroes(int[] arr){
// =========== Optimal Solution ============
        int n = arr.length;
        int j = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1; i<n; i++){   //--- TC -> O(n)
            if(arr[i] != 0){
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int[] result = moveAllZeroes(arr);
        System.out.println(Arrays.toString(result));
    }
}



// -------------------------------------------------------
// ========== BruteForce Approach =============
/*        int n = arr.length;
        int[] temp = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                temp[count] = arr[i];
                count++;
            }
        }
        return temp;  */
