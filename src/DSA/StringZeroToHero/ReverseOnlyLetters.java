package StringZeroToHero;

public class ReverseOnlyLetters {
    public static String reverse(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(Character.isLetter(arr[start]) && Character.isLetter(arr[end])){
                char ch = arr[start];
                arr[start] = arr[end];
                arr[end] = ch;
                start++;
                end--;
            }else if(!Character.isLetter(arr[start])){
                start++;
            }else if(!Character.isLetter(arr[end])){
                end--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str = "a-bC-dEf-ghIj";
        System.out.println(reverse(str));
    }
}
