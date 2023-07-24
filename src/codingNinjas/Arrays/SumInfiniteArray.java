package codingNinjas.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-19,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class SumInfiniteArray {
    public static void main(String[] args) {

    }


    /**
     *In this code, we first calculate the prefix sum of array A and store it in the prefix_sum
     *  array. Then, for each query, we calculate the sum of the subarray in B using the formula
     *  described above. We also take into account the repetitions of array A in B, and add the
     *  remaining elements at the end if the subarray extends beyond the end of array A.
     *  Finally, we return the list of answers for all queries.
     */
    public static List<Integer> sumInRangesBruttForce(int[] arr, int n, List<List<Long>> queries, int q) {
        final int MOD = 1029+7;
        List<Integer> ans = new ArrayList<>();
        long[] prefix_sum = new long[n];
        prefix_sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
        }


        long sum = 0;
        for (List<Long> query : queries) {
            int L = (int) (query.get(0) - 1);
            int R = (int) (query.get(1) - 1);
            long subarray_sum = (prefix_sum[R] - (L > 0 ? prefix_sum[L-1] : 0) + MOD) % MOD;
            long len = R - L + 1;
            long repetitions = len / n;
            subarray_sum = (subarray_sum * repetitions) % MOD;
            int remaining = (int) (len % n);
            if (remaining > 0) {
                subarray_sum = (subarray_sum + prefix_sum[remaining-1]) % MOD;
            }
            ans.add((int) subarray_sum);
        }
        return ans;
    }

    /**
     *
     *In this optimized code, we first compute the sum of array A and store it in the variable
     *  prefix_sum. Then, for each query, we calculate the sum of the subarray in B on the fly,
     *  using a loop to iterate over the relevant elements in the array A. We also take into
     *  account the repetitions of array A in B, and add the remaining elements at the end if
     *  the subarray extends beyond the end of array A. Finally, we return the list of answers
     *  for all queries. This approach has a space complexity of O(1), which is much more
     *  efficient than the previous approach.
     */
    public static List<Integer> sumInRangesOptmized(int[] arr, int n, List<List<Long>> queries, int q) {
        final int MOD = 1029+7; // this is as per asked in question to simplyfy the long answers
        List<Integer> ans = new ArrayList<>();
        long prefix_sum = 0; //Storing all the sum here
        for (int i = 0; i < n; i++) { //clculating the sum of given array
            prefix_sum += arr[i];
        }
        for (List<Long> query : queries) { //itreating on all the queries asked
            int leftIndex = (int) (query.get(0) - 1);
            int righIndex = (int) (query.get(1) - 1);
            long totalLengthToCov = righIndex - leftIndex + 1;
            long leftLenCovrd = totalLengthToCov / n;
            long subarray_sum = prefix_sum * leftLenCovrd;
            int remaining = (int) (totalLengthToCov % n); //Index left to calculate
            for (int i = 0; i < remaining; i++) {
                subarray_sum += arr[i];
            }
            subarray_sum %= MOD;
            ans.add((int) subarray_sum);
        }
        return ans;
    }

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        List<Integer> result=new ArrayList<>();
        int givenArrSum = 0;
        //Need to calculate the sum of the given Array
        for (int i = 0; i < n; i++) {
            givenArrSum+=arr[i];
        }

        for (List<Long> query:queries) {
                //First we will fetch indexies of the queries
            int leftIndex= (int) (query.get(0)-1);
            int rightIndex= (int) (query.get(1)-1);

            //This variable will holding values of all the Indexes need to be covered
            int totalIndexNeedToCover= (rightIndex-leftIndex+1);

            int indexToCover=totalIndexNeedToCover/n;
            givenArrSum*=indexToCover;

            int remainingIndexe=totalIndexNeedToCover%n;

            for (int i = 0; i <remainingIndexe ; i++) {
                givenArrSum+=arr[i];
            }
        }
        return result;
    }



    public long sum_upto_i(List<Long> prefix, long i, long n) {
        int mod = 1000000007;
        long repeat = (i / n) % mod;
        long sum = (repeat * prefix.get((int)n)) % mod;
        sum = (sum + prefix.get((int)(i % n))) % mod;
        return sum;
    }

    public List<Integer> sumInRanges(List<Integer> arr, int n, List<List<Long>> queries, int q) {
        int mod = 1000000007;
        List<Long> prefix_sum = new ArrayList<>(n+1);
        prefix_sum.add(0L);
        for (int i = 1; i <= n; i++) {
            prefix_sum.add((arr.get(i-1) + prefix_sum.get(i-1)) % mod);
        }
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < q; j++) {
            long l = queries.get(j).get(0);
            long r = queries.get(j).get(1);
            long left_sum = sum_upto_i(prefix_sum, l-1, n);
            long right_sum = sum_upto_i(prefix_sum, r, n);
            result.add((int)((right_sum - left_sum + mod) % mod));
        }
        return result;
    }
}
