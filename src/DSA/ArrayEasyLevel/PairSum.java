package ArrayEasyLevel;

public class PairSum {
    public static void pairSum(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        pairSum(arr);
    }
}
