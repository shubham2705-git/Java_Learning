package ArrayEasyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortTheArray {
    public static int[] sortArr(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int n : arr){
            list.add(n);
        }
       for(int j=0;j<arr.length;j++)
       {
           int smallest = Integer.MAX_VALUE;
           for (int i = 0; i < list.size(); i++)
           {
               if (smallest > list.get(i))
               {
                   smallest = list.get(i);
               }
           }
           arr[j] = smallest;
           list.remove(Integer.valueOf(smallest));
       }
       return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,4,12,23,43,45,65,76,87,34,65,3454};
        int[] result = sortArr(arr);
        System.out.println(Arrays.toString(result));
    }
}
