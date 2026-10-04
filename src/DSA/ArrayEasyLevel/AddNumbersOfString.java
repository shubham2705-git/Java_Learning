package ArrayEasyLevel;

public class AddNumbersOfString {
    public static void print(String s){
        int sum = 0;
        String str = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                str+=ch;
            }
            if((Character.isLetter(ch) && !str.isEmpty()) || (Character.isDigit(ch) && i == s.length()-1)){
                sum = sum + Integer.parseInt(str);
                str="";
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String s = "ABC13ADCS123";
        print(s);
    }
}
