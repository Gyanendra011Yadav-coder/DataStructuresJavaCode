package FirstPhaseLearning.codingNinjas.BasicAlgorithms;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-03,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class LongestMountainSubarray {

    public static void main(String[] args) {
        int [] arr={1,3,1,4,3,1};
        System.out.println(longestMountain(arr, arr.length));
    }

    public static int longestMountain(int arr[], int n) {
        int longestMountain = 0;
        int left = 0;
        int right = 0;
        if (n < 3) return 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i + 1] < arr[i]) {
                left = i - 1;
                right = i + 1;

                while ((left > 0) && (arr[i] > arr[i - 1])) left--;

                while ((right < n - 1) && (arr[i] > arr[i + 1])) right++;

                longestMountain = Math.max(longestMountain, (right - left + 1));
            }
        }
        return longestMountain;
    }

    public static int longestMountainBruttForce(int arr[], int n)
    {
        int overallMax=Integer.MIN_VALUE;
        int currMaxVal=1;

        // Base Case
        if(n==2){
            return 0;
        } else if (n==3) {
            int mid=n/2;
            if(arr[mid]>arr[0] && arr[n-1]<arr[mid]){
                        return 3;
            }else{
                return 0;
            }
        }

        for (int index1 = 0; index1 < n; index1++) {
            for (int index2 = index1 + 1; index2 < n; index2++) {
                if (arr[index2] < arr[index1]) {
                    break;
                } else {
                    if(arr[index2]>arr[index1] && arr[index2-1]>arr[index2]) {
                        currMaxVal++;
                    }

                    overallMax=Math.max(currMaxVal, overallMax);
                }
            }
        }

        return overallMax;
    }
}
