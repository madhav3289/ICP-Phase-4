package WEEK_2.Stack_Intermediate_Problems;

import java.util.*;

public class Daily_Temperatures {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=in.nextInt();
        }
        int [] days=dailyTemperatures(temp);
        for(int i=0;i<n;i++){
            System.out.print(days[i]+" ");
        }
        in.close();

    }
    public static int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int [] days=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temp[i]>=temp[st.peek()]){
                st.pop();
            }
            days[i]=(!st.isEmpty()?st.peek()-i:0);
            st.push(i);
        }
        return days;
    }
}
