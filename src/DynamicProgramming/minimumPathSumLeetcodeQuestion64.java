package DynamicProgramming;

/**
 * @author Gyanendra Yadav
 * @created 18/01/2022- 12:32 AM
 * @project DataStructuresJavaCode
 */
public class minimumPathSumLeetcodeQuestion64 {
    public static void main(String[] args) {
        int [][]gridArray={{ 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 }};
        System.out.println(findMinimumPathSum(gridArray,0,0));
    }

    private static int findMinimumPathSum(int[][] grid, int cr, int cc) {

        if (cc >= grid[0].length || cr >= grid.length) {
            return Integer.MAX_VALUE;
        }
        if (cr == grid.length - 1 && cc == grid[0].length - 1) {
            return grid[cr][cc];

        }

        int right = findMinimumPathSum(grid, cr, cc + 1);
        int down = findMinimumPathSum(grid, cr + 1, cc);
        return  (Math.min(right, down) + grid[cr][cc]);
    }
}
