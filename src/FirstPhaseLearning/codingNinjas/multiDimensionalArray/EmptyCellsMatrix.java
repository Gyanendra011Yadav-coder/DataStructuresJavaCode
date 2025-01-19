package FirstPhaseLearning.codingNinjas.multiDimensionalArray;

public class EmptyCellsMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        emptyCells(3,2,matrix);
    }

    public static long[] emptyCells(int n, int k, int[][] tasks) {
        // need to return number of empty cells after each tasks
        long[] results = new long[k];

        // counter to fill results matrix
        int resultsIndex = 0;
        int counter = 0;

        // Need to perform operations for k times, and at the end of each task add empty cells in results tab
        while (k != 0) {

            int row = 0;
            int col = 0;

            // fill cells of ith row and jth column in the tasks matrix
            for (int i = row; i < 1; i++) {
                for (int j = col; col < 1; col++) {

                    // Filling of empty cells of empty ith row
                    tasks[i][j] = 0;

                    // Filling of empty cells of empty jth column
                    if (tasks[0].length <= j) {
                        tasks[j][i] = 0;
                    }
                }
            }

            for (int i = 0; i <tasks.length ; i++) {
                for (int j = 0; j < tasks[0].length; j++) {
                    System.out.println(" matrix[i][j]" + tasks[i][j]);

                    if (tasks[0].length <= j) {
                        System.out.println(" matrix[j][i]" + tasks[j][i]);
                    }
                }
            }

            // count number of empty cells
            for (int i = 0; i < tasks.length; i++) {
                for (int j = 0; j < tasks[0].length; j++) {
                    if (tasks[i][j] != 0) {
                        counter++;
                    }
                }
            }

            // saving results and reinitializing variables
            results[resultsIndex] = counter;
            resultsIndex++;
            counter = 0;
        }
        return results;
    }
}
