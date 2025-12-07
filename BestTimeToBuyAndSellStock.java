import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            int profit = prices[i] - buy;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();
        sc.close();
        System.out.print(maxProfit(prices));
    }
}
