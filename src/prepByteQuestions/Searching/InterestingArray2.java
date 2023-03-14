package prepByteQuestions.Searching;

import java.io.IOException;
import java.util.*;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-13,Mar,2023
 * in Project: DataStructuresJavaCode
 */
public class InterestingArray2 {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int lenArr = scanner.nextInt();
        int diffFind = scanner.nextInt();
        int[] arr = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            arr[i] = scanner.nextInt();
        }
//        Arrays.sort(arr);
        System.out.println(findCountValue5(arr, diffFind));
    }

    private static int findCountValue(int[] arr, int diffFind) {
        int countResult = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] - arr[i]) == diffFind) {
                    countResult++;
                }
            }
        }
        return countResult;
    }

    /*
    The program reads in the input array arr and the difference k, and
    then creates a HashSet to store the elements of the array.
     It then loops through the array, checking if there is an element in
      the set that is k greater than the current element. If there is,
      it increments the count. Finally, it returns the count as the output.
     */
    private static int findCountValue2(int[] arr, int diffFind) {
        System.out.println("Get Request, arr="+arr);
        int countResult = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
            map.put(i,arr[i]);
        }

        System.out.println("Get Request, set="+map);
        for (int i = 0; i < arr.length; i++) {
            if (map.containsValue(Math.abs(arr[i] - diffFind))) {
                countResult++;
            }
        }
        return countResult-1;
    }

    private static int findCountValue3(int[] arr, int diffFind) {
        int countResult = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[j] - arr[i]) == diffFind) {
                    countResult++;
                }
            }
        }
        return countResult;
    }

    private static int findCountValue4(int[] arr, int diffFind) {
        int countResult = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            int complement = Math.abs(num - diffFind);
            if (freqMap.containsKey(complement)) {
                countResult += freqMap.get(complement);
                if (diffFind == 0) {
                    countResult--;
                }
            }
        }
        return countResult/2;
    }

    private static int findCountValue5(int[] arr, int diffFind) {
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                if (map.containsKey(num - diffFind)) {
                    count += map.get(num - diffFind);
                }
                if (map.containsKey(num + diffFind)) {
                    count += map.get(num + diffFind);
                }
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            return count;
    }

}
