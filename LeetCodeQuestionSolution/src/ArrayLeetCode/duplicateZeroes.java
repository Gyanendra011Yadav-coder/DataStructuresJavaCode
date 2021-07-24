package ArrayLeetCode;
/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 *
 * Do the above modifications to the input array in place, do not return anything from your function.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 */

public class duplicateZeroes {
    public static void duplicateZeros(int[] arr) {
        /*THIS, ARRAY WILL BE RUNNING FROM 0 TO THE LENGTH OF THE array*/
        for (int i = 0; i < arr.length; i++) {
            /*CHECKING WHEATHER ELEMENT IS EQUAL TO 0 OR NOT*/
            if (arr[i] == 0) {
                /*RUNNING IT FROM THE END, TO SHIFT THE ELEMENTS */
                for (int j = arr.length-1; j>i; j--) {
                   arr[j-1]=arr[j];     // WE ARE SWIPING THE ELMENT FROM BEFORE
                }
                i++;
            }
        }
    }
    /*HERE, ALSO THERE IS NO NEED TO SPECIFY THE MAIN CLASS */
}
