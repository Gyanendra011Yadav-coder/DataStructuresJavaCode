package FirstPhaseLearning.prefixAndSuffixSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-14,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class SumInfiniteArray {
        private static final int MOD = (int) (1e9 + 7);

        public static List<Integer> sumInRanges(List<Integer> arr, int n, List<List<Long>> queries, int q) {

            List<Long> prefixSum = new ArrayList<>();
            prefixSum.add(0L);

            for (int i = 1; i <= n; i++) {
                prefixSum.add((arr.get(i - 1) + prefixSum.get(i - 1)) % MOD);
            }

            List<Integer> result = new ArrayList<>();
            for (int j = 0; j < q; j++) {
                long l = queries.get(j).get(0);
                long r = queries.get(j).get(1);

                long leftSum = sumUptoI(prefixSum, l - 1, n);
                long rightSum = sumUptoI(prefixSum, r, n);

                result.add((int)((rightSum - leftSum + MOD) % MOD));
            }

            return result;
        }

        private static long sumUptoI(List<Long> prefixSum, long i, int n) {
            long repeat = (i / n) % MOD;

            long sum = (repeat * prefixSum.get(n)) % MOD;

            sum = (sum + prefixSum.get((int) (i % n))) % MOD;

            return sum;
        }

        public static void main(String[] args) {
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);

            List<List<Long>> queries = new ArrayList<>();
            queries.add(new ArrayList<>(List.of(1L, 3L)));
            queries.add(new ArrayList<>(List.of(2L, 5L)));

            List<Integer> result = sumInRanges(arr, 5, queries, 2);

            System.out.println(result);
        }
    }
