package ArrayEasyLevel;

public class MaxPairSum {
    public static void maxPairSum(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum>max){
                    max= sum;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {10,8,3,4,5};
        maxPairSum(arr);
    }
}
