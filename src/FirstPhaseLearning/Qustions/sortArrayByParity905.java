package FirstPhaseLearning.Qustions;
import java.util.PriorityQueue;
import java.util.Queue;


public class sortArrayByParity905 {

    //method to solve this leetcode problem
    public int[] sortArrayByParity(int[] nums) {
        int lengthOfArray=nums.length;
        Queue <Integer> even = new PriorityQueue<Integer>();
        Queue<Integer> odd = new PriorityQueue<Integer>();
        for (int i=0; i<lengthOfArray ; i++) {
            if(nums[i]%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        int i=0;
        while(!even.isEmpty()){
            nums[i]=even.poll();
            i++;
        }
        while(!odd.isEmpty()){
            nums[i]=odd.poll();
            i++;
        }
        return nums;
    }
    public static void main(String[] args) {

    }
}
