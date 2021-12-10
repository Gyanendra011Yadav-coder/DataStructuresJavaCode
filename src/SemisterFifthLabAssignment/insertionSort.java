package SemisterFifthLabAssignment;

/**
 * @author lenovo
 * @created 10/12/2021- 4:32 PM
 * @project DataStructuresJavaCode
 */
public class insertionSort {

    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; ++i) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 6, 0};
        System.out.println("Name:" + "Gyanendra Yadav");
        System.out.println("Roll Number:" + "191500309(61)");
        sort(array);
        printArray(array);
    }
}
