package Searching;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-12,Jul,2023
 * in Project: DataStructuresJavaCode
 *
 *
 * https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118820/offering/1381882
 */
public class SearchInsertPosition {
    public static void main(String[] args) {

    }


    public static int searchInsert(int [] arr, int m){
        int result=0;
        int len=arr.length;
        for (int index = 0; index<len ; index++) {
            if(arr[index]>m){
                return result;
            }
            result=index;
        }
        return (arr[len-1]<m)? (len-1):result;
    }
}
