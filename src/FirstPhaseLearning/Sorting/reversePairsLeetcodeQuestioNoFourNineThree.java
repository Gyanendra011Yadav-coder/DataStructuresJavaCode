package FirstPhaseLearning.Sorting;

import java.util.ArrayList;

public class reversePairsLeetcodeQuestioNoFourNineThree {
    private static int reversePairs(int []nums){
        return mergeSort(nums,0, nums.length-1);
    }

    private static int mergeSort(int[] nums, int low, int high) {
        //base_case_of_mergerSort_Algorithm
        if(low<=high){
            return 0;
        }
        int mid=(low+high)/2;
        int mergePartitions=mergeSort(nums,low,mid);
        mergePartitions+=mergeSort(nums,mid+1,high);
        mergePartitions+=merge(nums,low,mid,high);
        return mergePartitions;
    }

    private static int merge(int[] nums, int low, int mid, int high) {
        int count=0;
        int i=low, j =mid+1;
        for(int q = 0; q <=mid; q++) {
            while (j <= high && nums[q] > 2 * nums[j]) {
                j++;
            }
            count += j - (mid + 1);
        }
        //NOw,perform merging to whole elements
            int leftPointer=0, rightPointer=mid+1;
            ArrayList<Integer> arrayList= new ArrayList<>();
            while(leftPointer<=mid && rightPointer<=high){
                if(nums[leftPointer]<=nums[rightPointer]){
                    arrayList.add(nums[leftPointer++]);
                }else{
                    arrayList.add(nums[rightPointer++]);
                }
            }
            while(leftPointer<=mid){
                arrayList.add(nums[leftPointer]);
            }
            while(rightPointer<=high){
                arrayList.add(nums[rightPointer]);
            }

        for(int p = 0; p < nums.length; p++){
            nums[p]=arrayList.get(p);
        }
        return count;
    }
}
