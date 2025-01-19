package FirstPhaseLearning.codingNinjas.Contests.WeeklyContest84;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-30,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class optimalDivision {

    public static void main(String[] args) {

    }

    static long optimalDivision(int m, int []a) {
        //base case
        if(a.length==1){
            return (long) a[0];
        }
        return 567890;
    }


    public static int bitwiseOrOfArray(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result |= num; // Perform bitwise OR with the current number
        }
        return result;
    }
}
