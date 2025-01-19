package FirstPhaseLearning.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gyanendra Yadav
 * @created 22/01/2022- 2:54 PM
 * @project DataStructuresJavaCode
 */
public class goldMineProblem {
    public static void main(String[] args) {
        Scanner scannerObject =new Scanner(System.in);
        int testCase= scannerObject.nextInt();
        while(testCase!=0) {
            int numberRows = scannerObject.nextInt();
            int numberColumns = scannerObject.nextInt();
            int[][] mine = new int[numberRows][numberColumns];
            for (int i = 0; i < numberRows; i++) {
                for (int j = 0; j < numberColumns; j++) {
                    mine[i][j] = scannerObject.nextInt();
                }
            }
            System.out.println(maximumGoldDig(mine, numberRows, numberColumns));
            testCase--;
        }
    }
/*
    private static int maximumGoldDig(int[][] mine, int i, int j) {
        //Base case that will handle Rows case
        if (i>=mine.length || i<0 || j>=mine[0].length){
            return 0;
        }
        //Base-Case 2nd that will handle the case of Column
        if(j==mine[0].length-1){
            return mine[i][j];
        }

        return 0;
    }

 */
    private static int maximumGoldDig(int [][]mine , int rows, int columns){
        //Array to store the Maximum number of gold can be obtained using each row
        int [][]gold= new int[rows][columns];
        //filling the array putting 0's
        for(int []array:gold){
            Arrays.fill(array,0);
        }
        //start Diging mine from last column of the mine
        for (int column = columns-1; column >=0; column--) {
            //and going top to bottom in row wise
            for (int row=0; row<rows; row++){
                //traversing right straight to the current cell
                int right=(column==columns-1)?0:gold[row][column+1];
                //traversing top diagonally to the current cell
                int right_top=(row==0 || column==columns-1)?0:gold[row-1][column+1];
                //traversing bottom side diagonally of current cell
                int right_bottom=(row==rows-1 || column==columns-1)?0:gold[row+1][column+1];
                //filling the total gold obtained from the current cell
                gold[row][column]=mine[row][column]+Math.max(right,Math.max(right_top,right_bottom));
            }
        }
        //variable to store the maxGold obtained
        int ans=0;
        //this loop will be printing max value after comparing all the values
        for (int i = 0; i <rows ; i++) {
            ans=Math.max(ans,gold[i][0]);
        }
        return ans;
    }

}
