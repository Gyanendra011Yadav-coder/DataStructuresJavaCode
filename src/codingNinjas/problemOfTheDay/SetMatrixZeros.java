package codingNinjas.problemOfTheDay;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-09-13,Sep,2023
 * in Project: DataStructuresJavaCode
 */
public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 0},
                {3, 4},
                {5, 6},
        };

        setZeros2(array);
    }

    public static void setZeros(int matrix[][]) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    addzeros(matrix, j, j);
                }
            }
        }
    }

    public static void addzeros(int matrix[][], int row, int col) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i==row) {
                    matrix[i][j] = 0;
                }

                if(j==col) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setZeros2(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int col1 = 1;
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) col1 = 0;
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if (col1 == 0)
                matrix[i][0] = 0;
        }
    }
}

