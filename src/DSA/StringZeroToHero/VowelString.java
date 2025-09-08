package StringZeroToHero;

public class VowelString {
    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            char firstChar = words[i].charAt(0);
            char lastChar = words[i].charAt(words[i].length() - 1);
            if (isVowel(firstChar) && isVowel(lastChar)) {
                count++;
            }
        }
        return count;
    }
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
     }
    public static void main(String[] args) {
        String[] words = {"apple", "Egg", "sky", "orange", "Ice"};
        int left = 0;
        int right = 4;
        int result = vowelStrings(words, left, right);
        System.out.println("Number of words starting and ending with a vowel: " + result);
    }
}

