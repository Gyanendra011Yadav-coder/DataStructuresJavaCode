package FirstPhaseLearning.elementsprogramminginterviews.Arrays;

public class EvenFirstOddLast {
    public static void main(String[] args) {
        int [] array = {2,3,4,7,8,9,10,11,12,13,14,15};
        reframeArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "th element"+ array[i]);
        }
    }

    public static void reframeArray(int[] array) {
        int evenIndex = 0;
        int oddIndex = array.length - 1;
        while (evenIndex < oddIndex) {
            if(array[evenIndex] % 2 == 0) {
                evenIndex++;
            } else {
                oddIndex=swap(evenIndex, oddIndex, array);
                evenIndex++;
            }
        }
    }

    public static int swap(int index1, int index2, int[] array) {
        int temp=array[index1];
        while (index1 < index2) {
            if (array[index2] % 2 == 0) {
               array[index1]=array[index2];
               array[index2]=temp;
               index2--;
               break;
            }
            index2--;
        }
        return index2;
    }
}
