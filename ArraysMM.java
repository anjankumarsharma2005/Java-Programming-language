import java.util.*;

public class ArraysMM {
    public static int buyAndsellStock(int prices[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void maint(String args[]) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndsellStock(prices));
        
    }
}
