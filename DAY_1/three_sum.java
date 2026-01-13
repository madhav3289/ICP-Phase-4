package DAY_1;

import java.util.*;

public class three_sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        List<List<Integer>> list=threeSum(nums);
        System.out.print('[');
        for(int i=0;i<list.size();i++){
            System.out.print('[');
            for(int j=0;j<list.get(0).size();j++){
                System.out.print(list.get(i).get(j)+((j!=2)?",":""));
            }
            System.out.print((i!=list.size()-1)?"],":"]");
        }
        System.out.print(']');
        in.close();
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(j>i+1 && nums[j-1]==nums[j]){
                    j++;
                    continue;
                }
                if(k<n-1 && nums[k]==nums[k+1]){
                    k--;
                    continue;
                }
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    list.add(new ArrayList<>(temp));
                    j++;
                    k--;
                }
            }
        }
        return list;
    }
}
