package StackAndQueue;

import java.util.Stack;

public class InfixToPostfix {
    public static int priority(char ch){
        if(ch == '^') return 3;
        else if(ch == '*' || ch== '/') return 2;
        else if(ch == '-' || ch == '+') return 1;
        else return -1;
    }
    public static String infToPost(String s){
        int i = 0;
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        while(i < s.length()){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }

            else if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(ch) <= priority(st.peek())){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
            i++;
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)";
        System.out.println(infToPost(s));
    }
}
