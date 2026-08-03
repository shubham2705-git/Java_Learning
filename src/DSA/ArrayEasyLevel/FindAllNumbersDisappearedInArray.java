package ArrayEasyLevel;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public static List<Integer> find(int[] arr){
        List<Integer> list = new ArrayList<>();
        boolean[] present = new boolean[arr.length+1];
        for(int e : arr){
            present[e] = true;
        }
        for(int i=1; i<arr.length+1; i++){
            if(!present[i]){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(find(nums));
    }
}
