class Solution {
    public int maxProfit(int[] prices) {


        int solution = 0;
        int lowestSofar = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] - lowestSofar > solution){
                solution = prices[i] - lowestSofar;
            }
            if(lowestSofar > prices[i]){
                lowestSofar =  prices[i];
            }
        }

        return solution;
    }

}
