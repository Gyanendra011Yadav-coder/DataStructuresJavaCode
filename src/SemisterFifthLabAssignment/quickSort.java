package SemisterFifthLabAssignment;

/**
 * @author lenovo
 * @created 10/12/2021- 4:38 PM
 * @project DataStructuresJavaCode
 */
public class quickSort {
    public static void sort(int []arr, int low, int high) {
        {
            if (low < high)
            {
                int pi = partition(arr, low, high);
                sort(arr, low, pi - 1);
                sort(arr, pi + 1, high);
            }
        }
    }
        static int partition(int[] arr, int low, int high)
        {
            int pivot = arr[high];
            int i = (low - 1);
            for(int j = low; j <= high - 1; j++)
            {
                if (arr[j] < pivot)
                {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr,i + 1, high);
            return (i + 1);
        }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void swap(int []array,int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 6, 0};
        System.out.println("Name:" + "Gyanendra Yadav");
        System.out.println("Roll Number:" + "191500309(61)");
        sort(array,0, array.length-1);
        printArray(array);
    }
}

