class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int buyDay = 0;
        int sellDay = prices.length - 1;

        while(buyDay < prices.length - 1) {

            if(buyDay == sellDay) {
                buyDay++;
                sellDay = prices.length - 1;
            }
            else{
                int temp = prices[sellDay] - prices[buyDay];
                if(temp > profit) profit = temp;
                sellDay--;
            }
        }

        return profit;

    }
}
