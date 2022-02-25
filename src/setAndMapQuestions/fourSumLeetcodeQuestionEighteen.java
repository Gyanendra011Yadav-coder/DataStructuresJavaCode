package setAndMapQuestions;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSumLeetcodeQuestionEighteen {
    //Method to find the Four Sum From The Array
    public static List<List<Integer>> fourSum(int[] num, int target) {
        // The List that will be taking care of All the Result
        List<List<Integer>> resultList = new ArrayList<>();
        //checking the base condition,if array's length is less than four than we can't
        // find four sum, therfore we are checking if it's length is equal or not
        if (num.length < 4) {
            return resultList;
        }
        //Sorting The Array, so that we can solve it easily.
        Arrays.sort(num);

        //Travesing the whole array's element one by one
        for (int i = 0; i < num.length; i++) {
            // again checking the base condition


             if (i != 0 && num[i] == num[i - 1]) {
                continue;
            }




            //Storing the first value, so that we can look for others
            int val1 = num[i];
            // Now, we will be findiing the threeSum in the array and the target we will be less than the firstIndex value of the array
            List<List<Integer>> subResult = threeSum(num, target - val1, i + 1);
            //Putting, one by one Value in the Sub result list and then storing the SubResult in the original List
            for (List<Integer> list : subResult) {
                list.add(val1);
                resultList.add(list);
            }
        }
        return resultList;
    }
// This method will be fidning the three sum
    public static List<List<Integer>> threeSum(int[] num, int target, int startingIndex) {
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

    public static List<List<Integer>> twoSum(int[] num, int startingIndex, int endingIndex, int target) {
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
            if (sum ==target) {
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
