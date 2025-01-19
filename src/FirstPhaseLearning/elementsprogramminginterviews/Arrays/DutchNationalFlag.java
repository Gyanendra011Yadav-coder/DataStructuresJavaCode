package FirstPhaseLearning.elementsprogramminginterviews.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int []arrayTest =  {1, 4, 2, 4, 2, 4, 1, 2, 4, 1, 2, 2, 2, 2, 4, 1, 4, 4, 4};
        sortArrayWithPivotSecond(arrayTest,2);
        for (int i = 0; i < arrayTest.length; i++) {
            System.out.print(arrayTest[i] + ",");
        }
    }

    // Complexity: O(n
    public static void sortArrayWithPivot(int[] array, int piviot) {
        int larger = array.length - 1, smaller = 0, equal = 0;

        while (equal < larger) {

            // check if less than piviot
            if(array[equal]<piviot){
                swapArrayElement(array,smaller,equal);
                smaller++;
                equal++;
            } else if(array[equal]==piviot){
                equal++;
            } else { // array[equal] > pivot
                swapArrayElement(array,equal,larger);
                larger--;
            }
        }
    }

    // complexity => O(n^2)
    public static void sortArrayWithPivotSecond(int []array, int pivot){
        // This loop will help in ordering values in increasing order a/c to pivot
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < pivot){
                    swapArrayElement(array,j,i);
                    break;
                }
            }
        }

        // This vale will help in ordering value in decreasing order
        for (int i = array.length-1; array[i] >= pivot; --i) {
            for (int j = i-1; j >= pivot-1; j++) {
                if(array[j] > pivot){
                    swapArrayElement(array,j, i);
                    break;
                }
            }
        }
    }

    public static void swapArrayElement(int []array, int firstIndex, int replaceWithIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[replaceWithIndex];
        array[replaceWithIndex] = temp;
    }

}
