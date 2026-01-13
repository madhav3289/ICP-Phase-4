package DAY_1;

import java.util.*;

public class buy_and_sell_stock {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(maxProfit(arr,n));
        in.close();
    }
    public static int maxProfit(int[] prices,int n) {
        int maxP=0;
        int buy=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            maxP=Math.max(maxP,prices[i]-buy);
        }
        return maxP;
    }
}
