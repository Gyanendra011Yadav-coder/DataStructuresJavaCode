package FirstPhaseLearning.Searching;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-11,Mar,2023
 * in Project: DataStructuresJavaCode
 */
public class PeakElement {

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(peakElement(arr,arr.length));
    }
    public static int peakElement(int[] arr,int n)
    {
        int peakEleIndex =0;
        for (int i = 1; i <n ; i++) {
            if(arr[i-1]<arr[i]){
                if (peakEleIndex <i){
                    peakEleIndex =i;
                }
            }
        }
        return peakEleIndex;
    }

    public static int peakElementRecursion(int[] arr,int n, int peakEleIndex)
    {

        /**
        int peakEleIndex =0;
        for (int i = 1; i <n ; i++) {
            if(arr[i-1]<arr[i]){
                if (peakEleIndex <i){
                    peakEleIndex =i;
                }
            }
        }
         */
        return peakEleIndex;
    }
}
