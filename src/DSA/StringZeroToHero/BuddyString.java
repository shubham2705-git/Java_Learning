package StringZeroToHero;

import java.util.ArrayList;
import java.util.List;

public class BuddyString {
    public static boolean checkFreq(String s){
    int[] arr = new int[26];
    for(char ch:s.toCharArray()){
        arr[ch-'a']++;
        if(arr[ch-'a']>1){
            return true;
        }
    }
    return false;
}
    public static boolean buddyStrings(String s, String goal) {
        StringBuilder sb1 = new StringBuilder(s);

        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)){
            return checkFreq(s);
        }
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                list.add(i);
            }
        }
        if(list.size()!=2) return false;
        char ch = sb1.charAt(list.get(0));
        sb1.setCharAt(list.get(0), sb1.charAt(list.get(1)));
        sb1.setCharAt(list.get(1), ch);


        return sb1.toString().equals(goal);

    }
    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";
        System.out.println(buddyStrings(s,goal));
    }
}
