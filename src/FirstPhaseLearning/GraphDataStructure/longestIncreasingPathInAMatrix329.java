package FirstPhaseLearning.GraphDataStructure;

public class longestIncreasingPathInAMatrix329 {
    int [][]direction={{0,1},{0,-1},{1,0},{-1,0}};

    public int longestIncreasingPath(int[][] matrix) {
        int result=0;
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                result=Math.max(result,dfsTraversal(matrix, row, column, i, j));
            }
        }
        return result;

    }

    public int dfsTraversal(int [][]matrix, int row, int column, int currentRow, int currentColumn) {
        //count max Traversal
        int max = 0;
        for (int[] edge : direction) {
            int updateRow = currentRow + edge[0];
            int updateCol = currentColumn + edge[1];
            if(updateRow>0 && updateCol>0 && updateRow>= currentRow && updateCol >= currentColumn && matrix[updateRow][updateCol]>matrix[currentRow][currentColumn]) {
                max = Math.max(max, dfsTraversal(matrix, row, column, updateRow, updateCol));
            }
        }
        return max + 1;
    }
}
