package ArrayMediumLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInArray {
    public static int[] leader(int[] arr){
        List<Integer> list = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>maxi){
                list.add(arr[i]);
                maxi = arr[i];
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        int[] result = leader(arr);
        System.out.println(Arrays.toString(result));
    }
}
//----------------------------------------------------------------------------------------------------------------------
//================== BruteForce Solution ====================
/*        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean leader = true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader) list.add(arr[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();  */