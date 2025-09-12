package StringZeroToHero;

public class ValidParenthesis {
    public static boolean validParen(String s){
        while(true){
            if(s.contains("()")){
                s=s.replace("()","");
            }
            else if(s.contains("{}")){
                s=s.replace("{}","")
            }

        }

    }
    public static void main(String[] args) {
        String s = "()";
        boolean result = validParen(s);
        System.out.println(result);
    }
}
