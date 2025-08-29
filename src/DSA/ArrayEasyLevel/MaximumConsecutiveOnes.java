package ArrayEasyLevel;

public class MaximumConsecutiveOnes {
    public static int maxConsecutive(int[] arr){
        int maxi = 0;
        int count = 0;
        for(int i:arr){
            if(i==1){
                count++;
                maxi = Math.max(maxi,count);
            }
            else{
                count=0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,0,1,1,1,1,1,1};
        int result = maxConsecutive(arr);
        System.out.println(result);
    }
}
