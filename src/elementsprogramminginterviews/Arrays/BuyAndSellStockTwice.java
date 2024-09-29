package elementsprogramminginterviews.Arrays;

import java.util.Arrays;
import java.util.List;

public class BuyAndSellStockTwice {
    //[12,,11,13,9,12,8,14,13,15]
    public static int maxProfOne(List<Integer> prices, int idx) {
        int minSoFar = prices.get(idx), res = 0;
        for (int i = idx + 1; i < prices.size(); i++) {

            // Update the minimum price so far
            minSoFar = Math.min(minSoFar, prices.get(i));

            // Update the maximum profit
            res = Math.max(res, prices.get(i) - minSoFar);
        }
        return res;
    }

    // Max profit with two transactions allowed
    public static int maxProfTwo(List<Integer> prices) {
        int n = prices.size();
        int minSoFar = prices.get(0), res = 0;

        for (int i = 1; i < n; i++) {
            if (prices.get(i) > minSoFar) {

                // Compute the max profit when one transaction happens here
                // and another for the remaining array from i+1 to n-1
                int curr = prices.get(i) - minSoFar + maxProfOne(prices, i);
                res = Math.max(res, curr);
            } else {

                // Update the minimum price so far
                minSoFar = Math.min(minSoFar, prices.get(i));
            }
        }
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        List<Integer> price = Arrays.asList(12,11,13,9,12,8,14,13,15);
        System.out.println(maxProfTwo(price));
    }


}
