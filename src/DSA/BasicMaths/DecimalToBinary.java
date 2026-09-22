package BasicMaths;

public class DecimalToBinary {
    public static void decToBin(int n){
        String str = "";
        while(n > 0){
            int digit = n % 2;
            str += digit;
            n = n / 2;
        }
        System.out.println(new StringBuilder(str).reverse());
    }
    public static void main(String[] args) {
        int n = 12;
        decToBin(n);
    }
}
