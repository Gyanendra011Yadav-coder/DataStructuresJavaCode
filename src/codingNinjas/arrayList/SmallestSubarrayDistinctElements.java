package codingNinjas.arrayList;

import TreeDataStructure.InsertNodeBinaryTree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-19,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class SmallestSubarrayDistinctElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        int[] arr = {1, 5, 4, 3, 2, 6, 7, 1, 2};
        int[] arr = {1, 1};
        Arrays.stream(arr).forEach(value -> list.add(value));

        int distinctEle = 2;
        ArrayList<Integer> resultGot = smallestSubarrayWithKDistinctBrutt(list, distinctEle);
        resultGot.forEach(System.out::println);
    }
    public int smallestSubarrayWithKDistinct(int[] A, int K) {
        int n = A.length;
        Map<Integer, Integer> counts = new HashMap<>();
        int left = 0, right = 0, distinctCount = 0, smallestLength = Integer.MAX_VALUE;

        while (right < n) {
            // If distinct count is less than K, expand the window to the right
            if (distinctCount < K) {
                int num = A[right++];
                counts.put(num, counts.getOrDefault(num, 0) + 1);
                if (counts.get(num) == 1) {
                    distinctCount++;
                }
            }
            // If distinct count is equal to K, update the smallest length and shrink the window from the left
            else if (distinctCount == K) {
                smallestLength = Math.min(smallestLength, right - left);
                int num = A[left++];
                counts.put(num, counts.get(num) - 1);
                if (counts.get(num) == 0) {
                    distinctCount--;
                }
            }
            // If distinct count is greater than K, shrink the window from the left
            else {
                int num = A[left++];
                counts.put(num, counts.get(num) - 1);
                if (counts.get(num) == 0) {
                    distinctCount--;
                }
            }
        }

        return smallestLength == Integer.MAX_VALUE ? -1 : smallestLength;
    }
    public static ArrayList<Integer> smallestSubarrayWithKDistinct(ArrayList<Integer> a, int K) {
        int n = a.size();
        HashMap<Integer, Integer> counts = new HashMap<>();
        int left = 0, right = 0, distinctCount = 0;
        int minSubarrayLength = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();

        while (right < n) {
            int num = a.get(right);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) == 1) {
                distinctCount++;
            }
            right++;

            while (distinctCount == K) {
                if (right - left < minSubarrayLength) {
                    minSubarrayLength = right - left;
                    result.clear();
                    result.add(left);
                    result.add(right - 1);
                }
                int leftNum = a.get(left);
                counts.put(leftNum, counts.get(leftNum) - 1);
                if (counts.get(leftNum) == 0) {
                    distinctCount--;
                }
                left++;
            }
        }

        return result;
    }
    public static ArrayList<Integer> smallestSubarrayWithKDistinctBrutt(ArrayList<Integer> list, int distinctVal) {
        ArrayList<Integer> result = new ArrayList<>();
        List<Integer> sortedNumbers = list.stream().sorted().collect(Collectors.toList());//sorting using stream

        /*while (result.size() < distinctVal) {
            if (!result.contains(sortedNumbers.get(i))) {
                result.add(sortedNumbers.get(i));
            }
            i++;
        }*/
        for (int j = 0; j < list.size(); j++) {
            if(!result.contains(sortedNumbers.get(j))){
                result.add(sortedNumbers.get(j));
            }
            for (int k = j+1; k < list.size(); k++) {
                if (result.size() < distinctVal) {
                    if (sortedNumbers.get(j) != sortedNumbers.get(k) && !result.contains(sortedNumbers.get(k))) {
                        result.add(sortedNumbers.get(j));
                    }
                } else{
                    return result;
                }
            }

        }

        if(result.size()!=distinctVal){
            result.stream().forEach(val->result.remove(val)); //using lambda to remove values

            result.add(0);
            result.add(0);
        }

        return result;
    }

    /*
    * import java.util.HashMap;
import java.util.Map;

public class SmallestSubarrayWithKDistinct {
    public int smallestSubarrayWithKDistinct(int[] A, int K) {
        int n = A.length;
        Map<Integer, Integer> counts = new HashMap<>();
        int left = 0, right = 0, distinctCount = 0, smallestLength = Integer.MAX_VALUE;

        while (right < n) {
            // If distinct count is less than K, expand the window to the right
            if (distinctCount < K) {
                int num = A[right++];
                counts.put(num, counts.getOrDefault(num, 0) + 1);
                if (counts.get(num) == 1) {
                    distinctCount++;
                }
            }
            // If distinct count is equal to K, update the smallest length and shrink the window from the left
            else if (distinctCount == K) {
                smallestLength = Math.min(smallestLength, right - left);
                int num = A[left++];
                counts.put(num, counts.get(num) - 1);
                if (counts.get(num) == 0) {
                    distinctCount--;
                }
            }
            // If distinct count is greater than K, shrink the window from the left
            else {
                int num = A[left++];
                counts.put(num, counts.get(num) - 1);
                if (counts.get(num) == 0) {
                    distinctCount--;
                }
            }
        }

        return smallestLength == Integer.MAX_VALUE ? -1 : smallestLength;
    }

    public static void main(String[] args) {
        int[] A =
*/
}
