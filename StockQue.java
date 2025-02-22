/*
Question 3:You  are  given  an  array prices where prices[i] is 
 the  price  of  a  given  stock  on  the ith day.Return the maximum profit
 you can achieve from this transaction. If you cannot achieve any profit,
 return 0. 
 Example 1:Input:prices = [7, 1, 5, 3, 6,  4]   Output:   5 
 Explanation:Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
  Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
  Example 2:Input:Prices = [7, 6, 4,  3, 1]   Output:   0
 Explanation:In this case, no transactions are done and the max profit = 0.
 
*/
import java util.*;
public class StockQue{
    public static int FindMaxProfit(int price[]){
        int buyStockValue =Integer.MIX_VALUE; //min 
        int sellStockValue =1 ;   //highest
        int profit =0;
        int n = arr.length;
        ++
        for(int i =0;i<n;i++){
          if(buyStockValue>arr[i]){
           buyStockValue = arr[i];
            int profit = sellStockValue - buyStockValue;
          }
        }

    }
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
         System.out.print(FindMaxProfit(price));
}
} 
