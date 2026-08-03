package StringZeroToHero;

public class ExcelSheetColumnNumber {
    public static int find(String s){
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            ans  = ans * 26 + (ch-'A'+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "ZY"; // 701
        System.out.println(find(s));
    }
}
