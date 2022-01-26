package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lenovo
 * @created 22/01/2022- 5:42 PM
 * @project DataStructuresJavaCode
 */
public class smartRobberProblemLeetcode168 {
    public static void main(String[] args) {
        Scanner scanObject=new Scanner(System.in);
        //Take number of test cases
        int testCase=scanObject.nextInt();
        //take number of houses as an input
        int numberOfHouse= scanObject.nextInt();
        //Array that will store the assets stored in all the houses
        int []houseAssets=new int[numberOfHouse];
        //Run Number of test cases time that we want
        while(testCase!=0){
            //taking input of assests available in all the houses
            for (int i = 0; i <numberOfHouse ; i++) {
                houseAssets[i]=scanObject.nextInt();
            }
            //initializing DP
            int []dp= new int [houseAssets.length+1];
            //filling dp with -1
            Arrays.fill(dp,-1);
            //calling the function and Priting the Value that is returned by function
            System.out.println(countRobbery(houseAssets,0,numberOfHouse,dp));
            testCase--;
        }
    }

    private static int countRobbery(int[] houseAssets, int indexStart,int numberOfHouses,int []dynamicProgramming){
        //base case 1st
        if(indexStart>=numberOfHouses){
            return 0;
        }
        //applying Dynmic Programming
        if(dynamicProgramming[indexStart]!=-1){
            return houseAssets[indexStart];
        } 
        //this is the condition that will count the RObbery of those houses by leaving one one at between
        int answer1=houseAssets[indexStart]+countRobbery(houseAssets,indexStart+2,numberOfHouses,dynamicProgramming);
        //this will count the number of profit that we earn from lefted houses
        int answer2=countRobbery(houseAssets,indexStart+1,numberOfHouses,dynamicProgramming);
        return dynamicProgramming[indexStart]=Math.max(answer1,answer2);
    }
}
