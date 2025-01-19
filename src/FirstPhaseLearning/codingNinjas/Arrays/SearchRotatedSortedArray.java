package FirstPhaseLearning.codingNinjas.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-19,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class SearchRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr={-5,-1,2,1,9};
        int[] arr2={2,5,-3,0};
        System.out.println(search2(arr,5));
//        System.out.println(findLargestEle(arr));
    }

    public static int search(int[] arr, int key) {
        int lenArr = arr.length;
        int resultIndex = -1;
        int beginIndex = 0;
        int lastIndex = lenArr;

        int largestEleInd = findLargestEle(arr);

        while (beginIndex <= lastIndex) {
            if (largestEleInd < key) {
//                if (key > arr[lastIndex - 1]) {
//                    beginIndex=0;
//                    lastIndex=largestEleInd-1;
//                } else {
//                    beginIndex=largestEleInd+1;
//                    lastIndex=lastIndex-1;
//                }
            } else if (key == arr[largestEleInd]) {
                resultIndex=largestEleInd;
                break;
            } else {
                break;
            }
        }

        return resultIndex;
    }

    //This is the function to find out the largest elemnent in the array
    public static int findLargestEle(int[] arr) {
            int larEle = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[larEle]){
                larEle=i;
            }
        }
        return larEle;
    }


    public static int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
