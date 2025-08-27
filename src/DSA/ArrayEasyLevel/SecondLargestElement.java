package ArrayEasyLevel;

import java.util.Scanner;
import java.util.Arrays;
public class SecondLargestElement {
    public static int SecondLargest(int arr[],int n)
    {
        //========= First approach  ============
  /*        int secondLargest = -1;
          Arrays.sort(arr);
          for(int i=n;i>0;i--)
          {
              if(arr[i] != arr[n])
              {
                  secondLargest = arr[i];
                  break;
              }
          }
          return secondLargest;    */
//---------------------------------------------------------------
        // ====== Second approach =============
    /*    int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i =0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        for(int i =0;i<n;i++)
        {
            if(arr[i]!=largest && arr[i]>second)
            {
                second  = arr[i];
            }
        }
        return second;   */
// ------------------------------------------
        // =========== Optimal Solution ======================
        int largest = arr[0];
        int second = Integer.MIN_VALUE;
        for(int i = 1; i<n; i++)
        {
            if(arr[i]>largest)
            {
                second = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]>second) {
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int arr[] = {21,34,-34,5,7,35,-39,25,-65,-65,65,-65};
        int n = arr.length-1;
        int result = SecondLargest(arr,n);
        System.out.println(result);
    }
}
