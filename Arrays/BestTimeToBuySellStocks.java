
public class BestTimeToBuySellStocks {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int prices[]){
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int price : prices){
            if(price < min_price){
                min_price = price;
            } 

            max_profit = Math.max(max_profit, price - min_price);
        }

        System.out.println("Buy : " + min_price);
        System.out.println("Sell : " + (min_price + max_profit));
        return max_profit;
    }
}
