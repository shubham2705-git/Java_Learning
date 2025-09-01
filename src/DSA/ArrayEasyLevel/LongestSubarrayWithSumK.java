package ArrayEasyLevel;

public class LongestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int target){
//================ BruteForce 2nd ========================
        int len = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum==target){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,3,-1,-1,-1,5,2,3};
        int target = 3;
        System.out.println(longestSubarray(arr,target));
    }
}
// ----------------------------------------------------------------------------
// ======= BruteForce Solution ========
/*        int len = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++) {
                    sum += arr[k];
                }
                    if(sum==target){
                        len = Math.max(len, j-i+1);
                    }
                }
        }
        return len;      */