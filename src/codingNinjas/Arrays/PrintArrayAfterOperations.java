package codingNinjas.Arrays;

import java.util.ArrayList;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-25,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class PrintArrayAfterOperations {

    public static void main(String[] args) {

    }
    public static ArrayList<Integer> printArrayAfterKOperations(ArrayList<Integer> arr, int n, int k) {

            int maxValue=returnMaxArray(arr);
            int minValue=returnMinArray(arr);

            for (int i = 0; i <n ; i++) {
                if(k%2==0) {
                    arr.set(i,(arr.get(i)-minValue));
                }else{
                    arr.set(i,(maxValue-arr.get(i)));
                }

            }
        return arr;
    }

    public static int returnMaxArray(ArrayList<Integer> arr){
        int max = Integer.MIN_VALUE;
        for(int value : arr){
            max=Math.max(value, max);
        }
        return max;
    }

    public static int returnMinArray(ArrayList<Integer> arr){
        int min = Integer.MAX_VALUE;
        for(int value : arr){
            min =Math.min(value, min);
        }
        return min;
    }

}
