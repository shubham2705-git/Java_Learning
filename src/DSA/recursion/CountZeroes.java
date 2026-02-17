package recursion;

public class CountZeroes {
    public static int zeroCount(int n){
        int x = 0;
        if(n==0) return 0;
        if(n>=1 && n<=9) return 0;
        if(n%10==0) x = 1;
        return x+zeroCount(n/10);
    }
    public static void main(String[] args) {
        int n = 50060120;
        System.out.println(zeroCount(n));
    }
}
