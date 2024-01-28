package GeeksForGeeks.problemOfDay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-19,Mar,2023
 * in Project: DataStructuresJavaCode
 */
public class DistinctDifference {

    public static void main(String[] args) {
        int arr[] = {4, 4, 3, 3};
        ArrayList<Integer> result=getDistinctDifference(arr.length, arr);
        for(int ele: result) {
            System.out.println(ele);
        }
    }
    public static ArrayList<Integer> getDistinctDifference(int lengthArr, int[] arr) {

        ArrayList<Integer> diff = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();

        if(  lengthArr==0 || lengthArr==1 || lengthArr==2){
            return diff;
        }


        int leftDistinctElements =0; //to store left distinct elements
        int rightDistinctElements =0; //to store right distinct elements
        for (int i = 0; i <lengthArr ; i++) {
            if(i==0 || i==lengthArr-1) {
                if (i==0) {
                    leftDistinctElements = 0;
                    rightDistinctElements = findDistinctElements(arr, i + 1, true);
                    diff.add(leftDistinctElements - rightDistinctElements);
                }else {
                    rightDistinctElements = 0;
                    leftDistinctElements = findDistinctElements(arr, i-2, false);
                    diff.add(leftDistinctElements - rightDistinctElements);
                }
            } else if(i==1 || i==lengthArr-2) {
                if (i==0) {
                    leftDistinctElements = 1;
                    rightDistinctElements = findDistinctElements(arr, i + 1, true);
                    diff.add(leftDistinctElements - rightDistinctElements);
                }else {
                    rightDistinctElements = 1;
                    leftDistinctElements = findDistinctElements(arr, i-3, false);
                    diff.add(leftDistinctElements - rightDistinctElements);
                }
            }else{
                diff.add(0);
            }
        }

        return diff;
    }

    //If TraverseLeft:: then "calLeftRight"-> FALSE && "calLeftRight" TRUE for Right
    private static int findDistinctElements(int []arr, int index, boolean calLeftRight){

        Set<Integer> set = new HashSet<>();
        if(calLeftRight){
            for (int i = index; i <arr.length; i++) {
                set.add(arr[i]);
            }
        }else{
            for (int i = index; i>=0; i--) {
                set.add(arr[i]);
            }
        }
        return set.size();
    }
}
