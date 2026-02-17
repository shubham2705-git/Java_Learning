package recursion;

import java.util.ArrayList;

public class FindIndexes {
    public static ArrayList<Integer> searchIndexes(int[] arr,int x,int index){
        if(index==arr.length) return new ArrayList<>();
        ArrayList<Integer> result = searchIndexes(arr,x,index+1);
        if(arr[index]==x) result.add(0,index);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,2,4,2};
        System.out.println(searchIndexes(arr,2,0));
    }
}
