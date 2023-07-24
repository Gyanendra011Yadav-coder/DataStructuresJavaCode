package codingNinjas.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-20,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class MaximumSubarraySum {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long overallMax=Integer.MIN_VALUE;
        long currMax=0;
        for (int i = 0; i < n; i++) {
            currMax+=arr[i];
            overallMax=Math.max(currMax, overallMax);

            if(currMax<0)  currMax=0;
        }
        return (overallMax<0)?0: overallMax;
    }
}
