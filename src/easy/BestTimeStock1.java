package easy;

public class BestTimeStock1 {
	public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;
        for (int i = 0; i < prices.length - 1; i++){
            for (int j = i + 1; j < prices.length; j++){
                currentProfit = prices[j] - prices[i];
                if (currentProfit > maxProfit){
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}
