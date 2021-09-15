package DivideAndConquer;

import java.util.Scanner;

public class findNearestElement {
    public int findNearestElement(int []array, int elementCompare) {
        int low = 0, high = array.length - 1;
        int mid = low + high / 2;
        if (array[0] > elementCompare) {
            return array[0];
        } else if (elementCompare > array[high]) {
            return array[high];
        } else if (array[mid] == elementCompare) {
            return array[mid];
        } else if (array[mid] > elementCompare) {
            if (mid > 0 && array[mid - 1] < elementCompare) {
                return min(array[mid-1],array[mid],elementCompare );
            }
        }
        else{
            if(array[mid+1]>elementCompare){
                return min(array[mid+1],array[mid],elementCompare);
            }
        }
        return 0;
    }

        public int min(int value1, int value2, int target){
            if(target-value1>=value2-target){
                return value2;
            }else
                return value1;

        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    }
}
