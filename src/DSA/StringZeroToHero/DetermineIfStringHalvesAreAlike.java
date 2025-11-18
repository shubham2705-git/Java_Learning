package StringZeroToHero;

public interface DetermineIfStringHalvesAreAlike {
    public static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    public static boolean isAlike(String s){
        int right = s.length()-1;
        int left = 0;
        int value = 0;
        for(int i=0;i<s.length()/2;i++){
            if(isVowel(s.charAt(i))){
                value++;
            }
        }
        for(int i=s.length()/2;i<s.length()-1;i++){
            if(isVowel(s.charAt(i))){
                value--;
            }
        }
        return value==0;
    }
    public static void main(String[] args) {
        String s = "book";
        System.out.println(isAlike(s));
    }
}
