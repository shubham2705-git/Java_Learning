package recursion;

public class MultiplicationWithoutAbstrick {
    public static int mul(int n,int m){
        if(m==0 || n==0) return 0;
        return n+mul(n,m-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        System.out.println(mul(n,m));
    }
}
