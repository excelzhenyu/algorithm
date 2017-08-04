package leetcode;

/**
 * Created by zhenyu on 17-3-6.
 */
public class SellStockII {
        public int maxProfit(int[] prices) {
            if(prices.length == 0) return 0;
            int min = prices[0];
            int profit = 0;
            for(int i = 0;i<prices.length;i++){
                int day_profit = 0;
                if(i==prices.length-1){
                    int lastprofit = prices[i]-min<0?0:prices[i]-min;
                    return profit+lastprofit;
                }else if(prices[i+1]<prices[i]) {
                    day_profit = prices[i]-min;
                    min = prices[i+1];
                }
                profit += day_profit;
            }
            return profit;
        }
}
