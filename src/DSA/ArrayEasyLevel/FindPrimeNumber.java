package ArrayEasyLevel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPrimeNumber {
    public static int[] findPrime(int[] arr){
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j == 0){
                    count++;
                }
            }
            if(count==2){
                list.add(arr[i]);
            }
            count=0;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {4,2,5,6,8,13,17,19,22,14,18};
        int[] result = findPrime(arr);
        System.out.println(Arrays.toString(result));
    }
}
