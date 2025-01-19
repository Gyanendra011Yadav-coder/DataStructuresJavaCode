package FirstPhaseLearning.Arrays;

/**
 * Created By: GyanendraYadav on 2022-09-11,Sep,2022
 */
public class MinimumNumberOfJumps {

//    static int minJumps(int[] arr) {
//        int stepsCount=0;
//        int indexCurrent=0;
//        int indexUpdated=0;
//        while(indexCurrent<arr.length){
//
//        }
//    }

    //Brutt Force approach
    static int minJumps2(int[] arr){
        int stepsCount=0;
        int index=0;
        while(index<arr.length){
            index+=arr[index];
            stepsCount++;
        }

        return stepsCount;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
//        System.out.println(minJumps(arr));
    }
}
