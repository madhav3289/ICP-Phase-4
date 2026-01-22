package WEEK_2.Stack_Intermediate_Problems;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        int [] nge=nextGreaterElements(nums);
        for(int i=0;i<nge.length;i++){
            System.out.print(nge[i]+" ");
        }
        in.close();

    }
    public static int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            st.add(nums[i]);
        }
        int [] nge=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]>=st.peek()){
                st.pop();
            }
            nge[i]=(!st.isEmpty()?st.peek():-1);
            st.push(nums[i]);
        }
        return nge;
    }
}
