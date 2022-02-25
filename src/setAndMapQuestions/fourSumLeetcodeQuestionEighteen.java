package setAndMapQuestions;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSumLeetcodeQuestionEighteen {

    private static List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (num.length < 4) {
            return resultList;
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if (i != 0 && num[i] == num[i - 1]) {
                continue;
            }
            int val1 = num[i];
            List<List<Integer>> subResult = threeSum(num, target - val1, i + 1);
            for (List<Integer> list : subResult) {
                list.add(val1);
                resultList.add(list);
            }
        }
        return resultList;
    }

    private static List<List<Integer>> threeSum(int[] num, int target, int startingIndex) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (num.length - startingIndex < 3) {
            return resultList;
        }
        for (int i = startingIndex; i <= num.length - 3; i++) {
            if (i != startingIndex && num[i] == num[i - 1]) {
                continue;
            }
            int val1 = num[i];
            List<List<Integer>> subResult = twoSum(num, i + 1, num.length - 1, target - val1);
            for (List<Integer> list : subResult) {
                list.add(val1);
                resultList.add(list);
            }
        }
        return resultList;
    }

    private static List<List<Integer>> twoSum(int[] num, int startingIndex, int endingIndex, int target) {
        int leftIndex = startingIndex, rightIndex = endingIndex;
        List<List<Integer>> resultList = new ArrayList<>();
        if (num.length < 2) {
            return resultList;
        }
        while (leftIndex < rightIndex) {
            if (leftIndex != startingIndex && num[leftIndex] == num[leftIndex - 1]) {
                leftIndex++;
                continue;
            }
            int sum = num[leftIndex] + num[rightIndex];
            if (sum < target) {
                List<Integer> subResult = new ArrayList<>();
                subResult.add(num[leftIndex]);
                subResult.add(num[rightIndex]);
                resultList.add(subResult);
                leftIndex++;
                rightIndex--;
            } else if (sum > target) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }
        return resultList;
    }

    public static void main(String[] args) {

    }
}
