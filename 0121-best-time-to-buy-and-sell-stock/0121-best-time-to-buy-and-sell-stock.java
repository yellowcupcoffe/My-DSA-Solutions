class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0]; // Track the lowest price seen
        int maxProfit = 0;        // Track the best profit found

        for (int i = 1; i < prices.length; i++) {
            // 1. Update minPrice if the current price is lower
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // 2. Otherwise, check if selling today yields a better profit
            else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }
}