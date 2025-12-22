package CognizantQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cognizant1 {
    public static int solution(int k, String s1, String s2){
        Set<String> uniqueSubstrings = new HashSet<>();
        int count = 0;

        for (int i = 0; i <= s1.length() - k; i++) {
            String sub = s1.substring(i, i + k);
            uniqueSubstrings.add(sub);
        }
        for (String sub : uniqueSubstrings) {
            if (s2.contains(sub)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int result = solution(k,s1,s2);
        System.out.println(result);

    }
}
