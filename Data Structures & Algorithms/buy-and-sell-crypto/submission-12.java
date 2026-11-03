class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<n; i++) {
            int profit = prices[i] - minPrice;   // minPrice = cheapest BEFORE today
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, prices[i]);  // update last, ready for tomorrow
        }
        return maxProfit;
    }
}
