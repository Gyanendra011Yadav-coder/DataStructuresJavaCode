package ArrayLeetCode;

/**
 * ##Max Consecutive Ones
 *
 * Question:-
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *Example 1:
 *Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 *                                       The maximum number of consecutive 1s is 3.
 */
public class consecutiveOnes {
    class Solution {
        public static int findMaxConsecutiveOnes(int[] nums) {
            int count=0 , maxCount=0;
            for(int i=0; i<nums.length ; i++){
                if (nums[i]==1){
                    count++;
                    maxCount=Math.max(maxCount,count);
                }else{
                    count=0;
                }
            }
            return maxCount;

        }
        }
        // there is no need to specify the main class as it is already given in the compiler
}
