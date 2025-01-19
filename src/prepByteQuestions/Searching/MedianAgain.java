package FirstPhaseLearning.Searching;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-14,Mar,2023
 * in Project: DataStructuresJavaCode
 */
public class MedianAgain {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int lenArr=scanner.nextInt();
        int maxIncr=scanner.nextInt();
        int array[] =new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println(findMaxMedian(array,maxIncr,lenArr));
    }

    private static int findMaxMedian(int[] array, int maxIncr, int arrLen) {
        int result=0;
        Arrays.sort(array);
        int midEle=array[(int) Math.floor(arrLen/2)];
        for (int i = 0; i <maxIncr ; i++) {
            midEle+=1;
        }
        return midEle;
    }
}
