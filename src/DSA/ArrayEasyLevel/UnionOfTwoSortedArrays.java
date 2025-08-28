package ArrayEasyLevel;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    public static int[] unionOfTwoArrays(int[] arr1, int[] arr2){
        Set<Integer> set = new TreeSet<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            set.add(i);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5,8,8,9,10};
        int[] arr2 = {2,3,4,4,5,6,7,6,7,6};
        int[] result = unionOfTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
