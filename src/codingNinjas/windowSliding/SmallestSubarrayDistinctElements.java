package codingNinjas.windowSliding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-11,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class SmallestSubarrayDistinctElements {

    public static void main(String[] args) {
        int [] arr={4 ,2 ,2 ,2 ,3 ,4 ,4 ,3 };
        System.out.println(smallestSubarrayWithKDistinct(arr, 3));
    }

    public static ArrayList<Integer> smallestSubarrayWithKDistinct(ArrayList<Integer> a, int K)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int minValue= Integer.MAX_VALUE;
        return result;
    }

    public static int smallestSubarrayWithKDistinct(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return -1;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int left = 0;
        int distinctCount = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            if (frequencyMap.get(num) == 1) {
                distinctCount++;
            }

            while (distinctCount == k) {
                minLength = Math.min(minLength, right - left + 1);

                int leftNum = nums[left];
                frequencyMap.put(leftNum, frequencyMap.get(leftNum) - 1);

                if (frequencyMap.get(leftNum) == 0) {
                    distinctCount--;
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

}
