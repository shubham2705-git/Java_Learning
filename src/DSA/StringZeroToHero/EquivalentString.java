package StringZeroToHero;

public class EquivalentString {
    public static boolean equiString(String word1,String word2){
        int[] freq = new int[26];
        for(int i=0; i<word1.length(); i++){
            freq[word1.charAt(i)-'a']++;
            freq[word2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if (Math.abs(freq[i]) > 3) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word1 = "aaba";
        String word2 = "bccb";
        System.out.println(equiString(word1,word2));
    }
}
