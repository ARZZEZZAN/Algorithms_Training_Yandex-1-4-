package LeetCode;

public class MaxProfit {


    public static void main(String[] args) {
        int[] prices = { 2,4,1 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
                maxPrice = Integer.MIN_VALUE;
            } else if (price > maxPrice) {
                maxPrice = price;
                profit = Math.max(profit, maxPrice - minPrice);
            }
        }

        return profit;
    }
}
