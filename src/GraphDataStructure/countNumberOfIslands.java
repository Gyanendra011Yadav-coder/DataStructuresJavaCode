package GraphDataStructure;

public class countNumberOfIslands {
    //method that will find out Island
    public int numIslands(char[][] grid) {
        //Taking out number of Rows
        int row=grid.length;
        //Taking out number of columns
        int col=grid[0].length;
        //intilizing the variable that will count number of islands
        int countIslands=0;
        //Boolean array that will keep track of nodes that we have visited in the graph
        boolean [][]visited=new boolean[row][col];
        //Taversing it
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) { 
                if(!visited[i][j] && (grid[i][j] == '1')){
                    //calling th DSA function to count
                    dfs(grid,i,j,visited);
                    countIslands++;

                }
            }
        }
        return countIslands;
    }


    private static void dfs(char[][] grid, int rowNO, int colNo, boolean[][] visited){
        if(rowNO<0 || colNo<0 || rowNO>=grid.length || colNo>=grid[0].length || visited[rowNO][colNo] || grid[rowNO][colNo]=='0'){
            return;
        }
        visited[rowNO][colNo]=true;
        //travse at the left side of the current part of land
        dfs(grid,rowNO,colNo-1,visited);
        //Traverse at the right side of the current part of the land
        dfs(grid,rowNO,colNo+1,visited);
        //Traverse at the top of the current part of the land
        dfs(grid,rowNO-1,colNo,visited);
        //traverse at the bottom side of the current part of the land
        dfs(grid,rowNO+1,colNo,visited);
    }
}
