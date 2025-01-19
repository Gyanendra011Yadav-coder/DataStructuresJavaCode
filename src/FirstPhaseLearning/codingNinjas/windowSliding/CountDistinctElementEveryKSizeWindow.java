package FirstPhaseLearning.codingNinjas.windowSliding;

import java.util.*;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-24,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class CountDistinctElementEveryKSizeWindow {
    public static void main(String[] args) {
        /*FirstPhaseLearning.ArrayList<Integer> arr = new FirstPhaseLearning.ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        arr.add(3);
        int k = 3;

        FirstPhaseLearning.ArrayList<Integer> actualOutput = countDistinctElements(arr, k);*/
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maximumInAllSubarraysOfSizeK(arr, arr.length, 3));


    }

   /* public static List<Integer> maximumInAllSubarraysOfSizeK(int[] arr, int n, int k) {
        FirstPhaseLearning.ArrayList<Integer> resultMax = new FirstPhaseLearning.ArrayList<>();
        int curr_Max = Integer.MIN_VALUE;
        int overall_Max = Integer.MIN_VALUE;

        int index2 = 0;
        for (int index1 = 0; index1 < (arr.length - k); index1++) {
            index2=index1+1;
            while (index2 < arr.length && (index2 < (index1+k))) {
                if(arr[index1]>arr[index2]){
                    curr_Max=arr[index1];
                }else{
                    curr_Max=arr[index2];
                }
                if (curr_Max>overall_Max){
                    overall_Max=curr_Max;
                }
                index2+=1;
            }
            resultMax.add(overall_Max);
            index2=0;
        }
        return resultMax;
    }
    */


    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> resultMax = new ArrayList<>();

        for (int index1 = 0; index1 <= (arr.size() - k); index1++) {
            resultMax.add(findDistinctElement(arr, index1, (index1 + k - 1)));
        }

        return resultMax;
    }

    private static int findDistinctElement(ArrayList<Integer> arr, int startIndex, int endIndex) {
        int distinctVale = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = startIndex; i <= endIndex; i++) {
            int num = arr.get(i);
            set.add(num);
        }
        return set.size();
    }

    public static List<Integer> maximumInAllSubarraysOfSizeKBrutt(int[] arr, int n, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n - k; i++) {
            list.add(findMaxVal(arr, i, i + k));
        }

        return list;
    }

    private static int findMaxVal(int[] arr, int startIndex, int endIndex) {
        int max = Integer.MIN_VALUE;
        for (int i = startIndex; i < endIndex; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static List<Integer> maximumInAllSubarraysOfSizeK(int[] arr, int n, int k) {
        List<Integer> ans = new ArrayList<Integer>();
        Deque<Integer> dq = new LinkedList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            // Remove elements that are out of the current window
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // Remove elements smaller than the current element from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add the current element to the back
            dq.offerLast(i);

            // Add the maximum element of the current window to the result list
            if (i >= k - 1) {
                ans.add(arr[dq.peekFirst()]);
            }
        }
        return ans;
    }

    public static List<Integer> maximumInAllSubarraysOfSizeK2(int[] arr, int n, int k) {

        // Declare an empty array to store maximum of all k sized subarrays
        List<Integer> answer = new ArrayList<>();

        // Generate all subarrays of size k using two nested loops
        for (int i = 0; i < n - k + 1; i++) {

            // currentMax denotes current maximum element in subarray
            int currentMax = arr[i];
            for (int j = i; j < i + k; j++) {
                currentMax = Math.max(currentMax, arr[j]);
            }

            // Add current maximum of this subarray to answer
            answer.add(currentMax);
        }

        // Return the answer
        return answer;
    }
}
