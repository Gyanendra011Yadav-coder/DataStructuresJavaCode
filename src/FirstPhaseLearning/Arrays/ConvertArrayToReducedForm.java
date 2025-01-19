package FirstPhaseLearning.Arrays;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-20,Nov,2022
 * in Project: DataStructuresJavaCode
 ****************************************************************************
 * Given an array with N distinct elements, convert the given array to a form where all elements
 * are in the range from 0 to N-1. The order of elements is the same, i.e., 0 is placed in the place
 * of the smallest element, 1 is placed for the second_smallest element, … N-1 is placed for the
 * largest element.
 * Examples:
 * Input:  arr[] = {10, 40, 20}
 * Output: arr[] = {0, 2, 1} // Need to insert the index value of elements of the current array
 ****************************************************************************
 */
public class ConvertArrayToReducedForm {
// Method that will solve this problem
    static void convert(int[] arr, int n) {
        // code here
        int temp=0;
        //Creating copy of the array
        int []sortedArray= Arrays.copyOf(arr, n);
        //SOrtying the array
        Arrays.sort(sortedArray);
        //Iterating through the array
        for (int i = 0; i <sortedArray.length ; i++) {
            arr[i] = Arrays.binarySearch(sortedArray,arr[i]);
        }
//            int tempIndex = 0;
//            while(sortedArray[tempIndex]!=arr[tempIndex]){
//                tempIndex++;
//            }
//            arr[tempIndex] =temp;
//            temp++; //Increasing the index
//        }
        for(int element : arr){
            System.out.println(element);
        }
    }

    //main method
    public static void main(String[] args) {
        int arr[] = {10, 40, 20};
        convert(arr, arr.length);
    }
}
