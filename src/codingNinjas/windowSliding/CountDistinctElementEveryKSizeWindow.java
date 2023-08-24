package codingNinjas.windowSliding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-24,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class CountDistinctElementEveryKSizeWindow {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        arr.add(3);
        int k = 3;

        ArrayList<Integer> actualOutput = countDistinctElements(arr, k);
    }

    /*public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> resultMax = new ArrayList<>();
        int curr_Max = Integer.MIN_VALUE;
        int overall_Max = Integer.MIN_VALUE;

        int index2 = 0;
        for (int index1 = 0; index1 < (arr.size() - k); index1++) {
            index2=index1+1;
            while (index2 < arr.size() && (index2 < (index1+k))) {
               if(arr.get(index1)>arr.get(index2)){
                   curr_Max=arr.get(index1);
               }else{
                   curr_Max=arr.get(index2);
               }
                if (curr_Max>overall_Max){
                    overall_Max=curr_Max;
                }
                index2+=1;
            }
            resultMax.add(overall_Max);
            index2=0;
        }

        return resultMax;
    }*/

    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> resultMax = new ArrayList<>();

        for (int index1 = 0; index1 <= (arr.size() - k); index1++) {
            resultMax.add(findDistinctElement(arr,index1,(index1+k-1)));
        }

        return resultMax;
    }

    private static int findDistinctElement(ArrayList<Integer> arr, int startIndex, int endIndex){
        int distinctVale=0;
        Set<Integer> set=new HashSet<>();
        for (int i = startIndex; i <= endIndex; i++) {
            int num=arr.get(i);
            set.add(num);
        }
        return set.size();
    }
}
