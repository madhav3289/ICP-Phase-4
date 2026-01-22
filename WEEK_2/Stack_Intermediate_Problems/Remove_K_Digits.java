package WEEK_2.Stack_Intermediate_Problems;

import java.util.*;

public class Remove_K_Digits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int k=in.nextInt();
        System.out.println(removeKdigits(s, k));
        in.close();
    }
    public static String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && ch<st.peek()){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        int count=0;
        while(count<sb.length() && sb.charAt(count)=='0'){
            count++;
        }
        return (count!=sb.length())?sb.substring(count).toString():"0";
    }
}
