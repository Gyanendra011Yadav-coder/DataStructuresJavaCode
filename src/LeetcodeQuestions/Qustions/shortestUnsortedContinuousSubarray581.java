package LeetcodeQuestions.Qustions;

public class shortestUnsortedContinuousSubarray581 {

    public int findUnsortedSubarray(int[] nums) {
        boolean count=false;
        int start=0, end=0;

        for (int i = 1; i <nums.length ; i++) {
            if(nums[i-1]>nums[i]){
                if (count==false){
                    start=(i-1)+1;
                    count=true;
                }else{
                    end=i+1;
                }
            }else{
                continue;
            }
        }
        return end-start;
    }
}
