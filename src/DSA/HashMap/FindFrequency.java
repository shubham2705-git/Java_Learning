package HashMap;

import java.util.*;

public class FindFrequency {
    public static int[] findFreq(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            list.add(e.getValue());
            System.out.println(e.getKey()+" comes "+e.getValue()+" times");
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,5,7,6,6,4,7};
        int[] ans = findFreq(arr);
        System.out.println(Arrays.toString(ans));
    }
}
