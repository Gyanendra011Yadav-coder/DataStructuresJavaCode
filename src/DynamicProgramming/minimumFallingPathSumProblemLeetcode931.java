package DynamicProgramming;

/**
 * @author Gyanendra Yadav
 * @created 18/01/2022- 11:45 PM
 * @project DataStructuresJavaCode
 */

/**
 * Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
 * Output: 13
 * Explanation: There are two falling paths with a minimum sum as shown.
 */
public class minimumFallingPathSumProblemLeetcode931 {
    public static void main(String[] args) {
        int [][]grid= {{2,1,3},{6,5,4},{7,8,9}};
        //this variable will be helping the to find out the Final Answer
        int overallAnswer=Integer.MAX_VALUE;
        //this loop will be one by one passing all the values of Row[0]
        for (int i = 0; i < grid.length; i++) {
                int temporaryAnswer=findMinimumNumberPath(grid,0,i);
                overallAnswer=Math.min(overallAnswer,temporaryAnswer);
        }
        //Returning the Final Output
        System.out.println(overallAnswer);
    }

    private static int findMinimumNumberPath(int[][] grid, int currentRow, int currentColumn){
        //this is the base that will deal if column gets out then it will Max_Value
        if(currentColumn<0 || currentColumn>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        //this will return if pointer reaches at the end of the row then it will return the value of the last row
        if(currentRow==grid.length-1){
            return grid[currentRow][currentColumn];
        }
        //Now, we will move according to the conditions provided in questions that are
        /***
         * (row + 1, col - 1),
         * (row + 1, col), and
         * (row + 1, col + 1).
         */
        int ans2=findMinimumNumberPath(grid, currentRow+1, currentColumn-1);
        int ans3=findMinimumNumberPath(grid,currentRow+1, currentColumn);
        int ans4=findMinimumNumberPath(grid,currentRow+1, currentColumn+1);
        //this will be returning the minimum number of value out of all the three rows
        return Math.min(ans4,Math.min(ans2,ans3))+grid[currentRow][currentColumn];
    }


}
