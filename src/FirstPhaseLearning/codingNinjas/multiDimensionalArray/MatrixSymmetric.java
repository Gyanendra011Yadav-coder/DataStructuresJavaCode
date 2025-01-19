package FirstPhaseLearning.codingNinjas.multiDimensionalArray;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-10-06,Oct,2023
 * in Project: DataStructuresJavaCode
 */
public class MatrixSymmetric {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {3, 4, 9}, {6, 7, 10}};
        int[][] arr2 = {{1, 2, 3}, {2, 4, 5}, {3, 5, 8}};
        System.out.println(isMatrixSymmetric(arr2));
    }

    public static boolean isMatrixSymmetric(int[][] matrix) {
        // result boolean
        boolean result = false;

        if (matrix.length == 0) {
            return result;
        }
        // Generating transpose of current matrix
        int[][] transMatrix = transpose(matrix);
        if (transMatrix.length != matrix.length) {
            return result;
        }

        for (int rowInd = 0; rowInd < matrix.length; rowInd++) {
            for (int colmInd = 0; colmInd < matrix[0].length; colmInd++) {
                if (matrix[rowInd][colmInd] != transMatrix[rowInd][colmInd]) {
                    return false;
                }

                if (matrix[rowInd][colmInd] == transMatrix[rowInd][colmInd]) {
                    result = true;
                }
            }
        }

        return result;
    }

    // Finds transpose of multiMatrix[][]
    static int[][] transpose(int multiMatrix[][]) {
        int rows = multiMatrix.length;
        int cols = multiMatrix[0].length;

        int[][] transposeMatrix = new int[cols][rows]; // Create a new array for transpose

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = multiMatrix[i][j]; // Transpose the elements
            }
        }
        return transposeMatrix;
    }

}
