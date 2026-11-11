class Solution {
    public int maxProfit(int[] prices) {

        int low = 0;
        int high = 0;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){

            int currProfit = prices[high] - prices[low];

            if(currProfit > maxProfit){
                maxProfit = currProfit;
            }

            if(prices[high] < prices[low]){
                low = high;
            }

            high++;


        }

        return maxProfit;
    
    }
}
