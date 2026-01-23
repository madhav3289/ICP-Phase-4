package WEEK_2.Stack_Intermediate_Problems;

import java.util.Scanner;

public class Trapping_Rainwater {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(trap(nums));
        in.close();
    }
    public static int trap(int[] nums) {
        int n=nums.length;
        int [] left=new int[n];
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(nums[i],left[i-1]);
        }
        int [] right=new int[n];
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(nums[i],right[i+1]);
        }
        int maxWater=0;
        for(int i=0;i<n;i++){
            int water=Math.min(left[i],right[i])-nums[i];
            maxWater+=water;
        }
        return maxWater;
    }
}
