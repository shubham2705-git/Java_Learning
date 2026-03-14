package RevisionQuestions;

import java.util.*;

public class ElementAppearsOnce {
    public static int maxi(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        return Collections.min(map.keySet());
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(maxi(arr));
    }
}
