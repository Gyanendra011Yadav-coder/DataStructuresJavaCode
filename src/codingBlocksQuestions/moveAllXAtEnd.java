package codingBlocksQuestions;

import java.util.Scanner;

/**
 * Take as input str, a string. Write a recursive function which moves all ‘x’ from the string to its end.
 * E.g. for “abexexdexed” return “abeedeedxxx”.
 * Print the value returned
 */

public class moveAllXAtEnd {




    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String str=scannerObject.nextLine();

        MoveX(str,0);
    }

    private static void MoveX(String str, int startingIndex) {
        int lenString=str.length();

    }
}
