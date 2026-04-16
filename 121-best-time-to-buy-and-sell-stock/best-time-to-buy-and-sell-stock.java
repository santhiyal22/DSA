class Solution {
    public int maxProfit(int[] p) {
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        // int MinIndex = 0;
        // int profit = 0;
        // int n = prices.length;

        // for(int i=0;i<n;i++) {
        //     if(prices[i] < min) {
        //         min = prices[i];
        //         MinIndex = i;
        //     }
        // }
        // for(int j = MinIndex; j < n; j++) {
        //     if(prices[j] > max)  {
        //         max = prices[j];
        //     }
        // }
        // profit = max - min;
        // return profit;

        int mini = p[0], maxprofit = 0;
        for(int i=1;i<p.length;i++) {
            int cost = p[i] - mini;
            maxprofit = Math.max(cost, maxprofit);
            mini = Math.min(mini, p[i]);
        }
        return maxprofit;
    }
}