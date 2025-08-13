class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int index = 0;
        for(int i = 0;i<prices.length;i++)
        {
            if(prices[index]>prices[i])
            {
                index = i ;
            }
            else
            {
                if(profit < prices[i]- prices[index])
                {
                    profit = prices[i]- prices[index];
                }
            }
        }
        return profit;
    }
}