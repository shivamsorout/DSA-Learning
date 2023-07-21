package Arrays;
//Buy and Sell Stocks

// You are given an array prices where prices[i] is the price of given stock on the ith day. You want
// maximize your profit by choosing a single day to buy one stock and choosing a different day in the
// future to sell that stock. Return the maximum profit you can achieve from this transaction. If you
// can not achieve any profit return 0
public class BuyAndSellStocks {
    public static int buyAndSellStock(int prices[]){

        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyingPrice<prices[i]){
                int profit = prices[i]-buyingPrice; //today profit
                maxProfit = Math.max(maxProfit,profit);
            } else {
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max Profit :"+buyAndSellStock(prices));
    }

}
