package stackPrograms;

/**
 * @author Gyanendra Yadav
 * @created 07/01/2022- 12:03 AM
 * @project DataStructuresJavaCode
 */
public class rainWaterTrapping {
    public static void main(String[] args) {
        int[]heightOfBuildings={0,1,0,2,1,0,1,3,2,1,2,1};
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





    }
}
