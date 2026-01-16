package DAY_1;

import java.util.*;

public class median_of_two_sorted_array {
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
        System.out.println(solveLinear(nums1,nums2));
        // System.out.println(solveBinary(nums1,nums2));
        in.close();
    }

    // Brute Force >> Linear Search ( TC-> O(n+m) SC-> O(n+m))
    public static double solveLinear(int [] nums1,int [] nums2){
        int n=nums1.length;
        int m=nums2.length;
        int [] mergeArray=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                mergeArray[k]=nums1[i];
                i++;
            }
            else{
                mergeArray[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            mergeArray[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            mergeArray[k]=nums2[j];
            j++;
            k++;
        }
        return findMedian(mergeArray,n+m);
    }
    public static double findMedian(int [] nums,int n){
        if(n%2==0){
            return (nums[n/2-1]+nums[n/2])/2.0;
        }
        else{
            return nums[n/2]/1.0;
        }
    }

    // Optimal >> Binary Search ( TC-> O(log(n+m)) SC-> O(1))
    // public static double solveBinary(int [] nums1,int [] nums2){

    // }


}
