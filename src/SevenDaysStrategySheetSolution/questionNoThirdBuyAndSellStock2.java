package SevenDaysStrategySheetSolution;

/**
 * @author Gyanendra Yadav
 * @created 11/01/2022- 10:22 PM
 * @project DataStructuresJavaCode
 */
public class questionNoThirdBuyAndSellStock2 {
    public static void main(String[] args) {
        int[] stockAnalysis = {5,2,7,3,6,1,2,4};
        System.out.println(findMaxProfitSellingStockApproachSecond(stockAnalysis));
    }
    //Approach, Having Time Complexity Of o(n) and space Complexity of o(1)
    private static int findMaxProfitSellingStockApproachSecond(int[] prices){
        int totalProfit=0;
        for (int i = 1; i <prices.length; i++){
            if(prices[i-1]<prices[i]){
                totalProfit+=prices[i]-prices[i-1];
            }else{
                continue;
            }
        }
        return totalProfit;
    }
}
