package Arrays;

import java.util.ArrayList;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-04,Jul,2023
 * in Project: DataStructuresJavaCode
 *
 * 5
 * 6
 * 0 -2 3 5 -3 0
 * 0 0 0 0 0
 * 4 3 3 3 3
 * 1 2 3 4 5 6
 * 14 10 2 0 -13 -16 -134
 */
public class QuickSortUsingDutchNationalFlagAlgorithm {
    public static void main(String[] args) {

        // Create an ArrayList of integers
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(-2);
        list1.add(3);
        list1.add(5);
        list1.add(-3);
        list1.add(0);

        // Create an ArrayList of integers
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);

        // Create an ArrayList of integers
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(3);
        list3.add(3);
        list3.add(3);
        list3.add(3);

        // Create an ArrayList of integers
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(6);

        ArrayList<Integer> arr5=new ArrayList<>();
        arr5.add(4); arr5.add(2); arr5.add(1); arr5.add(4); arr5.add(2);

        ArrayList<Integer> list=quickSortUsingDutchNationalFlag(arr5);
        for(int a:list){
            System.out.print(a +" ");
        }
    }

    public static ArrayList<Integer> quickSortUsingDutchNationalFlag(ArrayList<Integer> arr) {
        // Write your code here.

        int low = 0;
        int mid = 0;
        int high = arr.size() - 1;
        int temp=0;

        while (mid <= high) {
            if (arr.get(mid) < arr.get(low)) {
                    temp = arr.get(low);
                    arr.set(low,arr.get(mid));
                    arr.set(mid,temp);
                    low++;
                    mid++;
            } else if (arr.get(mid) > arr.get(high)) {
                temp = arr.get(high);
                arr.set(high,arr.get(mid));
                arr.set(mid,temp);
                high--;
            } else {
                mid++;
            }
        }
        return arr;
    }
}
