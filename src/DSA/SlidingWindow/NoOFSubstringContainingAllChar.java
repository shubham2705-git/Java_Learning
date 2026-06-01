package SlidingWindow;

public class NoOFSubstringContainingAllChar {
    public static int find(String s){
        int[] arr = new int[3];
        int left = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;

            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                ans += s.length() - i;
                arr[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(find(s));
    }
}
