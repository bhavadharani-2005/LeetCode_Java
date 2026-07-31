public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            // Update the minimum price seen so far
            if (price < minPrice) minPrice = price;

            // Calculate profit if sold today
            int profit = price - minPrice;

            // Update max profit
            if (profit > maxProfit) maxProfit = profit;
        }

        return maxProfit;
    }
}
