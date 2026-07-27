package BinarySearch;

public class SqrtOfNumber {
    public static int find(int n){
        int low = 1;
        int high = n;
        int result = 0;
        while(low <= high){
            int mid = low + (high-low)/2;

            if((mid * mid) <= n){
                result = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(find(n));
    }
}
