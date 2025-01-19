package FirstPhaseLearning.LeetcodeTopInterview150;

public class MergeSortedArray88 {
    /*
    https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m+n-1;  //last index

        int [] duplicateArray = new int[m+n];
        while(n>0)
        {
            if(m>0 && nums1[m-1]>nums2[n-1])
            {
                duplicateArray[index] = nums1[m-1];
                m--;
            }
            else
            {
                duplicateArray[index] = nums2[n-1];
                n--;
            }
            index --;
        }
    }

    public static void sort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;

        // Create left and right subarrays
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copy elements to left and right subarrays
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        // Recursively sort left and right subarrays
        sort(left);
        sort(right);

        // Merge the sorted subarrays
        mergeSort(arr, left, right);
    }

    private static void mergeSort(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0;
        int j = 0;
        int k = 0;

        // Merge elements from leftArr and rightArr into arr
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy any remaining elements from leftArr
        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }

        // Copy any remaining elements from rightArr
        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }

}
