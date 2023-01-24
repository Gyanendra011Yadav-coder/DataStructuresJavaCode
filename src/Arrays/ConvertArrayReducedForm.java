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

        for(int ele:arr) {
            System.out.print(ele+" ");
        }

    }
    //Method to convert
    static void convert(int[] arr, int n) {
        //Making the duplicate copy the code
        int[] duplicateArray =  Arrays.copyOf(arr, arr.length);;

        //Sorting the array
        Arrays.sort(duplicateArray);
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=findIndex(duplicateArray, arr[i]);
        }
    }

    // Function to find the index of an element
    public static int findIndex(int arr[], int t)
    {
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }
}
