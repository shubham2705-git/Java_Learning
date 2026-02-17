package recursion;

public class PowerOfNumber {
    public static int power(int n,int m){
        int res;
        if(m==0) return 1;
        else res = power(n,m-1)*n;
        return res;
    }
    public static void main(String[] args) {
        int n=2;
        int m=5;
        System.out.println(power(n,m));
    }
}
