package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By: gyanendra_yadav
 * on 2022-10-17,Oct,2022
 */
public class ReplaceEveryElementLeastGreaterElementRight {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int origArrayLength = arr.length;
        for (int i = 0; i < origArrayLength-1; i++) {
            int beginElement = arr[i];
            int[] sortedArray = partSort(arr, arr.length, i + 1, arr.length-1);
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] > beginElement && j != sortedArray.length - 1) {
                    result.set(i+1, sortedArray[j]);
                    break;
                }
                if (j == sortedArray.length - 1) {
                    if (sortedArray[sortedArray.length - 1] > beginElement) {
                        result.set(i+1,sortedArray[sortedArray.length - 1]);
                    } else {
                        result.set( i+1,-1);
                    }
                }
            }
        }
        return result;
    }

    static int[] partSort(int[] arr, int N, int a, int b) {
        int l = Math.min(a, b);
        int r = Math.max(a, b);
        Arrays.sort(arr, l, r + 1);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 9, 1, 3, 2};
        ArrayList<Integer> result = findLeastGreater(arr.length, arr);
        for (int e:result) {
            System.out.println(e);
        }
//        Arrays.stream(result).forEach(i -> System.out.println(result));
    }
}
