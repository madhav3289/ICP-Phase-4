package WEEK_2.Stack_Basic_Problem;

import java.util.*;

public class Valid_Parentheses {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(isValid(s));
        in.close();
    }
    public static boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(ch==')' &&  st.peek()!='('){
                    return false;
                }
                else if(ch==']'  && st.peek()!='['){
                    return false;
                }
                else if(ch=='}'  && st.peek()!='{'){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
