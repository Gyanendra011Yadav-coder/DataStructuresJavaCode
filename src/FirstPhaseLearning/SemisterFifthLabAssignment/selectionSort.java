package FirstPhaseLearning.SemisterFifthLabAssignment;

/**
 * @author lenovo
 * @created 10/12/2021- 4:28 PM
 * @project DataStructuresJavaCode
 */
public class selectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int Indedx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[Indedx])
                    Indedx = j;
            int temp = arr[Indedx];
            arr[Indedx] = arr[i];
            arr[i] = temp;
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
