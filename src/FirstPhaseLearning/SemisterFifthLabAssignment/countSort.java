package FirstPhaseLearning.SemisterFifthLabAssignment;

import java.util.Arrays;
/**
 * @author lenovo
 * @created 10/12/2021- 5:01 PM
 * @project DataStructuresJavaCode
 */
public class countSort {
    static void countSort(int[] arr)
    {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args)
    {
        System.out.println("Name:" + "Gyanendra Yadav");
        System.out.println("Roll Number:" + "191500309(61)");
        int[] arr = { -5, -10, 0, -3, 8, 5, -1, 10 };
        countSort(arr);
        printArray(arr);
    }
}

