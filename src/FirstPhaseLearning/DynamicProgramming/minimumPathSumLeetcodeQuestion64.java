package FirstPhaseLearning.DynamicProgramming;

import java.util.Arrays;

/**
 * @author Gyanendra Yadav
 * @created 18/01/2022- 12:32 AM
 * @project DataStructuresJavaCode
 */
public class minimumPathSumLeetcodeQuestion64 {
    public static void main(String[] args) {
        int [][]gridArray={{ 1,2,3 }, { 4, 5, 6 }};

        int [][]dp= new int[gridArray.length][gridArray[0].length];
        for(int []array:dp){
            Arrays.fill(array,-1);
        }
        System.out.println(findMinimumPathSum(gridArray,0,0,dp));
    }

    private static int findMinimumPathSum(int[][] grid, int cr, int cc,int [][]dp) {


        if (cc >= grid[0].length || cr >= grid.length) {
            return Integer.MAX_VALUE;
        }
        if (cr == grid.length - 1 && cc == grid[0].length - 1) {
            return grid[cr][cc];

        }
        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }

        int right = findMinimumPathSum(grid, cr, cc + 1, dp);
        int down = findMinimumPathSum(grid, cr + 1, cc, dp);
        return dp[cr][cc] = (Math.min(right, down) + grid[cr][cc]);

        }
}
