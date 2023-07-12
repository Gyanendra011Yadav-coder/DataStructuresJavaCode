package Searching;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-12,Jul,2023
 * in Project: DataStructuresJavaCode
 *
 * https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118820/offering/1381880?leftPanelTab=0
 */
public class FindFirstLastPositionElement {
    public static int[] searchRange(int []arr, int x) {
        int[] result = new int[2];
        result[0]=-1; result[1]=-1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == x) {
                if (result[0] == -1) {
                    result[0] = index;
                } else {
                    result[1] = index;
                }
            }
        }
        if(result[1]==-1) result[1]=result[0];
        return result;
    }
}
