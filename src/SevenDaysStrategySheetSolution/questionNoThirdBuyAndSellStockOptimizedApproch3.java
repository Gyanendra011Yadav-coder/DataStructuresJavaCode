package SevenDaysStrategySheetSolution;

/**
 * @author Gyanendra Yadav
 * @created 09/01/2022- 7:59 PM
 * @project DataStructuresJavaCode
 */
public class questionNoThirdBuyAndSellStockOptimizedApproch3 {
    //main method of the class
    public static void main(String[] args) {
        int[] stockAnalysis = {3,1,4,8,7,2,5};
        System.out.println(findMaxProfitSellingStockApproachSecond(stockAnalysis));
    }


        //Approach, Having Time Complexity Of o(n) and space Complexity of o(1)
        private static int findMaxProfitSellingStockApproachSecond(int[] prices){
            int minTillNow=prices[0];
            int profit=0;
            int maxProfit=0;
            for (int i = 0; i < prices.length; i++) {
                minTillNow=Math.min(minTillNow,prices[i]);
                profit=prices[i]-minTillNow;
                if(profit>maxProfit){
                    maxProfit=profit;
                }else{
                    continue;
                }
            }
        return maxProfit;
    }
}

