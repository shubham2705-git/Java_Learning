package ArrayEasyLevel;

public class KadansAlgorithm {
    public static int maxSubarray(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i:arr){
            sum=sum+i;
            if(sum>max) max=sum;
            if(sum<0) sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        int result = maxSubarray(arr);
        System.out.println(result);
    }
}

//----------------------------------------------------------------------------------------------------------------------
/*        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                max = Math.max(max,sum);
            }
        }
        return max;   */
