package recursion;

public class PowerOfNumber {
    public static int power(int n,int m){
        int res;
        if(m==0) return 1;
        else res = power(n,m-1)*n;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
