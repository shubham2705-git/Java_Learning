package ArrayEasyLevel;

public class ThirdLargestNumber {
    public static int find(int[] arr){
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int n : arr) {
            if (n == first || n == second || n == third) continue;

            if (n > first) {
                third = second;
                second = first;
                first = n;
            }
            else if (n > second) {
                third = second;
                second = n;
            }
            else if (n > third) {
                third = n;
            }
        }
            if(third == Long.MIN_VALUE){
                return (int) first;
            }
            return (int) third;
        }
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        System.out.println(find(arr));
    }
}
