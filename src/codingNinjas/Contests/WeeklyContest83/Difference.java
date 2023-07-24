package codingNinjas.Contests.WeeklyContest83;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-22,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class Difference {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 6, 2, 8, 2, 12};
        System.out.println(difference(arr.length,arr));
    }

    static int difference2(int n, int []a) {
        // Write your code here.
        for (int i = 0; i <n; i++) {
            if(a[i]==1 || a[i]==0){
                continue;
            }else{
                a[i] = (a[i] / largestDivisor(a[i]));
            }
        }
        Arrays.sort(a);

        return (a[n-1]-a[0]);
    }

    public static int largestDivisor(int number) {
        int largestDivisor = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                largestDivisor = i;
                break;
            }
        }
        return largestDivisor;
    }

    static int findMinDiff(int []arr){
        int minDiff = Integer.MAX_VALUE;
        int size=arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int diff = arr[j] - arr[i];
                if (diff < minDiff && diff!=0) {
                    minDiff = diff;
                }
            }
        }
        return minDiff;
    }
    static int difference(int n, int []a) {

        // Initialize array 'newA' and 'ans' with 1e5.
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        int result = 100000;

        // Making 'newA'.
        for (int index = 0; index < n; index++) {
            for (int j = 1; j * j <= a[index]; j++) {
                if (a[index] % j == 0) {
                    list.add(new Pair<>(a[index] / j, index));
                    if (j != 1) {
                        list.add(new Pair<>(j, index));
                    }
                }
            }
        }

        // Initialize a hashmap 'mp' of [int, int] and 'j' with 0.
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;

        // Sorting 'newA' in non-decreasing order.
        list.sort((p1, p2) -> p1.getKey() - p2.getKey());

        // Calculating 'ans'.
        for (int index2 = 0; index2 < list.size(); index2++) {
            map.put(list.get(index2).getValue(), map.getOrDefault(list.get(index2).getValue(), 0) + 1);

            while (map.size() == n) {
                result = Math.min(result, list.get(index2).getKey() - list.get(j).getKey());
                map.put(list.get(j).getValue(), map.get(list.get(j).getValue()) - 1);

                if (map.get(list.get(j).getValue()) == 0) {
                    map.remove(list.get(j).getValue());
                }

                j++;
            }
        }

        // We are returning the answer here.
        return result;
    }

}
class Pair<Key, Value> {
    private final Key key;
    private final Value value;

    public Pair(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    public Key getKey() {
        return key;
    }

    public Value getValue() {
        return value;
    }
}
