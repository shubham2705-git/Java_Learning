package StringZeroToHero;

public class ReverseVowels {
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
    public static String reverseVowels(String str){
        str = str.replaceAll("[^a-zA-Z]","");
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while(start<end){
            if (!isVowel(ch[start])){
                start++;
            }else if(!isVowel(ch[end])){
                end--;
            }else{
                char c = ch[end];
                ch[end] = ch[start];
                ch[start] = c;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String s = "hello";
        String result = reverseVowels(s);
        System.out.println(result);
    }
}
