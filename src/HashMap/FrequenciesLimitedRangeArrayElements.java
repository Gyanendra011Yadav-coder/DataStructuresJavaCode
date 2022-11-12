package HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-11,Nov,2022
 * in Project: DataStructuresJavaCode
 */
public class FrequenciesLimitedRangeArrayElements {
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> value : map.entrySet()) {
            System.out.print(value.getValue() + " ");
        }
    }
//Main_Class
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};
        int n = arr.length;
        // Function call
        frequencyCount(arr,arr.length,5);
    }
}
