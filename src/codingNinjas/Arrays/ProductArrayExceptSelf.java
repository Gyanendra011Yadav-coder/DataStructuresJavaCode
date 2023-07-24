package codingNinjas.Arrays;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-21,Jul,2023
 * in Project: DataStructuresJavaCode
 *
 * 5
 * 1 2 3 4 5
 *
 *
 * 1
 * 0
 *
 *
 * 0
 *
 * 2
 * 5 5
 *
 *
 * 3
 * 0 1 2
 */
public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr={0,1,2};
        int[] result=getProductArrayExceptSelf(arr);
        for (int vale : result) {
            System.out.println(vale +", ");
        }
    }

    public static int[] getProductArrayExceptSelf(int[] arr) {
        //Your code goes here
        int mod= 10^9 + 7;
        int []temp= Arrays.copyOf(arr, arr.length);
        for (int i = 0; i <temp.length ; i++) {
            int tempResult=getProduct(temp,i);
            arr[i]=tempResult%mod;
        }
        return arr;
    }

    public static int getProduct(int[] arr,  int indexToSkip) {
        int result=1;
        for (int i = 0; i < arr.length; i++) {
            if(i!=indexToSkip){
                result*= arr[i];
            }
        }
        return result;
    }

    public static int[] getProductArrayExceptSelf2(int[] arr) {
        int mod = 1000000007;
        int n=arr.length;
        int[] res = new int[n];

        if (n == 0) return res;

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = (res[i - 1] * arr[i - 1]) % mod;
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = (res[i] * right) % mod;
            right = (right * arr[i]) % mod;
        }
        return res;
    }


}
