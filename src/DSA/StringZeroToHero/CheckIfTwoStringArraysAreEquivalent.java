package StringZeroToHero;

public class CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder result1 = new StringBuilder();
        for(String str: word1){
            result1.append(str);
        }
        String str1 = result1.toString();
        StringBuilder result2 = new StringBuilder();
        for(String str: word2){
            result2.append(str);
        }
        String str2 = result2.toString();
        return str1.equals(str2);
        }
    public static void main(String[] args) {
      String[] word1 = {"a","bc"};
      String[] word2 = {"ab","c"};
      boolean result = arrayStringsAreEqual(word1,word2);
        System.out.println(result);
      }
    }
