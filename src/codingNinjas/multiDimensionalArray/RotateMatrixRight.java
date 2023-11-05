package codingNinjas.multiDimensionalArray;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-10-12,Oct,2023
 * in Project: DataStructuresJavaCode
 */
import java.util.Arrays;

public class RotateMatrixRight {

    // Main method
    public static void main(String[] args) {
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int[][] rotatedMatrix = rotateMatRight(arr2, arr2.length, arr2[0].length, 2);

        for (int[] row : rotatedMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
        // Base condition
        if (mat.length < 0 || k == 0) {
            return mat;
        }

        // Iterating k times to rotate matrix k times
        while (k != 0) {
            transposeMatrix(mat);
            reverseMatrix(mat);
            k--;
        }
        return mat;
    }

    // Transpose matrix
    public static void transposeMatrix(int[][] matrix) {
        int[][] temp = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) 

        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(temp[i], 0, matrix[i], 0, matrix[0].length);
        }
    }

    // Reverse 1D array of the matrix
    public static void reverseMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int leftInd = 0;
            int rightInd = matrix[i].length - 1;

            while (leftInd < rightInd) {
                int tempVar = matrix[i][leftInd];
                matrix[i][leftInd] = matrix[i][rightInd];
                matrix[i][rightInd] = tempVar;
                leftInd++;
                rightInd--;
            }
        }
    }
}
