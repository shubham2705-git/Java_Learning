import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoSortedArray {
    public static int[] intersection(int[] a, int[] b){
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i : a){
            list.add(i);
        }
        for(int i : b){
            if(list.contains(i)){
                ans.add(i);
                list.remove(Integer.valueOf(i)); // optional: to avoid duplicates
                /* here we used Integer.ValueOf(i) because if we take list.remove(i) then it treat i as index.
                   but if we write Integer.ValueOf(i) it will treat it as object and remove that value.
                 */

            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,4,5,6};
        int[] b = {2,3,3,3,5,6,6,7};
        int[] result = intersection(a,b);
        System.out.println(Arrays.toString(result));
    }
}
