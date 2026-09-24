package BasicMaths;

public class DecimalToOctal {
    public static void main(String[] args) {
        int n = 50;
        decToOct(n);
    }

    private static void decToOct(int n) {
        String str = "";
        while(n > 0){
            int digit = n % 8;
            str += digit;
            n = n / 8;
        }
        System.out.println(new StringBuilder(str).reverse());
    }
}
