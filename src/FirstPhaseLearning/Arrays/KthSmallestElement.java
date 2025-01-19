package FirstPhaseLearning.Arrays;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-13,Nov,2022
 * in Project: DataStructuresJavaCode
 */
public interface KthSmallestElement {
    //Main method
    public static void main(String[] args) {

    }

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        Arrays.sort(arr);
        return arr[k];
    }
}
