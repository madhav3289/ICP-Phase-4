package WEEK_2.Stack_Basic_Problem;

import java.util.*;

public class Next_Greater_Element_I {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] nums1=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=in.nextInt();
        }
        int m=in.nextInt();
        int [] nums2=new int[m];
        for(int i=0;i<m;i++){
            nums2[i]=in.nextInt();
        }
        int [] res=nextGreaterElement(nums1,nums2);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        in.close();
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] nge=nextGreater(nums2);
        int [] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=nge[nums1[i]];
        }
        return res;
    }
    public static int [] nextGreater(int [] nums){
        int n=nums.length;
        int [] nge=new int[10000+1];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]>=st.peek()){
                st.pop();
            }
            nge[nums[i]]=(!st.isEmpty()?st.peek():-1);
            st.push(nums[i]);
        }
        return nge;
    }
}
