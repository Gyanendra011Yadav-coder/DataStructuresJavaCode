package FirstPhaseLearning.codingNinjas.SevenDaysChallenge;

public class FrogJump {
    public static void main(String[] args) {
        int[] heights = {10, 20, 30, 10};
        System.out.println(frogJump(heights.length, heights));
    }

    public static int frogJump(int n, int []heights) {
        int energyLost = 0;

        int index = 0;
        while (index < n - 2) {
            energyLost += countMinEnergy(index, heights);
            index++;
        }

        return energyLost;
    }

    public static int countMinEnergy(int index, int[] heights) {
//        int firstMinVal=heights[index]-heights[index+1];
//        int secondMinVal=heights[index+2]-heights[index];
//        firstMinVal=makePositive(firstMinVal);
//        secondMinVal=makePositive(secondMinVal);
        // Second optimization
//        int smallest = Math.min(heights[index+1], heights[index + 2]);
        int minStepCount = Math.min(heights[index+1], heights[index + 2]) - heights[index];
        if (minStepCount < 0) {
            minStepCount = makePositive(minStepCount);
        }
//        return Math.min(firstMinVal, secondMinVal);
        return minStepCount;
    }

    public static int makePositive(int number) {
        return (-1 * number);
    }
}
