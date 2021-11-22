package codingBlocksQuestions;

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
        towerOfHanoi(numberOfRings,source,helper,destination);
    }

    private static void towerOfHanoi(int numberOfDisks, char source, char helper, char destination){
        if (numberOfDisks==1){
            System.out.println("Move"+" "+numberOfDisks+"th disk from"+" T"+source+" to"+" T"+destination);
            return;
        }
        towerOfHanoi(numberOfDisks-1,source,destination,helper);
        System.out.println("Move"+" "+numberOfDisks+"th disk from"+" T"+source+" to"+" T"+destination);
        towerOfHanoi(numberOfDisks-1,helper,source,destination);
    }
}
