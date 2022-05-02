package LeetcodeQuestions;

import java.util.PriorityQueue;
import java.util.Queue;

public class moveZeroesProblemNumber283 {

    public void moveZeroes(int[] nums) {
        int length=nums.length, countZeroes=0;
        Queue <Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i <length ; i++) {
            if(nums[i]!=0){
                queue.add(nums[i]);
            }else{
                countZeroes++;
            }
        }
        if(countZeroes!=0) {
            while (countZeroes != 0) {
                queue.add(0);
            }
        }

        for (int i = 0; i <length ; i++) {

        }
    }
}
