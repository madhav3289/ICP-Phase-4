package WEEK_2;

import java.util.Scanner;

public class Remove_OuterMost_Parentheses {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(removeOuterParentheses(s));
        in.close();
    }
    public static String removeOuterParentheses(String s) {
        int n=s.length();
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==')'){
                count--;
                if(count!=0){
                    sb.append(ch);
                }
            }
            else{
                count++;
                if(count>1){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
