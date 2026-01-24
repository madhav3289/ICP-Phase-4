package WEEK_2.Stack_Intermediate_Problems;

import java.util.*;

public class Sum_of_subarray_minimums {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }        
        System.out.println(sumSubarrayMins(arr));
        in.close();
    }
    public static int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int [] nse=nextSmaller(arr);
        int [] pse=prevSmaller(arr);
        int mod=1_000_000_007;
        long sum=0;
        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            long count=((left*right)%mod*arr[i])%mod;
            sum=(sum+count)%mod;
        }
        return (int)sum%mod;
    }
    public static int[] nextSmaller(int [] nums){
        int n=nums.length;
        int [] nse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                st.pop();
            }
            nse[i]=(!st.isEmpty()?st.peek():n);
            st.push(i);
        }
        return nse;
    }
    public static int[] prevSmaller(int [] nums){
        int n=nums.length;
        int [] pse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]){
                st.pop();
            }
            pse[i]=(!st.isEmpty()?st.peek():-1);
            st.push(i);
        }
        return pse;
    }
}
