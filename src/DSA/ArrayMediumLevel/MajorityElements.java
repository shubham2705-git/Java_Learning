package ArrayMediumLevel;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static int majority(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i)>arr.length/2){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,2,2};
        int result = majority(arr);
        System.out.println(result);
    }
}
//----------------------------------------------------------------------------------------------------------------------
//=============== BruteForce Approach ==================
/*        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;i++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>arr.length/2) return arr[i];
            }
        }
        return -1;  */

//----------------------------------------------------------------------------------------------------------------------