package FirstPhaseLearning.SemisterFifthLabAssignment;

/**
 * @author lenovo
 * @created 10/12/2021- 5:06 PM
 * @project DataStructuresJavaCode
 */
class binarySearch {
    int binarySearch(int arr[], int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key)
                return binarySearch(arr, left, mid - 1, key);
            return binarySearch(arr, mid + 1, right, key);
        }
        return -1;
    }
    public static void main(String args[]) {
        binarySearch ob = new binarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int serachingKey = 10;
        int result = ob.binarySearch(arr, 0, n - 1, serachingKey);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }
}
