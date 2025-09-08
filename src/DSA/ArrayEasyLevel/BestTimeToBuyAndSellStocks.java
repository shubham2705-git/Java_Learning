package ArrayEasyLevel;

public class BestTimeToBuyAndSellStocks {
    public static int bestTime(int[] arr){
        int mini = arr[0], profit=0;
        for(int i=1; i<arr.length; i++){
            int cost = arr[i] - mini;
            profit = Math.max(profit,cost);
            mini = Math.min(mini,arr[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(bestTime(arr));

    }
}
