package FirstPhaseLearning.stackPrograms;

/**
 * @author Gyanendra Yadav
 * @created 07/01/2022- 12:03 AM
 * @project DataStructuresJavaCode
 */
public class rainWaterTrapping {
    public static void main(String[] args) {
        int[]heightOfBuildings={4,2,0,3,2,5};
        System.out.println(findRainWaterTrapping(heightOfBuildings));
    }

    private static int findRainWaterTrapping(int[] heightOfBuildings) {
//this variable will store the Number of Buildings there
        int numberOfBuildings=heightOfBuildings.length;
 //Maximum height of the Buildings from left
        int []leftBuildings=new int[numberOfBuildings];
 // Maximum Height Of Buildings from right
        int []rightBuildings= new int[numberOfBuildings];
// Storing the value at the first index of the leftBuildings Array
        leftBuildings[0]=heightOfBuildings[0];
// Now, we will count the maximum number of Heights of the Buildings at the left side
        for (int i = 1; i<numberOfBuildings ; i++) {
            leftBuildings[i]=Math.max(leftBuildings[i-1],heightOfBuildings[i]);
        }
//Now, we will count the maximum number of Heights of the Buildings at the right side
        rightBuildings[numberOfBuildings-1]=heightOfBuildings[numberOfBuildings-1];
        for (int i=numberOfBuildings-2; i>=0 ; i--) {
            rightBuildings[i]=Math.max(rightBuildings[i+1],heightOfBuildings[i]);
        }
//Now,we will count the number of water traps
        int countWaterStore=0;
        for (int i = 0; i<heightOfBuildings.length; i++) {
            countWaterStore+=(Math.min(leftBuildings[i],rightBuildings[i])-heightOfBuildings[i]);
        }
    return countWaterStore;
    }
}
