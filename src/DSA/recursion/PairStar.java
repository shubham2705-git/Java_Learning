package recursion;

public class PairStar {
    public static String insertStar(String str){
        if(str.length()==1) return str;
        if(str.charAt(0)==str.charAt(1))
            return str.charAt(0)+"*"+insertStar(str.substring(1));
        return str.charAt(0)+insertStar(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "aaaa";
        System.out.println(insertStar(str));
    }
}
