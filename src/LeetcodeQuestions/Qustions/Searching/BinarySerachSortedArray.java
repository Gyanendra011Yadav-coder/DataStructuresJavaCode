package LeetcodeQuestions.Qustions.Searching;


/**
 * Created By:  Gyanendra_Yadav
 * on 2022-12-01,Dec,2022
 * in Project: DataStructuresJavaCode
 */
public class BinarySerachSortedArray {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int index=-1;
        int mid=nums.length/2;
        if(nums[mid]>target){
            for (int i = 0; i <mid ; i++) {
                if(nums[i]==target){
                    index = i;
                }
            }
        }else{
            for (int i = mid; i < nums.length ; i++) {
                if(nums[i]==target){
                    index = i;
                }
            }
        }
        return index;
    }
}
