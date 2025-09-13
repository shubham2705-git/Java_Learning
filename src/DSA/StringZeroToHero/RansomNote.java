package StringZeroToHero;

public class RansomNote {
    public static boolean ransom(String ransomNote,String magazine){
        int[] freq = new int[26];
        for(int i=0;i<magazine.length();i++){
            char maga = magazine.charAt(i);
            freq[maga-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char rans = ransomNote.charAt(i);
            freq[rans-'a']--;
            if(freq[rans-'a']<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote="aa";
        String magazine="aab";
        System.out.println(ransom(ransomNote,magazine));
    }
}
