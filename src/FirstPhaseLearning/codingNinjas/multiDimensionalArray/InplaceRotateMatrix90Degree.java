package FirstPhaseLearning.codingNinjas.multiDimensionalArray;

public class InplaceRotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        reverseColumns(matrix);

        // Print the result
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to reverse each column of the matrix
    private static void reverseColumns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < cols; i++) {
            for (int j = 0, k = rows - 1; j < k; j++, k--) {
                // Swap elements in each column
                int temp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }
    }
}
