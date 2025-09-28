package StringZeroToHero;

public class StringCompression {
    public static String stringCompression(char[] chars){
        int n = chars.length;
        int i = 0;
        int index = 0;
        while(i<n){
            char curr_char = chars[i];
            int count = 0;
            //find count of duplicate
            while(i<n && chars[i]==curr_char){
                count++;
                i++;
            }
            // Now do the assign work
            chars[index] = curr_char;
            index++;
            if(count>1){
                String count_str = String.valueOf(count);
                for(int j=0; j<count_str.length(); j++){
                    char ch = count_str.charAt(j);
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return new String(chars, 0, index);
    }
    public static void main(String[] args) {
        char[] ch = {'a','a','b','b','c','c','c'};
        String result = stringCompression(ch);
        System.out.println(result);
    }
}
