package codingNinjas.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-24,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class NonDecreasingArray {
    public static void main(String[] args) {

    }

    public static boolean isPossible(int[] arr, int n) {
        //Using this count if more than one changes done it's not under rules
        int count = 0;

        //Iterating through 1st index
        for (int i = 1; i < arr.length && count <= 1; i++) {
            if (arr[i-1] > arr[i]) { // If case of ascending order occurs else no need to perform change
                count++;
                if (i-2 < 0 || arr[i-2] <= arr[i]) { // This is the case, when we have provided descending
                    arr[i-1] = arr[i];
                } else { // This is the case of when we have provided ascending array
                    arr[i] = arr[i-1];
                }

                if(count>1){
                    return false;
                }
            }
        }
        return count <= 1;
    }
}
