package StringZeroToHero;

public class IsSubsequence {
    public static boolean isSubsquence(String str1, String str2){
          if(str1.isEmpty()) return true;
          int i=0;
          int j=0;
          while(i<str1.length() && j<str2.length()){
              if(str1.charAt(i)==str2.charAt(j)){
                  i++;
                  j++;
              }else{
                  j++;
              }
              if(i== str1.length()){
                  return true;
              }
          }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ahbgdc";
        System.out.println(isSubsquence(str1,str2));
    }
}
