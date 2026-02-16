package recursion;

public class PiToPi {
    public static String pi(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)=='p' && str.charAt(1)=='i'){
            return "3.14"+pi(str.substring(2));
        }
        return str.charAt(0)+pi(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "23pi23pi";
        System.out.println(pi(str));
    }
}
