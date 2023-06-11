import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min = prices.get(0);
        int cost;
        int profit = 0;
        for(int i=0;i<prices.size();i++){
            cost = prices.get(i)-min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices.get(i));
        }
        return profit;
    }
}