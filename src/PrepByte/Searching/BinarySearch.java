package PrepByte.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7};
        System.out.println(binarySerach(array, array.length, 0, array.length-1, 8));
    }

    public static int binarySerach(int[] array, int lengthArr, int low, int high, int dataSerach) {
        int mid = low + (high - low) / 2;

        //base case
        if (low > high) {
            return -1;
        }

        // if data to serach is found at mid
        if (array[mid] == dataSerach) {
            return mid;
        }

        // if data to search is less than mid value
        if (dataSerach < array[mid]) {
            return binarySerach(array, lengthArr, low, mid - 1, dataSerach);
        }

        // if data to search is greater than mid value
        return binarySerach(array, lengthArr, mid + 1, high, dataSerach);
    }
}
