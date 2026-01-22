package WEEK_2.Stack_Intermediate_Problems;

import java.util.*;

public class Asteroid_Collision {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        int [] res=asteroidCollision(nums);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        in.close();

    }
    public static int[] asteroidCollision(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                st.push(nums[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()>=0 && Math.abs(nums[i])>st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(nums[i]);
                }
                else if(st.peek()<0){
                    st.push(nums[i]);
                }
                else if(Math.abs(nums[i])==Math.abs(st.peek())){
                    st.pop();
                }                
            }
        }
        int [] res=new int[st.size()];
        int idx=st.size()-1;
        while(!st.isEmpty()){
            res[idx--]=st.pop();
        }
        return res;
    }
}
