package FirstPhaseLearning.Arrays;

import java.util.Stack;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-16,Jan,2023
 * in Project: DataStructuresJavaCode
 *
 *
 * Input:
 * n = 4, arr[] = [1 3 2 4]
 * Output:
 * 3 4 4 -1
 * Explanation:
 * In the array, the next larger element
 * to 1 is 3, 3 is 4, 2 is 4 and for 4?
 * since it doesn't exist, it is -1.
 *
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        long arr[] = {6,8,0,1,3};
        long[] resultantArr=nextLargerElement(arr, arr.length);
        for (long val: resultantArr) {
            System.out.println(val);
        }
    }

    public static long[] nextLargerElementOptmized(long[] arr, int n) {
        long[] result = new long[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.empty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.empty() ? -1 : arr[stack.peek()];
            stack.push(i);
        }
        return result;
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        long[] result = new long[n];

        for (int i = 0; i <n ; i++) {
            long greaterElement=-1;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]>arr[i]){
                    greaterElement=arr[j];
                    break;
                }
            }
            result[i]=greaterElement;
        }
        return result;
    }
}
