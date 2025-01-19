package FirstPhaseLearning.GeeksForGeeks.Arrays;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-05-23,May,2023
 * in Project: DataStructuresJavaCode
 */
public class MediumMinimumNumberJumps {
    public static void main(String[] args) {
        int []jumpArr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int []arr2={1, 4, 3, 2, 6, 7};
        int []arr3={2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        System.out.println(minJumps(arr3));
    }

    static int minJumps(int[] arr){
        System.out.println("Got length as"+arr.length);
        return jumpCalculatorRecur(arr, arr.length, 0, 0);
    }

    static int jumpCalculatorRecur(int[]arr, int lenghtArr, int index, int count){

        System.out.println("Processing for index"+index+"Count:"+count);
        if(index>=lenghtArr-1 ){
            return count;
        }

        count++;
        return jumpCalculatorRecur(arr, arr.length, index+arr[index], count);
    }

    static int minJumps2(int[] arr){
        if(arr.length<=1) return 0;
        int[] dp=new int[arr.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        for(int i=arr.length-2;i>=0;i--){
            for(int j=1;j<=arr[i];j++){
                int res=(i+j>=arr.length-1)?0:dp[i+j];
                dp[i]=Math.min(dp[i],res!=Integer.MAX_VALUE?res+1:res);
            }
        }
        return dp[0]==Integer.MAX_VALUE?-1:dp[0];
    }

    static int minJumps3(int[] arr) {

        int count = 0;
        int step = 0;
        int res = 0;
        if (arr[0] == 0) return -1;
        for (int i = 0; i < arr.length - 1; i++) {
            res = Math.max(res, arr[i] + i);
            if (step == i) {
                if (arr[i] == 0 && step == res)
                    return -1;
                step = res;
                count++;
            }
        }
        return count;
    }
}
