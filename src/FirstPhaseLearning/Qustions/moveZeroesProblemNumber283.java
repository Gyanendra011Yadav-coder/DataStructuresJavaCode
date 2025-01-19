package FirstPhaseLearning.Qustions;

public class moveZeroesProblemNumber283 {

    public void moveZeroes(int[] nums) {
        /*int length=nums.length, countZeroes=0;
        FirstPhaseLearning.Queue <Integer> queue = new PriorityQueue<Integer>();
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
            nums[i]=queue.poll();
        }*/

        //solution-02
        int length=nums.length,count=0;
        //Shifting Non-Numeric values
        for (int i = 0; i <length ; i++) {
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        //Inserting Zeroes
        for (int i = count; i <length ; i++) {
            nums[i]=0;
        }

    }
}
