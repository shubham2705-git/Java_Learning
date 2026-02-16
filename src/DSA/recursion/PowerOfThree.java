package recursion;

public class PowerOfThree {
    public static boolean check(int n){
        if(n==1) return true;
        if(n<=0 || n%3!=0) return false;
        return check(n/3);
    }
    public static void main(String[] args) {
        int n = 81;
        System.out.println(check(n));
    }
}
