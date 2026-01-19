package WEEK_1;

import java.util.*;

public class first_missing_positive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        // System.out.println(firstMissingPositive1(nums));
        // System.out.println(firstMissingPositive2(nums));
        in.close();
    }

    // Brute Force (TC -> O(n) , SC -> O(n))
    // public static int firstMissingPositive1(int[] nums) {
        
    // }
    // Optimal (TC -> O(n) , SC -> O(1))
    
    // public static int firstMissingPositive2(int[] nums) {
        
    // }    
}
