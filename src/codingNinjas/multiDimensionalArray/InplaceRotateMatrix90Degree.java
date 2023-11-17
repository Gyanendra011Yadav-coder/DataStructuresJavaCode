package codingNinjas.multiDimensionalArray;

public class InplaceRotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        inplaceRotate(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // first we will be reversing each row of the matrix then we will we perform the transpose of the matrix
    public static void inplaceRotate(int[][] arr, int n) {
        // perform the reversing of rows
        reverseMatrix(arr, n);
        // perform the transpose matrix
        transposeMatrix(arr, n);
    }

    // Method to find transpose of the matrix
    private static void transposeMatrix(int[][] arr, int n) {
        // Reverse the rows
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int temp= arr[i][j];
                System.out.println("temp = " + temp);
                arr[i][j] = arr[rows - 1 - i][j];
                System.out.println("arr[i][j] = " + arr[i][j]);
                arr[rows - 1 - i][j]=temp;
                System.out.println("arr[rows - 1 - i][j]"+arr[rows - 1 - i][j]);
            }
        }
    }

    // Method to reverse the matrix
    private static void reverseMatrix(int[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
