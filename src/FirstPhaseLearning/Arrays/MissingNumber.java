package FirstPhaseLearning.Arrays;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-12-23,Dec,2022
 * in Project: DataStructuresJavaCode
 */
public class MissingNumber {
    static int MissingNumber(int array[], int n) {
        // Your Code Here
        int result=0;
        if(array.length>1) {
            Arrays.sort(array);
            int firstVal = array[0];
            for (int i = 1; i <= array.length; i++) {
                if (array[i] == firstVal + 1) {
                    firstVal = array[i];
                    continue;
                } else {
                    result = firstVal + 1;
                    break;
                }
            }
        }else{
            result=array[0];
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        int A[] = {1,2,3,5};
        System.out.println( MissingNumber(A,N));
    }
}
