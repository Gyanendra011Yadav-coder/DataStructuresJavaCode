package FirstPhaseLearning.codingNinjas.multiDimensionalArray;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-10-07,Oct,2023
 * in Project: DataStructuresJavaCode
 */
public class MatrixFlipBit {
    public static void main(String[] args) {
        int[][] arr2 = {{1, 0, 1}, {1, 1, 0}, {1, 1, 1}};
        System.out.println(countFlip(arr2));


    }


    // method to solve
    public static int countFlip(int[][] mat) {
        int counter = 0;

        //Iterating over rows
        for (int rowInd = 0; rowInd < mat.length; rowInd++) {
            //Iterating over Columns
            for (int colmInd = 0; colmInd < mat[0].length; colmInd++) {
                if (mat[rowInd][colmInd] == 0) {

                    // Iterating on the whole row to count 1s in Row
                    for (int i = 0; i < mat.length; i++) {
                        if ((mat[rowInd][i]) == 1) {
                            counter++;
                            mat[rowInd][i] = -1;
                        }
                    }

                    // Iterating on the whole column to count 1s in Column
                    for (int i = 0; i < mat[0].length; i++) {
                        if ((mat[i][colmInd]) == 1) {
                            counter++;
                            mat[i][colmInd] = -1;
                        }
                    }
                }

            }
        }
        return counter;
    }

//        public static int countFlip2 ( int[][] mat){
//            // Write your code here.
//            int count = 0;
//            int size = mat.length;
//
//            for (int row = 0; row < size; row++) {
//                for (int col = 0; col < size; col++) {
//                    if (mat[row][col] == 0) {
//                        // Row check loop
//                        for (int a = 0; a < size; a++) {
//                            if (mat[row][a] == 1) {
//                                count++;
//                                mat[row][a] = -1;
//                            }
//                        }
//
//                        // Column check loop
//                        for (int b = 0; b < size; b++) {
//                            if (mat[b][col] == 1) {
//                                count++;
//                                mat[b][col] = -1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            return count;
//        }
}
