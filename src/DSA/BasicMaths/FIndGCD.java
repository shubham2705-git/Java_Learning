package BasicMaths;

public class FIndGCD {
    public static void main(String[] args) {
        int n = 20;
        int m = 30;
        int j = Math.min(n,m);
        for(int i=j;i>=1;i--) {
            if (n % i == 0 && m % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
