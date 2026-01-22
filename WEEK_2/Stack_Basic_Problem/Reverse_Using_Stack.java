package WEEK_2.Stack_Basic_Problem;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Using_Stack {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(reverse(s));
        in.close();
    }
    public static String reverse(String S) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
