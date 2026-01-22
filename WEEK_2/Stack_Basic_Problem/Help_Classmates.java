package WEEK_2.Stack_Basic_Problem;

import java.util.*;

public class Help_Classmates {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        int [] nse=nextSmallerE(nums, n);
        for(int i=0;i<n;i++){
            System.out.print(nse[i]+" ");
        }
        in.close();
    }
    public static int[] nextSmallerE(int nums[], int n) {
        int [] nse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]<=st.peek()){
                st.pop();
            }
            nse[i]=(!st.isEmpty()?st.peek():-1);
            st.push(nums[i]);
        }
        return nse;
    }
}
