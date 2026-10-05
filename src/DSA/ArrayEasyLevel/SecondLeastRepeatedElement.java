package ArrayEasyLevel;

import java.util.Arrays;

public class SecondLeastRepeatedElement {
    public static void find(int[] arr){
        int k = 0;
        int[] ans =new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                 if(arr[i] == arr[j]){
                     count++;
                 }
            }
            ans[k++] = count;
        }
        System.out.println(Arrays.toString(ans));
        System.out.println("+++++++++++++++++++++++++");
        int l = arr[0];
        int sl = Integer.MIN_VALUE;
        for(int i=0; i< ans.length; i++){
            if(ans[i]>l){
                sl = l;
                l = ans[i];
            }
            if(ans[i]<l && ans[i]>sl){
                sl = ans[i];
            }
        }
        System.out.println(sl);
        for(int i=0; i<arr.length; i++){
            if(ans[i]==sl){
                System.out.print(arr[i] +"  ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,4,4,4,5,5,5,2};
//        System.out.println(find(arr));
        find(arr);
    }
}
