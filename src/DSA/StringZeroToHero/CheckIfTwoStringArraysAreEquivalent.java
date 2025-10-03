package StringZeroToHero;

public class CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder result1 = new StringBuilder();
            for(String str: word1){
                result1.append(str);
            }
            StringBuilder result2 = new StringBuilder();
            for(String str: word2){
                result2.append(str);
            }
            return result1.equals(result2);
        }
    public static void main(String[] args) {
      String[] word1 = {"a","bc"};
      String[] word2 = {"ab","c"};
      boolean result = arrayStringsAreEqual(word1,word2);
        System.out.println(result);
      }
    }
