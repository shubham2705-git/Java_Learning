package NumberBasedQuestions;

public class CheckVowelOrConso {
    public static void check(char ch){
        boolean ans = "aeiouAEIOU".indexOf(ch)!=-1;
        if(ans){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        char ch = 'a';
        check(ch);
        int ans = ch;
        System.out.println(ans);
    }
}
