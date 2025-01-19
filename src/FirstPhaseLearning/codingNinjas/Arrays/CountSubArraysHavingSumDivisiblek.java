package FirstPhaseLearning.codingNinjas.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-21,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class CountSubArraysHavingSumDivisiblek {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
//        arr.add(5);
        int []ar={1,2,3,4};
        int k = 1;
        System.out.println(subArrayCount(arr, k));
    }

    public static int subArrayCountBrutt(ArrayList< Integer > arr, int k) {
        int ttlSubArray=0;

        //Base cases
        if(arr.size()==1){
            if(arr.get(0)==k || (arr.get(0))%k==0){
                return ttlSubArray++;
            }else{
                return ttlSubArray;
            }
        }

        //Iterating through first loop
        for (int index = 0; index <arr.size(); index++) {
            if(arr.get(index)==k || arr.get(index)%k==0){
                ttlSubArray++;
            }
            for (int i = index+1; i < arr.size(); i++) { //second loop
               int reminder=(arr.get(i)+arr.get(index))%k;
                if(reminder==0){
                    ttlSubArray++;
                }
            }
        }
        if(findSumArr(arr)%k==0){
            ttlSubArray++;
        }
        return ttlSubArray;
    }

    public static int findSumArr(ArrayList< Integer > arr){
        int ttlSum=0;
        for (int i = 0; i <arr.size() ; i++) {
            ttlSum+=arr.get(i);
        }
        return ttlSum;
    }

    public static int subArrayCount(ArrayList< Integer > arr, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.size(); i++) {
            sum = (sum + arr.get(i) % k);
            if (sum < 0) {
                sum += k;
            }
            if (map.containsKey(sum)) {
                count += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return count;
    }

    public static int subArrayCount3(ArrayList < Integer > arr, int k) {
        // Write your code here.
        int mod[] = new int[k];
        Arrays.fill(mod, 0);

        long cumSum = 0;
        int n=arr.size();
        for (int i = 0; i < n; i++) {
            cumSum += arr.get(i);
            mod[((int)(cumSum % k) + k) % k]++;
        }
        int result = 0;
        for (int i = 0; i < k; i++)
            if (mod[i] > 1)
                result += (mod[i] * (mod[i] - 1)) / 2;
        result += mod[0];
        return result;
    }
}
