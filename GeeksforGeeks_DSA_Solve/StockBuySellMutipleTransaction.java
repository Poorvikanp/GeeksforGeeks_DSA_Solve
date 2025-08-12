public class StockBuySellMutipleTransaction {
    // Function to find the maximum profit with multiple transactions
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // If the current price is greater than the previous price, add the difference to maxProfit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
        // Output: Maximum Profit: 865
        // Explanation: Buy at 100, sell at 180, buy at 260,
        // sell at 310, buy at 40, sell at 535, buy at
        // 695. Total profit = (180-100) + (310-260) + (535-40) + (695-535) = 865
        
    }
}
