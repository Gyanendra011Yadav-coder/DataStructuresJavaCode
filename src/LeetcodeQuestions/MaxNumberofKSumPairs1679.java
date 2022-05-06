package LeetcodeQuestions;

public class MaxNumberofKSumPairs1679 {
    public int maxOperations(int[] nums, int k) {
        int length=nums.length;
        int count=0;
        for (int i = 0; i <length ; i++) {
            for (int j = i+1; j <length ; j++) {
                if(nums[i]+nums[j]==k){
                    count++;
                }else{
                    continue;
                }
            }
        }
        return count;
    }
}
