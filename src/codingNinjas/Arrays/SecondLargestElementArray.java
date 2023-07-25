package codingNinjas.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-25,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class SecondLargestElementArray {

    public static void main(String[] args) {
//        int [] arr={10, 25, -12, -6, 20, 20};

        int [] arr={-3,-3,-3,-3,-3,-3};
        System.out.println(findSecondLargest(arr.length, arr));
    }

    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.

        int result=-1;

        int [] temp=removeDuplicate(arr);
        Arrays.sort(temp);
        if(temp.length<2){
            result=temp[0];
        }else{
            result=temp[(temp.length)-2];
        }
        return result;
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
