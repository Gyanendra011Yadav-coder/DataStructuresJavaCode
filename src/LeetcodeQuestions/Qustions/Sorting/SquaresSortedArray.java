package LeetcodeQuestions.Qustions.Sorting;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-12-05,Dec,2022
 * in Project: DataStructuresJavaCode
 */
public class SquaresSortedArray {

    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
