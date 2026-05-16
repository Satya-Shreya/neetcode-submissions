class Solution {
    public int maxProfit(int[] prices) {
        int length=prices.length;
        int maxDiff=0;
        int minBuy=prices[0];

        for(int i=1;i<length;i++){
            minBuy=Math.min(minBuy,prices[i]);
            int difference=prices[i]-minBuy;
            maxDiff=Math.max(maxDiff,difference);
        }

        return maxDiff;
    }
}
