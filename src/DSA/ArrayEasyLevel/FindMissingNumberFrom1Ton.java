package ArrayEasyLevel;

import java.util.*;

public class FindMissingNumberFrom1Ton {
    public static int findMissingNumber(int[] arr){
//======== Most Optimal is Using Xor ============
        int xor1 = 0;
        int xor2 = 0;
        int n = arr.length+1;
        for(int i=0; i<n-1; i++){
            xor2^=arr[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1^n;
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,4};
        int result = findMissingNumber(arr);
        System.out.println(result);
    }
}



// ========= BruteForce Solution =========
/*        int n = arr.length+1;
        for(int i=1; i<=n; i++){
            boolean flag = false;
            for(int j=0; j<n-1; j++){
                if(arr[j] == i){
                    flag = true;
                    break;
                }
            }
            if(!flag) return i;
        }
        return -1;    */

//-----------------------------------------------------------------------------------------------------
//=========== Better Solution ==========
/*        int n = arr.length+1;
        List<Integer> list = new ArrayList<>();
        for(int i: arr){
            list.add(i);
        }
       for(int i=1; i<=n; i++){
           if(!list.contains(i)){
               return i;
           }
       }
       return -1;    */

//---------------------------------------------------------------------------------------------------------------------
// ======== First Optimal Solution =========
//  Drawback is Integer overflow
/*        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0; i<n-1; i++){
            sum2 += arr[i];
        }
        return sum-sum2;   */