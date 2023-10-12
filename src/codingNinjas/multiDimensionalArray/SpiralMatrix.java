package codingNinjas.multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-10-11,Oct,2023
 * in Project: DataStructuresJavaCode
 */
public class SpiralMatrix {

    public static void main(String[] args) {

    }

    public static List<Integer> spiralPathMatrix(int[][] mat,  int n) {
        // Define ans list to store the result.
        List<Integer> ans = new ArrayList<>();
        int n1 = mat.length; // no. of rows
        int m1 = mat[0].length; // no. of columns
        // Initialize the pointers required for traversal.
        int top = 0, left = 0, bottom = n1 - 1, right = m1 - 1;
        // Loop until all elements are not traversed.
        while (top <= bottom && left <= right) {
            // For moving left to right
            for (int i = left; i <= right; i++)
                ans.add(mat[top][i]);
            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
                ans.add(mat[i][right]);
            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(mat[bottom][i]);
                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(mat[i][left]);
                left++;
            }
        }
        return ans;
    }

    public static int findKthElement(int[][] mat, int k) {
        // Define ans list to store the result.
        List<Integer> ans = new ArrayList<>();
        int n1 = mat.length; // no. of rows
        int m1 = mat[0].length; // no. of columns
        // Initialize the pointers required for traversal.
        int top = 0, left = 0, bottom = n1 - 1, right = m1 - 1;
        // Loop until all elements are not traversed.
        while (top <= bottom && left <= right) {
            // For moving left to right
            for (int i = left; i <= right; i++)
                ans.add(mat[top][i]);
            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
                ans.add(mat[i][right]);
            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(mat[bottom][i]);
                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(mat[i][left]);
                left++;
            }
        }
        return ans.get(k);
    }
}
