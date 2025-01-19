package FirstPhaseLearning.elementsprogramminginterviews.Arrays;

public class AdvancingThroughArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 1, 0, 2, 3};
        System.out.println(isAdvancingPossible(array));
    }

    public static boolean isAdvancingPossible(int[] array) {
        int lastIndex = array.length-1;
        int max_reach_so_far = 0;
        for (int i = 0; (i <= max_reach_so_far && max_reach_so_far <= lastIndex); i++) {
            max_reach_so_far = Math.max(max_reach_so_far, array[i] + i);
        }
        return max_reach_so_far >= lastIndex;
    }
}
