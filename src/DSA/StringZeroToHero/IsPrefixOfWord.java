package StringZeroToHero;

public class IsPrefixOfWord {
    public static int isPrefixOfWord(String sentence,String searchWord){
        String[] str = sentence.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].contains(searchWord)){
                String s1 = str[i].substring(0,searchWord.length());
                if(s1.equals(searchWord)){
                    return i+1;
                }
            }
        }
        return -1;
// if(str[i].startsWith(searchWord)) return i+1;
// return -1;
    }
    public static void main(String[] args) {
        String sentence ="i love eating burger";
        String searchWord ="burg";
        System.out.println(isPrefixOfWord(sentence,searchWord));
    }
}
