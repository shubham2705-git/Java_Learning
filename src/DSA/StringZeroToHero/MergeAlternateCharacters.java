package StringZeroToHero;

public class MergeAlternateCharacters {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n=Math.min(word1.length(),word2.length());
        String str ="";
        if(word1.length()>word2.length()) {
            str = word1.substring(word2.length());
        }
        if(word1.length()<word2.length()) {
            str = word2.substring(word1.length());
        }
        for(int i=0; i<n;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append(str);
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrs";
        String result = mergeAlternately(word1, word2);
        System.out.println("Merged string: " + result); // Output: "apbqcrs"
    }
}

