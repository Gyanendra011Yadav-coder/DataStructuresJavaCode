package FirstPhaseLearning.Qustions;

public class twoSumInputArrayIsSorted167 {
    public int[] twoSum(int[] numbers, int target) {
        int length= numbers.length;
        int[] result = new int[2];
        //running from the start of the array
        for (int i = 0; i<length ; i++) {
            //will be running from next of ith index
            for (int j = i+1; j <length ; j++) {
                if (numbers[i]+numbers[j]==target){
                    result[0]=i+1;
                    result[1]=j+1;
                    break;
                }
            }
        }
        return result;
    }
}
