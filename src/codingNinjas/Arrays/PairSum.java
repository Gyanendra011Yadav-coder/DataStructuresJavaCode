package codingNinjas.Arrays;

import java.util.*;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-23,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class PairSum {
    public static void main(String[] args) {
        int [] arr={3,5,2,6,4};
//        List<int[]> pairs =pairSum(arr,5);
//        pairs.forEach(pair -> {
//            for (int num : pair) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        });

        System.out.println(isValidPair(arr,arr.length, 5,2));
    }

    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> resultList=new ArrayList<>();
        int[] resultArray=null;
        for (int i = 0; i < arr.length; i++) {
            resultArray=new int[2];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==s){
                    resultArray[0]=arr[i];
                    resultArray[1]=arr[j];
                }
            }
            if((resultArray[0]!=0) &&  (resultArray[1]!=0)){
                resultList.add(resultArray);
            }
        }
        return resultList;
    }

    public static List<int[]> pairSum2(int[] arr, int s) {
        // Write your code here.
        int n = arr.length;
        Arrays.sort(arr);
        List<int[]> integerArrays = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i<=j && arr[i]+arr[j]==s)
                {
                    integerArrays.add(new int[]{arr[i], arr[j]});
                }
            }
        }
        return integerArrays;
    }

    public static boolean isValidPair(int[] arr, int n, int k, int m)
    {
        boolean isValidPairs=false;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i<=j && (arr[i]+arr[j])%k==m)
                {
                    return true;
                }else{
                    continue;
                }
            }
        }
        return isValidPairs;
    }

    public static boolean isValidPair2(int[] arr, int n, int k, int m) {
        if (n % 2 != 0) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int remainder = arr[i] % k;
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int value = (m - arr[i] % k + k) % k;
            if (map.containsKey(value)) {
                int frequency = map.get(value);
                if (frequency > 0) {
                    map.put(value, frequency - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
