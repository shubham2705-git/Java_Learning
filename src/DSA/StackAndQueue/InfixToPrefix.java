package StackAndQueue;

import java.util.Stack;

public class InfixToPrefix {
    public static int priority(char ch){
        if(ch == '^') return 3;
        else if(ch == '*' || ch== '/') return 2;
        else if(ch == '-' || ch == '+') return 1;
        else return -1;
    }
    public static String infToPre(String s){
        StringBuilder reversed = new StringBuilder(s);
        reversed.reverse();
        for(int i=0; i<reversed.length(); i++){
            if(reversed.charAt(i) == '(') reversed.setCharAt(i, ')');
            else if(reversed.charAt(i) == ')') reversed.setCharAt(i,'(');
        }
        int i = 0;
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        while(i < reversed.length()){
            char ch = reversed.charAt(i);

            // skip whitespace
          //  if (Character.isWhitespace(ch)) { i++; continue; }

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
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            }
            else{
                // <<-- NOTE THE CHANGE HERE: equality case uses ch == '^' (flipped)
                while (!st.isEmpty() &&
                        (priority(ch) < priority(st.peek()) ||
                                (priority(ch) == priority(st.peek()) && ch == '^')))
                {
                    ans.append(st.pop());
                }

                st.push(ch);
            }
            i++;
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "(a+b)*c-d+f";
        System.out.println(infToPre(s)); // prints: +-*+abcdf
    }
}
