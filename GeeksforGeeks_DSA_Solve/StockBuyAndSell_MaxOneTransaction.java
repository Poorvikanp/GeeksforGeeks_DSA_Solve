public class StockBuyAndSell_MaxOneTransaction {
    public int maximumProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        StockBuyAndSell_MaxOneTransaction sol = new StockBuyAndSell_MaxOneTransaction();
        
        // Test cases
        int[] prices1 = {7, 10, 1, 3, 6, 9, 2};
        System.out.println("Output for prices1: " + sol.maximumProfit(prices1)); // Expected: 8
        
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Output for prices2: " + sol.maximumProfit(prices2)); // Expected: 0
        
        int[] prices3 = {1, 3, 6, 9, 11};
        System.out.println("Output for prices3: " + sol.maximumProfit(prices3)); // Expected: 10
    }
}