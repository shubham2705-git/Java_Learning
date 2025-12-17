package ArrayEasyLevel;

import java.util.*;

public class EvenKeyValueInMap {
    public static void print(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int count1 = 0;
        int count2 = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e:map.entrySet()){
            if(e.getKey()%2==0){
                list1.add(e.getKey());
            }
            if(e.getValue()%2==0){
                list2.add(e.getValue());
            }
        }
        int[] arr1 = list1.stream().mapToInt(Integer::intValue).toArray();
        int[] arr2 = list2.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("even keys "+Arrays.toString(arr1));
        System.out.println("even values "+Arrays.toString(arr2));
        System.out.println("minimumkey "+Collections.min(map.keySet()));
        System.out.println("minimumn value "+Collections.min(map.values()));
    }
    public static void main(String[] args) {
        int[] arr = {12,23,43,54,12,12,54,54,54,52,12,23,43,54,43,65,56,76,67,45,56,67,89,54,65,90,87};
        print(arr);
    }
}
