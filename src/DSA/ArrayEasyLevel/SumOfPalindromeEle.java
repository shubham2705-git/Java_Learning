package ArrayEasyLevel;

public class SumOfPalindromeEle {
    public static boolean isPalin(int n){
        int temp = n;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev==temp;
    }
    public static void main(String[] args) {
        int[] arr = {21,11,131,22,23,6};
        int sum = 0;
        for(int e:arr){
            if(isPalin(e)) sum+=e;
        }
        System.out.println(sum);
    }
}
