package ArrayEasyLevel;

public class CircularAdjacentSum {
    public static int sum(int[] arr){
        int[] ans = new int[arr.length];
        int total = 0;
        for(int i=0;i<arr.length-1;i++){
            ans[i] = arr[i]+arr[i+1];
            if(ans[i]%2==0){
                total+=ans[i];
            }
        }

        // circular pair check
        ans[ans.length-1] = arr[0] + arr[arr.length-1];
        if(ans[ans.length-1] % 2 == 0){
            total += ans[ans.length-1];
        }

        return total;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sum(arr));
    }
}
