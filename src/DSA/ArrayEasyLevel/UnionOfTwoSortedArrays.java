package ArrayEasyLevel;

import java.util.*;

public class UnionOfTwoSortedArrays {
    public static List<Integer> unionOfTwoArrays(int[] arr1, int[] arr2){
        int i=0, j=0;




        return new ArrayList<>();






    }
//        Set<Integer> set = new TreeSet<>();
//        for(int i : arr1){
//            set.add(i);
//        }
//        for(int i : arr2){
//            set.add(i);
//        }
//        return set.stream().mapToInt(Integer::intValue).toArray();
//    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5,8,8,9,10};
        int[] arr2 = {2,3,4,4,5,6,7,6,7,6};
        List<Integer> result = unionOfTwoArrays(arr1, arr2);
        System.out.println();
    }
}
