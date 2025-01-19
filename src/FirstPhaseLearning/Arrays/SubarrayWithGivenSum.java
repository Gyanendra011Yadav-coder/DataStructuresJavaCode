package FirstPhaseLearning.Arrays;

import java.util.ArrayList;

/**
 * Created By: Gyanendra_Yadav on 2022-09-08,Sep,2022
 */
public class SubarrayWithGivenSum {
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int start=0; // store starting index
        int sum=0;   // store sum of elements
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
            while(sum>s){
                sum=sum-arr[start++];
            }
            if(sum==s){
                result.add(start+1);
                result.add(i+1);
            }
        }
        return result;
    }

    /**
     static FirstPhaseLearning.ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        FirstPhaseLearning.ArrayList<Integer> result = new FirstPhaseLearning.ArrayList<Integer>();
        int start=0; // store starting index
        int sum=0;   // store sum of elements
        for (int i = 0; i <n ; i++) {
            start=arr[i];
            result.add(start);
            sum=arr[i];
            for (int j = i+1; j <n ; j++) {
                if(sum<s){
                    sum+=arr[j];
                    continue;
                } else if (sum > s) {
                    break;
                }else{
                    result.add(arr[j]);
                    return result;
                }
            }
            result.removeAll(result);
        }
        return result;
    }
    */

}
