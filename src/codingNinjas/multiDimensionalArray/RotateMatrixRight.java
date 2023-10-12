package codingNinjas.multiDimensionalArray;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-10-12,Oct,2023
 * in Project: DataStructuresJavaCode
 */
public class RotateMatrixRight {

    //Main method
    public static void main(String[] args) {
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Arrays.stream(rotateMatRight(arr2, arr2.length, arr2[0].length, 2)).forEach(System.out::println);
    }

    public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
        // base conditon
        if(mat.length<0 || k==0){
            return mat;
        }

        // Iterating k times to rotate matrix k times
        while (k!=0) {
            transposeMatrix(mat);
            reverseMatrix(mat);
            k--;
        }
        return mat;
    }

    // Transpose matrix
    public static void transposeMatrix(int [][]matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    //Reverse 1d array of the matrix
    public static void reverseMatrix(int [][]matrix){

        for (int i = 0; i < matrix.length; i++) {
            int leftInd=0;
            int rightInd=matrix[i].length-1;

            while (leftInd<rightInd){
                int temp=matrix[leftInd][rightInd];

                int tempVar=matrix[i][leftInd];
                matrix[i][leftInd]=matrix[i][rightInd];
                matrix[i][leftInd]=temp;

                leftInd++;
                rightInd--;
            }
        }
    }
}
