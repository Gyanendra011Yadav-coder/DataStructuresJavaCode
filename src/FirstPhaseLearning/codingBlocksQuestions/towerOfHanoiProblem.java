package FirstPhaseLearning.codingBlocksQuestions;

import java.util.Scanner;

/**
 * Google Tower of Hanoi.
 *
 * Using a helper stick (peg), shift all rings from peg A to peg B using peg C. All rings are initally placed in ascending order, smallest being on top.
 *
 * No bigger ring can be placed over a smaller ring.
 *
 * a. Write a recursive function which prints the steps required to solve the tower of Hanoi problem for N discs.
 *
 * b. Write a recursive function which returns number of steps required to solve the tower of Hanoi problem for N discs.
 *
 * Let T1 be the Source Tower, T2 be the Destination Tower and T3 be the Auxillary Tower.
 *
 * Required O/P in the Format of :-Move 1th disc from T1 to T3
 */

public class towerOfHanoiProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numberOfRings=sc.nextInt();
        char source ='1';
        char helper ='2';
        char destination='3';
        towerOfHanoi2(numberOfRings,source,helper,destination);
        int res = (int)Math.pow(2,numberOfRings);
        System.out.println(res-1);
    }

    private static void towerOfHanoi(int numberOfDisks, char source, char helper, char destination){
        if (numberOfDisks==1){
            System.out.println("Move"+" "+numberOfDisks+"th disk from"+" T"+source+" to"+" T"+destination);
            return;
        }
        towerOfHanoi(numberOfDisks-1,source,destination,helper);
        System.out.println("Move"+" "+numberOfDisks+"th disk from"+" T"+source+" to"+" T"+destination);
        towerOfHanoi(numberOfDisks-1,helper,source,destination);
        System.out.println();
    }

    /**
     * Second Test-Case
     *
     * Sample Input
     * 2
     * Sample Output
     * Move 1th disc from T1 to T3
     * Move 2th disc from T1 to T2
     * Move 1th disc from T3 to T2
     * 3
     */

    private static void towerOfHanoi2(int numberOfDisks, char source, char helper, char destination){
        if (numberOfDisks==1){
            System.out.println("Move"+" "+numberOfDisks+"th disk from"+" T"+source+" to"+" T"+destination);
            return;
        }
        towerOfHanoi2(numberOfDisks-1,source,helper,destination);
        System.out.println("Move"+" "+numberOfDisks+"th disk from"+" T"+source+" to"+" T"+helper);
        towerOfHanoi2(numberOfDisks-1,destination,source,helper);
        System.out.println(numberOfDisks+1);
    }
}
