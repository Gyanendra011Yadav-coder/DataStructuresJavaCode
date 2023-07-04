package Arrays;

import java.util.ArrayList;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-22,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class MaximumSubarraysSumKConcatenation {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);arr.add(3); //arr.add(3);arr.add(4);
        System.out.println(maxSubSumKConcat(arr, arr.size(), 3));
    }

    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        ArrayList<Integer> temp = new ArrayList<>();
        // Concat the array K times.
        for (int i = 1; i < k; i++) {
            temp.addAll(arr);
        }
        arr.addAll(temp);

        long currSum=0;
        long overallSum=Integer.MIN_VALUE;

        for (int i = 0; i <arr.size() ; i++) {
            currSum+=arr.get(i);
            overallSum=Math.max(currSum, overallSum);

            if(currSum<0){
                currSum=0;
            }
        }
        return overallSum;
    }

}
