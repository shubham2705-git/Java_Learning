package BasicMaths;

public class PrintRemainderOnebyOne {
    public static void main(String[] args) {
        int n = 77895;
        StringBuilder str= new StringBuilder(n+"");
        String s = str.reverse().toString();
        int ans = Integer.parseInt(s);
        System.out.println("string = "+s);
        System.out.println("integer = "+ans);
    }
}
