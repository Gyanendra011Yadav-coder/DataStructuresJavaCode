package FirstPhaseLearning.GeeksForGeeks.Arrays;

import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-05-22,May,2023
 * in Project: DataStructuresJavaCode
 */
public class EasyKeyPair {
    public static void main(String[] args) {
//        int [] arr={1,2,4,3,6};
//        int [] arr={1 ,4 ,45 ,6 ,10 ,8};
        int []arr={1,2,5,6,7};
        System.out.println(hasArrayTwoCandidates(arr, arr.length, 4));
    }


    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        int temp=x;
        Arrays.sort(arr);
        for (int index = 0; index <n ; index++) {
            temp-=arr[index];
            int indexFindAt=Arrays.binarySearch(arr, temp);
            if(indexFindAt>=0 && indexFindAt!=index){
                return true;
            }
            temp=x;
        }
        return false;
    }
}
