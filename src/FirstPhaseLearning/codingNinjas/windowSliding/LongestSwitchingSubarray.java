package FirstPhaseLearning.codingNinjas.windowSliding;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-22,Aug,2023
 * in Project: DataStructuresJavaCode
 * <p>
 * 7
 * 4
 * 2 4 2 4
 * -----------4
 * 7
 * 3 7 3 7 2 1 2
 * -----------4
 * 6
 * 1 5 6 0 1 0
 * ---------3
 * 1
 * 3
 * --------1
 * 2
 * 1 2
 * ---------2
 * 3
 * 1 2 2
 * ------2
 * 3
 * 1 2 1
 * -------3
 * o/P
 * 4
 * 4
 * 3
 * 1
 * 2
 * 2
 * 3
 */
public class LongestSwitchingSubarray {
    public static void main(String[] args) {
//        int [] arr={5,2,3,5,2,5};
//        int [] arr={1,5,6,0,1,0,1,3};
//        int[] arr = {1, 2, 1};
        int [] arr={1,4,1,4,3,2,3,0};
        System.out.println(switchingSubarray(arr, arr.length));
    }

    public static int switchingSubarray(int[] arr, int n) {
        if (n <= 1) return n;
        int ans = 2;
        int even = arr[0];
        int odd = arr[1];
        int cur = 2;
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] == even) cur++;
                else {
                    cur = 2;
                    even = arr[i];
                }
            } else {
                if (arr[i] == odd) cur++;
                else {
                    cur = 2;
                    odd = arr[i];
                }
            }
            ans = Math.max(ans, cur);
        }
        return ans;
    }

    public static int switchingSubarray2(int[] arr, int n) {
        int index = 1;
        int overallCounter = 0;
        int currCounter = 0;

        if (n == 1 || n == 2) {
            return 1;
        } else if (n == 3) {
            if (arr[index - 1] == arr[index + 1]) {
                return 3;
            }
        }
        while (index < n - 2) {
            if (arr[index] == arr[index + 2]) {
                if (arr[index - 1] == arr[index + 1] || arr[index + 1] == arr[index + 3]) {
                    currCounter = ((index + 2) - (index - 1)) + 1;
                } else {
                    currCounter = ((index + 2) - index) + 1;
                }

            } else if (arr[index - 1] == arr[index + 1]) {
                currCounter = 3;
            }
            index = index + 2;
//            if(index>n) index=n-1;
            if (currCounter > overallCounter) {
                overallCounter = currCounter;
            }
        }
        return overallCounter;
    }

}
