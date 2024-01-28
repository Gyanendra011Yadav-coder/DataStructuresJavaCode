package Searching;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-12,Mar,2023
 * in Project: DataStructuresJavaCode
 */
public class BinaryMatrixHavingMaximumNumber1s {

    //Main Method
    static public void main(String[] args) {
        int matrix[][] = {{0, 0, 1}, {0, 1, 1},{0, 0, 0}};
        int matrix2[][] = {{1, 1, 1}, {1, 1, 1,},{ 0, 0, 0}};

        int[] row = findMaxRow(matrix2, matrix2.length);
        for (int element : row) {
            System.out.println(element);
        }
    }

    //Method to solve the problem
    public static int[] findMaxRow(int mat[][], int N) {
        int[] row = new int[2]; // This will be holding, row number at 0 and Number of 1s at index 1
        int overallMax = 0;
        int currMax = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    currMax++;
                }
            }
            if(currMax>overallMax){
                overallMax=currMax;
                row[0]=i;
                row[1]=overallMax;
            }
            currMax=0;
        }
        return row;
    }
}
