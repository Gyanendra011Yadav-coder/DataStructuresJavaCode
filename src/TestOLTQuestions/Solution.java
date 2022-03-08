package TestOLTQuestions;

public class Solution {

    static int[] performOperations(int a[], int n, int k) {
        int[] result = new int[a.length];
        while (k > 0) {
            //step 1 is find max
            int maxNum = findMax(a);
            for (int q = 0; q < a.length; q++) {
                result[q] = maxNum - a[q];
            }
            for (int p = 0; p < a.length; p++) {
                a[p] = result[p];
            }
            k--;
        }
        return a;
    }


    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3};
        performOperations(arr, 4, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

