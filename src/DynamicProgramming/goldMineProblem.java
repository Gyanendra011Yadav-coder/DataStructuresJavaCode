package DynamicProgramming;

import java.util.Scanner;

/**
 * @author Gyanendra Yadav
 * @created 22/01/2022- 2:54 PM
 * @project DataStructuresJavaCode
 */
public class goldMineProblem {
    public static void main(String[] args) {
        Scanner scannerObject =new Scanner(System.in);
        int numberRows=scannerObject.nextInt();
        int numberColumns=scannerObject.nextInt();
        int [][]mine=new int [numberRows][numberColumns];
        for (int i = 0; i <numberRows ; i++) {
            for (int j = 0; j < numberColumns; j++) {
                mine[i][j]=scannerObject.nextInt();
            }
        }
        System.out.println(maximumGoldDig(mine, 0,0));

    }

    private static int maximumGoldDig(int[][] mine, int i, int j) {

        return 0;
    }

}
