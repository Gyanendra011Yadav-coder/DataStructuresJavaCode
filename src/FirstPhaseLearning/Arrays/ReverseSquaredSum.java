package FirstPhaseLearning.Arrays;

import java.util.Scanner;

/**
 * Created By:  Gyanendra_Yadv
 * on 2022-11-08,Nov,2022
 *
 * Reena had been given an array arr[] of positive integers of size N.Help her to find the value A.
 * A = arr[n]*arr[n] - arr[n-1]*arr[n-1] + arr[n-2]*arr[n-2] - ......... upto index 1
 *
 * 3
 * 1 2 3
 * o/p>> 6
 */



public class ReverseSquaredSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int sizeOfArray = sc.nextInt();
            int[] array = new int[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println(findReverseSquaredSum(array,array.length));
            testCases--;
        }
    }

//
//    public static void main(String[] args) {
//        int []array={4,8,1,2};
//        System.out.println(findReverseSquaredSum(array,array.length));
//    }
    private static int findReverseSquaredSum(int[] array, int length) {
        int indexIncrease=0;
        int result=0;
        for(int i=length-1; i>=0 ; i--) {
            if(indexIncrease%2==0){
                result+=array[i]*array[i];
                indexIncrease++;
            }else{
                result-=array[i]*array[i];
                indexIncrease++;
            }
        }
        return result;
    }
}
