package recursion;

public class StringToInteger {
    public static int stringToInteger(String str){
        if(str.length()==1) return str.charAt(0)-48;
        int x = (str.charAt(0)-48)*(int)Math.pow(10,str.length()-1);
        return x+stringToInteger(str.substring(1));

    }
    public static void main(String[] args) {
        String str = "435";
        System.out.println(stringToInteger(str));
    }
}
