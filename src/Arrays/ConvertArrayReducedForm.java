package Arrays;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-24,Jan,2023
 * in Project: DataStructuresJavaCode
 */
public class ConvertArrayReducedForm {

    //main method
    public static void main(String[] args) {
        int arr[] = {10, 40, 20};
        convert(arr, arr.length);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    //Method to convert
    static void convert(int[] arr, int n) {
        //Making the duplicate copy the code

        /*
        In the code provided, the line "int[] duplicateArray = arr;" creates a reference to the same array in memory as the original array "arr". It does not create a new copy of the array. Therefore, when the Arrays.sort() method is called on "duplicateArray", it sorts the same array in memory that "arr" references.

This means that the original array "arr" is also getting sorted and the duplicateArray is also pointing to the same location in the memory. So, the duplicateArray and arr both will be sorted.

If you want to sort the duplicateArray separately, you should use the Arrays.copyOf() function to create a new copy of the array.
For example, int[] duplicateArray = Arrays.copyOf(arr, arr.length);

This will create a new copy of the original array, so sorting the duplicateArray will not affect the original array.
         */
        int[] duplicateArray = Arrays.copyOf(arr, arr.length);
        ;

        //Sorting the array
        Arrays.sort(duplicateArray);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = findIndex(duplicateArray, arr[i]);
        }
    }

    // Function to find the index of an element
    public static int findIndex(int arr[], int t) {
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }
}
