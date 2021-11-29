package codingBlocksQuestions;

import java.util.Scanner;

public class nQueenProblem {
    static int count;
    private static boolean queenPlace(int[][] chess, int currentRow, int currrentColumn, int n) {
        for(int row = 0; row< currentRow; row++) {
            if(chess[row][currrentColumn] == 1) {
                return false;
            }
        }
        int row = currentRow;
        int col = currrentColumn;
        while(row>=0&&col>=0) {
            if(chess[row][col]==1) {
                return false;
            }
            row--;
            col--;
        }
        row = currentRow;
        col = currrentColumn;
        while(row>= 0&&col<n) {
            if(chess[row][col]==1) {
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
    private static void count(int [][] chess, int currentRow, int numberQueens) {
        if(currentRow == numberQueens) {
            count++;
            return;
        }
        for(int cc = 0; cc< numberQueens; cc++) {
            if(queenPlace(chess, currentRow,cc, numberQueens)) {
                chess[currentRow][cc]=1;//queen placed
                count(chess, currentRow +1, numberQueens);
                chess[currentRow][cc]=0;
            }
        }
        return;
    }
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int numberQueens = scn.nextInt();
        int board[][] = new int[numberQueens][numberQueens];
        count(board,0, numberQueens);
        System.out.println(count);
    }

}
