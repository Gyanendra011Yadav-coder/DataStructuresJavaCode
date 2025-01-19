package FirstPhaseLearning.codingNinjas.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-25,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
//        int[] arr = {100, 100, 100, 100, 99, 101, 101, 101, 101, 101};
//        int [] arr={1,2,3,4,100,200};

        int [] arr={0,0};
        System.out.println(lengthOfLongestConsecutiveSequence(arr, arr.length));
    }

    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        int result = 0;
        int overallConsecutive = Integer.MIN_VALUE;

        //Removing Duplicates as it is asked to count them ones
        int temp[] = removeDuplicate(arr);

        //FirstPhaseLearning.Sorting the array to achieve sequence
        Arrays.sort(temp);

        //Handling base case
        if (temp.length == 1) {
            return 1;
        }

        for (int i = 1; i < temp.length; i++) {
            // If last value from current index is less than current then count it
            if ((temp[i - 1]) == (temp[i] - 1)) {
                result++;
                if (result > overallConsecutive) {
                    overallConsecutive = result;
                }
            } else {
                result = 0;
            }
        }
        //This case is to count the last index
        if (temp[temp.length - 2] < temp[temp.length - 1]) overallConsecutive++;


        return (overallConsecutive < 0) ? 1 : overallConsecutive;
    }

    public static int[] removeDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int val : arr) set.add(val);
        int temp[] = new int[set.size()];
        int index = 0;
        for (Integer val : set) {
            temp[index] = val;
            index++;
        }
        return temp;
    }
}
