package prepByteQuestions.Searching;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-12,Mar,2023
 * in Project: DataStructuresJavaCode
 *
 * ------------------------------------------------------
 * Given a rotated array A� and an integer x�, your task is to find the index of x�.
 * Oh! One more thing. Before you start thinking of using linear search let me inform you the array is sorted and rotated.
 *
 *** Input format
 * First line contains an integer T�, number of test cases. Then follows T� test cases. Each test case consists of three lines. The first line contains N�. Second lines contain N� space separated integers and the third line contains an integer x�
 *
 ***Output format
 * Print T� lines, each containing index of x� in A�. Print −1−1 if x� is not present in the array.
 *
 ***Input
 * 3
 * 9 5 6 7 8 9 10 1 2 3
 * 10
 *
 ***Output
 * 5
 * -----------------------------------------------------
 */
public class RotateAndFind {

    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int testCases= scanner.nextInt();
        while (testCases!=0){
            int arrSize= scanner.nextInt();
            int[] array=new int[arrSize];
            for (int i = 0; i <arrSize ; i++) {
                array[i] = scanner.nextInt();
            }
            int searchValue= scanner.nextInt();
            System.out.println(findIndexOfX (array,array.length,searchValue));
            testCases--;
        }
    }

    private static int findIndexOfX(int []array, int lengthArr, int serachVal){
        for (int i = 0; i <lengthArr ; i++) {
            if(array[i] == serachVal){
                return i;
            }
        }
        return -1;
    }
}
