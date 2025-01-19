package FirstPhaseLearning.Arrays;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-13,Nov,2022
 * in Project: DataStructuresJavaCode
 *
 *  int getMinDiff(int[] arr, int n, int k) {
 *
 *         if(n==1)return 0;
 *         FirstPhaseLearning.Arrays.sort(arr);
 *         int ans = arr[n-1]-arr[0];
 *         int min,max;
 *         for(int i=1;i<n;i++){
 *             if(arr[i]-k<0)continue;
 *             max = Math.max(arr[i-1]+k,arr[n-1]-k);
 *             min = Math.min(arr[i]-k,arr[0]+k);
 *             ans = Math.min(ans,max-min);
 *         }
 *         return ans;
 *     }
 */
public class MinimizeTheHeightsI {
    public static void main(String[] args) {
//        int K = 2, N = 4;
//        int Arr[] = {1, 5, 8, 10};

        int K = 5;
        int N=10;
        int []Arr={2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        System.out.println(getMinDiff(Arr,N,K));
    }
    //method that will sove this problem
    static int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        for (int i = 0; i <n ; i++) {
            if(arr[i]-k>=0){
                arr[i]=arr[i]-k;
            }else{
                arr[i]+=k;
            }
        }
        Arrays.sort(arr);
        return arr[n-1]-arr[0];
    }
}
