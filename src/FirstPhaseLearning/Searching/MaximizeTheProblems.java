package FirstPhaseLearning.Searching;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-12,Mar,2023
 * in Project: DataStructuresJavaCode
 * ----------------------------------------------------------------
 * *********Maximize the Problems*****************
 * <p>
 * You are given n� problems numbered 11 to n� where ith��ℎ problem requires 5∗i5∗� time to solve. You are also given an integer k�. You need to solve the maximum number of problems such that the time required to solve them is less than or equal to 240−k240−�.
 * Input:
 * First line contains 22 space separated integer n� and k�.
 * Output:
 * Print a single integer denoting the maximum number of problems solved.
 */
public class MaximizeTheProblems {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int numProblems = scanner.nextInt();
        int timeToReduce = scanner.nextInt();

        int totalTime = 240 - timeToReduce;
        int counter = 0;
        int probTimeCal = 0;
        for (int i = 1; i <= numProblems + 1; i++) {
            if (probTimeCal > totalTime) {
                counter = counter - 1;
                System.out.println(counter);
                break;
            } else {
                probTimeCal += i * 5;
                counter++;
            }
        }
        if (probTimeCal <= totalTime) {
            counter = counter - 1;
            System.out.println(counter);
        }

    }
}
