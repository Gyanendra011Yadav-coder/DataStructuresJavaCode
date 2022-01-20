package DynamicProgramming;

import java.util.Arrays;

/**
 * @author Gyanendra Yadav
 * @created 19/01/2022- 1:44 AM
 * @project DataStructuresJavaCode
 */

/*
*Leetcode examples to solve this problem
* Input: arr = [[1,2,3],[4,5,6],[7,8,9]]
* Output: 13
*
*2:
* Input: grid = [[7]]
* Output: 7
 */
public class minimumFallingPathSum2LeetcodeProblemNumber1289 {
    public static void main(String[] args) {
        int [][]grid= {{1,2,3},{4,5,6},{7,8,9}};
        int overallAnswer=Integer.MAX_VALUE;
        int [][]dp= new int [grid.length][grid[0].length];
        for(int []array : dp){
            Arrays.fill(array,Integer.MAX_VALUE);
        }
        for (int i = 0; i <grid.length ; i++) {
            int tempAns=pathSum(grid,0,i,dp );
            overallAnswer=Math.min(overallAnswer,tempAns);
        }
        System.out.println(overallAnswer);
    }

    private static int findMinimumPathSum(int[][] grid, int currentRow, int currentColumn, int [][]dynamicProgramming) {
        //Base Case one that will be taking care of Rows
        if(currentRow==grid.length-1){
            return grid[currentRow][currentColumn];
        }
        if(dynamicProgramming[currentRow][currentColumn]!=Integer.MAX_VALUE){
            return dynamicProgramming[currentRow][currentColumn];
        }
       int answer=Integer.MAX_VALUE;
        for (int i = 0; i<grid[0].length; i++) {
            if(i!=currentColumn){
                int tempAnswer=findMinimumPathSum(grid, currentRow+1, currentColumn,dynamicProgramming );
                answer=Math.min(answer,tempAnswer);
            }
        }
        return dynamicProgramming[currentRow][currentColumn]=answer+grid[currentRow][currentColumn];
    }
    public static int pathSum(int[][] grid, int cr, int cc, int[][] dp) {
        //this is the base case that we are handling .i.e.if Row Reaches at the end Row then we need to return it
        if(cr==grid.length-1) {
            return grid[cr][cc];
        }
        //THIS, WE ARE GETTING ANSWER FROM DP,IF IT EXISTS THEN IT WILL RETURN ELSE WE WILL CALCUKATE IT AT NEXT STEP
        if(dp[cr][cc]!=Integer.MAX_VALUE) {
            return dp[cr][cc];
        }
// NOW, WE WILL BE FINDING THER ANSWER BY KEEPING IN MIND IS, TWO CELLS MUST NOT BE IN SAME COLUMN
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < grid[0].length; j++) {
            if (j != cc) {

                int res = pathSum(grid, cr + 1, j, dp);
                ans = Math.min(ans, res);
            }
        }

        return dp[cr][cc]=ans + grid[cr][cc];
    }
}
