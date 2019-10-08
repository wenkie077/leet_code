package easy;

public class BestTimeStock2 {
	public int maxProfit(int[] prices) {
        if (prices.length == 0){return 0;}
        int currentMinBuy = prices[0];
        int sumProfit = 0;
        for(int i = 0; i < prices.length; i++){
            System.out.println(currentMinBuy + " " + i + " " + sumProfit);
            if (i == prices.length - 1){
                if (prices[i] > currentMinBuy){
                    sumProfit += (prices[i] - currentMinBuy);
                }
            }else{
                if (prices[i] > prices[i + 1]){
                    if (prices[i] > currentMinBuy){
                        sumProfit += (prices[i] - currentMinBuy);
                    }
                    currentMinBuy = prices[i];
                }else{
                    if (prices[i] < currentMinBuy){
                        currentMinBuy = prices[i];
                    }
                }
            }
            System.out.println(currentMinBuy + " " + i + " " + sumProfit);
        }
        return Math.max(sumProfit,0);
    }
}
