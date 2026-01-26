package WEEK_2.Challenges_Problem;

import java.util.*;

public class Sum_of_Total_Strength_of_Wizards {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }        
        System.out.println(totalStrength(arr));
        in.close();
    }
    public static int totalStrength(int[] nums) {
        int n=nums.length;
        int mod=1_000_000_007;

        int [] nse=nextSmaller(nums);
        int [] pse=prevSmaller(nums);

        long [] prefix=new long[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=(prefix[i-1]+nums[i])%mod;
        }
        long [] p=new long[n];
        p[0]=prefix[0];
        for(int i=1;i<n;i++){
            p[i]=(p[i-1]+prefix[i])%mod;
        }
        
        long totalSum=0;
        for(int i=0;i<n;i++){
            int left=pse[i];
            int right=nse[i];

            int lf=i-left;
            int rt=right-i;

            long sum1=0,sum2=0;

            // compute left sum
            if(left!=-1){
                sum1=p[i-1];
                long s1=0;
                if(left-1>=0){
                    s1=p[left-1];
                }
                sum1=(sum1-s1)%mod;
            }
            else if(left==-1){
                if(i-1>=0){
                    sum1=p[i-1];
                    lf=i+1;
                }
                else{
                    lf=1;
                }
            }

            // compute right sum
            if(right==-1){
                sum2=p[n-1];
                long s2=0;
                if(i-1>=0){
                    s2=p[i-1];
                }
                sum2=(sum2-s2)%mod;
                rt=n-i;
            }
            else if(right!=-1){
                sum2=p[i+rt-1];
                long s2=0;
                if(i-1>=0){
                    s2=p[i-1];
                }
                sum2=(sum2-s2)%mod;
            }

            totalSum=totalSum+(nums[i]%mod*((lf*sum2)%mod-(rt*sum1)%mod+mod))%mod;
            totalSum=(totalSum)%mod;
        }
        return (int)totalSum;
    }
    public static int [] nextSmaller(int [] nums){
        int n=nums.length;
        int [] nse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                st.pop();
            }
            nse[i]=(!st.isEmpty()?st.peek():-1);
            st.push(i);
        }
        return nse;
    }
    public static int [] prevSmaller(int [] nums){
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
