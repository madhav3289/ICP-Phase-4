package WEEK_2.Stack_Intermediate_Problems;

import java.util.*;

public class Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] heights=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=in.nextInt();
        }
        System.out.println(largestRectangleArea(heights));
        in.close();
    }
    public static int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int [] nse=nextSmaller(heights);
        int [] pse=prevSmaller(heights);
        int maxArea=0;
        for(int i=0;i<n;i++){
            int area=heights[i]*(nse[i]-(pse[i]+1));
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    public static int [] nextSmaller(int [] nums){
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int [] nse=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                st.pop();
            }
            nse[i]=(!st.isEmpty()?st.peek():n);
            st.push(i);
        }
        return nse;
    }
    public static int [] prevSmaller(int [] nums){
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int [] pse=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                st.pop();
            }
            pse[i]=(!st.isEmpty()?st.peek():-1);
            st.push(i);
        }
        return pse;
    }
}
