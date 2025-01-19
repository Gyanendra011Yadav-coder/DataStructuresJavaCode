package FirstPhaseLearning.codingNinjas.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-24,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class BuySellStockII {

    public static void main(String[] args) {
        long [] values={7 ,6 ,5 ,4 ,3 ,2 ,1};
//        long [] values={1,2,3,4,5};
        System.out.println(getMaximumProfit(values.length, values));
    }

    public static long getMaximumProfit (int n, long[] values) {
        // Your code goes here.
        long currMaxProfitInd = 0;

        for (int i = 1; i < n; i++) {
            if(values[i]>=values[i-1]){
                currMaxProfitInd = i;
            }
        }
        return currMaxProfitInd;
    }
}
