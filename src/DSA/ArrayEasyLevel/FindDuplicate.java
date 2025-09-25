package ArrayEasyLevel;

import java.util.*;

public class FindDuplicate {
    public static int[] findDuplicate(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>1){
                list.add(e.getKey());
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr={1,5,4,2,1,4,7};
        int[] result = findDuplicate(arr);
        System.out.println(Arrays.toString(result));
    }
}
