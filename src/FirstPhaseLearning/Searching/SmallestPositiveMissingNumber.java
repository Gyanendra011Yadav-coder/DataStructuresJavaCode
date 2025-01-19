package FirstPhaseLearning.Searching;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-11,Mar,2023
 * in Project: DataStructuresJavaCode
 */
public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
        int arr[] = {0,-10,1,3,-20};
        System.out.println(missingNumber(arr, arr.length));
    }

    public static boolean isMissing(int[] arr, int elem) {
        int low = 0, high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == elem) return true;
            else if (arr[mid] > elem) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size) {
        Arrays.sort(arr);
        int i = 1;
        while (true) {
            boolean flag = isMissing(arr, i);
            if (flag == true) i++;
            else break;
        }
        return i;
    }
}
