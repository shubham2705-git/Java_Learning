package BitManipulation;

public class ConvertIntoBinary {
    public static String convert2Binary(int n){
        StringBuilder res = new StringBuilder();
        while(n!=1){
            if(n%2==1) res.append('1');
            else res.append('0');
            n = n/2;
        }
        res.append('1');
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        String result = convert2Binary(0);
        System.out.println(result);
    }
}
