package StringZeroToHero;

public class IndexOfFirstOccurence {
    public static int firstOccurenceIndex(String haystack, String needle){
        for(int i=0; i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==(needle.charAt(0))){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "but";
        int index = firstOccurenceIndex(haystack,needle);
        System.out.println(index);
    }
}
