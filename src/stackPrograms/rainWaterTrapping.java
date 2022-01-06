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





    }
}
