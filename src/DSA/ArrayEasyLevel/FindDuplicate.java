package ArrayEasyLevel;

import java.util.*;

public class FindDuplicate {
    public static int[] findDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                System.out.print(i+" ");
            }else{
                set.add(i);
            }
        }
        System.out.println();
        return set.stream().mapToInt(Integer::intValue).toArray();


        /*Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>1){
                list.add(e.getKey());
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();*/
    }
    public static void main(String[] args) {
        int[] arr={1,5,4,2,1,4,7};
        System.out.print("the duplicate elements are: ");
        int[] result = findDuplicate(arr);
        System.out.println("After removing duplicates the array becomes "+Arrays.toString(result));
    }
}
