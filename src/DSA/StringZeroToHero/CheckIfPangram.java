package StringZeroToHero;
//Pangram means a String containing all alphabets from a to z
public class CheckIfPangram {
    public static boolean checkIfPangram(String sentence){
        int[] freq = new int[26];
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            freq[ch-'a']++;
        }
        for(int i: freq){
            if(i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean result = checkIfPangram(sentence);
        System.out.println(result);

    }
}
