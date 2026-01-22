package WEEK_2.Stack_Intermediate_Problems;

import java.util.*;

public class Stock_Span_Problem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        ArrayList<Integer> res=calculateSpan(nums);
        for(int i=0;i<n;i++){
            System.out.print(res.get(i)+" ");
        }
        in.close();
    }
    public static ArrayList<Integer> calculateSpan(int[] nums) {
        // code here
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]>=nums[st.peek()]){
                st.pop();
            }
            res.add(!st.isEmpty()?i-st.peek():i+1);
            st.push(i);
        }
        return res;
    }
}
