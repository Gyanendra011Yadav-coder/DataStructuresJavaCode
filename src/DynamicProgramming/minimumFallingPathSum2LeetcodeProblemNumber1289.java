package DynamicProgramming;

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
        int [][]grid= {{7}};
        int overallAnswer=Integer.MAX_VALUE;
        int [][]dp= new int [grid.length][grid[0].length];
        for (int i = 0; i <grid.length ; i++) {
            int tempAns=findMinimumPathSum(grid,0,i,dp );
            overallAnswer=Math.min(overallAnswer,tempAns);
        }
        System.out.println(overallAnswer);
    }

    private static int findMinimumPathSum(int[][] grid, int currentRow, int currentColumn, int [][]dynamicProgramming) {
        //Base Case one that will be taking care of Rows
        if(currentRow==grid.length-1){
            return grid[currentRow][currentColumn];
        }
       int answer=Integer.MAX_VALUE;
        for (int i = 0; i<grid[0].length; i++) {
            if(i!=currentColumn){
                int tempAnswer=findMinimumPathSum(grid, currentRow+1, currentColumn,dynamicProgramming );
                answer=Math.min(answer,tempAnswer);
            }
        }
        return answer+grid[currentRow][currentColumn];
    }
}
