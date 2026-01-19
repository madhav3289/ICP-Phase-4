package WEEK_1;

import java.util.Scanner;

public class first_occurence_index {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        System.out.println(strStr(s1,s2));
        in.close();
    }
    public static int strStr(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int i=0;
        while(i<n){
            if(s1.charAt(i)==s2.charAt(0) && i+m-1<n && s1.substring(i,i+m).equals(s2)){
                return i;
            }
            i++;
        }
        return -1;
    }
}
