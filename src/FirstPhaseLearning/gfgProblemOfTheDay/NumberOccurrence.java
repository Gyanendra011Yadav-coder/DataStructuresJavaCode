package FirstPhaseLearning.gfgProblemOfTheDay;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-20,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class NumberOccurrence {
    int count(int[] arr, int n, int x) {
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
}
