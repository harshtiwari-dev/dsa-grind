// Problem statement: Find the maximum profit from buying and selling a stock once.
// Approach/pattern: Track the minimum price so far and calculate the maximum profit at each price.
// Time: O(n)
// Space: O(1)

class Solution {
    public int maxProfit(int[] prices) {
    
        int min = prices[0];
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){

            min = Math.min(min , prices[i]);
            int profit = prices[i] - min;
            maxProfit = Math.max(profit , maxProfit);
        }        
        return maxProfit;
    }
}