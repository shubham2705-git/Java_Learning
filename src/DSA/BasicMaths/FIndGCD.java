package BasicMaths;

public class FIndGCD {
    public static void main(String[] args) {
        int n = 12;
        int m = 9;
        int j = Math.min(n,m);
        int gcd = 1;
        for(int i=1;i<j;i++){
            if(n%i==0 && m%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
