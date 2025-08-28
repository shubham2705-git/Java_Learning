package ArrayEasyLevel;

import java.util.Arrays;

public class LeftRotateArrayByDPlaces {
//  ================== Optimal Approach =================
//  we have to create a reverse method -----
    public static void reverse(int arr[], int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] RotateArrayByDPlaces(int[] arr, int d){
        int n = arr.length;
        d = d%n;
        reverse(arr,0,d-1);  // O(d)
        reverse(arr,d,n-1);       // O(n-d)
        reverse(arr,0,n-1);  // O(n)
   // OVERALL TC -> O(2n)
   // Sc -> O(1)
        return arr;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int d = 3;
        int[] result = RotateArrayByDPlaces(arr, d);
        System.out.println(Arrays.toString(result));
    }
}


//================= BruteForce Approach ========== TC->O(n+d)  SC->O(d)
/*        int[] temp = new int[d];
        for(int i = 0; i < d; i++){  //--- O(d)
            temp[i] = arr[i];
        }
        for(int i = d; i < n; i++){  //---- O(n-d)
            arr[i-d] = arr[i];
        }
        int j = 0;
        for(int i = n-d; i<n; i++){   //----O(d)
            arr[i] = temp[j];
            j++;
        }
        return arr;    */
// ------------------------------------------------------------//
