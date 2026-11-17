package StringZeroToHero;

public class ReverseEachWord {

    public static void main(String[] args) {
        String s = "this is an umbrella";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        StringBuilder reverse = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else {
                reverse.append(word.reverse()).append(" ");
                word=new StringBuilder();
            }
        }
        reverse.append(word.reverse());
        return reverse.toString();
    }


//    public static String revString(String s){
//        int i=0,j=s.length()-1;
//        char[] ch = s.toCharArray();
//        while(i<j){
//            char temp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = temp;
//            i++;j--;
//        }
//        return new String(ch);
//    }
//
//    private static String reverse(String s) {
//        int k = 0;
//        String ans = "";
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' '){
//                ans+=revString(s.substring(k,i))+" ";
//                k=i+1;
//            }
//            if(i==s.length()-1){
//                ans+=revString(s.substring(k,i+1));
//                k=i+1;
//            }
//        }
//        return ans;
//    }
}
