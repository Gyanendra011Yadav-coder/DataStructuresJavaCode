package FirstPhaseLearning.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-04,Jul,2023
 * in Project: DataStructuresJavaCode
 *
 * Sort 0 1 2
 */
public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) {
        int[] numbers={0,1,2,2,1,0};
        sort012(numbers);
        printArray(numbers,numbers.length);

        sort012Decr(numbers);
        printArray(numbers,numbers.length);
    }

    public static void sort012(int[] arr)
    {
        int low=0; //keep track of 0s
        int mid=0; //keep track of 1s
        int high= arr.length-1; //keep track of 2s
        int temp=0;
        while(mid<=high){
            switch(arr[mid]) {
                case 0:            // when it is 0 then switch the value with the mid
                    temp=arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp;
                    low++;
                    mid++;
                    break;
                case 1:   //Try to keep 1 in the middle therfore no switching
                    mid++;
                    break;
                case 2:   // when it is 1 then switch the value with the mid
                    temp=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp;
                    high--;
                    break;
            }
        }
    }

    public static void sort012Decr(int[] arr)
    {
        int low=0; //keep track of 0s
        int mid=0; //keep track of 1s
        int high= arr.length-1; //keep track of 2s
        int temp=0;
        while(mid<=high){
            switch(arr[mid]) {
                case 0:            // when it is 0 then switch the value with the mid
                    temp=arr[high];
                    arr[high]=arr[low];
                    arr[low]=temp;
                    low++;
                    high--;
                    break;
                case 1:   //Try to keep 1 in the middle therfore no switching
                    mid++;
                    break;
                case 2:   // when it is 1 then switch the value with the mid
                    temp=arr[high];
                    arr[high]=arr[low];
                    arr[low]=temp;
                    high--;
                    break;
            }
        }
    }

    //Printing Array
    static void printArray(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }


}
