package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-12,Jul,2023
 * in Project: DataStructuresJavaCode
 *
 * https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118820/offering/1381881
 */
public class CountSmallerEqualElementsArray {

    public static void main(String[] args) {
        int []arr1={5 ,4 ,3 ,2,1};
        int []arr2={3 ,4};
        List<Integer> result=countSmallerOrEqual2(arr1, arr2,arr1.length, arr2.length);
        for (int val:result) {
            System.out.println(val+" ");
        }
    }

    public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m) {
        // Write your code here!


        List<Integer> result = new ArrayList<Integer>();
        int listIndex = 0;

        for (int index = 0; index <n ; index++) {
            int valArr1=a[index];
            int maxValCounter=0;
            for (int index2 = 0; index2 <m ; index2++) {
                int valArr2=b[index2];
                if(valArr1>=valArr2){
                    maxValCounter++;
                }
            }
            result.add(maxValCounter);
        }
        return result;
    }

    public static List<Integer> countSmallerOrEqual2(int[] a, int[] b, int n, int m) {
        List<Integer> result = new ArrayList<Integer>();
        //Creating copy of second array and sorting it
        int[] sortedB = Arrays.copyOf(b, m);
        Arrays.sort(sortedB);

        for (int i = 0; i < n; i++) {
            int count = binarySearch(sortedB, a[i]); //Using BinarySearch, that will be traversing half array
            result.add(count);
        }
        return result;
    }
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                count = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return count;
    }
}
