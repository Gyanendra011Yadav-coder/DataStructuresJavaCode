package SemisterFifthLabAssignment;

/**
 * @author lenovo
 * @created 10/12/2021- 4:48 PM
 * @project DataStructuresJavaCode
 */
public class mergeSort {


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 6, 0};
        System.out.println("Name:" + "Gyanendra Yadav");
        System.out.println("Roll Number:" + "191500309(61)");
        mergeSort(array, 0, array.length - 1);
        printArray(array);
    }

    public static void merge(int Arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;while (i <= mid && j <= end) {
            if (Arr[i] <= Arr[j]) {
                temp[k] = Arr[i];
                k += 1;
                i += 1;
            } else {
                temp[k] = Arr[j];
                k += 1;
                j += 1;
            }
        }
        while (i <= mid) {
            temp[k] = Arr[i];
            k += 1;
            i += 1;
        }
        while (j <= end) {
            temp[k] = Arr[j];
            k += 1;
            j += 1;
        }
        for (i = start; i <= end; i += 1) {
            Arr[i] = temp[i - start];
        }
    }

    public static void mergeSort(int Arr[], int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(Arr, start, mid);
            mergeSort(Arr, mid + 1, end);
            merge(Arr, start, mid, end);
        }
    }
}