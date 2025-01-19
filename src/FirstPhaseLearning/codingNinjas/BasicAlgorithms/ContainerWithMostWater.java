package FirstPhaseLearning.codingNinjas.BasicAlgorithms;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-05,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height={4,3,2,1,4};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int result=Integer.MIN_VALUE;
        for (int index1 = 0; index1 < height.length ; index1++) {
            for (int index2 = index1+1; index2 < height.length; index2++) {
                int minVal=Math.min(height[index1], height[index2]);
                result=Math.max(result,(minVal*(index2-index1)));;
            }
        }
        return result;
    }
}
