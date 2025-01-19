package FirstPhaseLearning.codingNinjas.problemOfTheDay;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-19,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class MinimumDifferenceArray {
    public static void main(String[] args) {
        int [] arr={-9, -5, -2, -1, 0};
        System.out.println(minDiff(arr.length,arr));
    }

    static int minDiff(int n, int[] arr) {
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(diff>(arr[j]-arr[i])){
                    diff=arr[j]-arr[i];
                }
            }
        }
        return diff;
    }
}
