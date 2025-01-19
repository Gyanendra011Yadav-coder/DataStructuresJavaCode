package FirstPhaseLearning.DynamicProgramming;

/**
 * @author Gyanendra Yadav
 * @created 14/01/2022- 9:11 PM
 * @project DataStructuresJavaCode
 */

import java.util.Arrays;
import java.util.Scanner;

/***
public class coinChangeProblem {
    //this is the main method of the class
    public static void main(String[] args) {
        int []coins={1,2,3};
        int amountToChange=10;
        int index=0;

        System.out.println(numberOfCoinsRequired(coins,amountToChange, index));
    }
//method that will return Number of Coins required
    private static int numberOfCoinsRequired(int[] coins, int amountToChange, int index) {
        //base case
        if(amountToChange==0){
            return 1;
        }
        if(index==coins.length){
            return 0;
        }
        //variables that will count if the coin we are counting or not
        int include=0;
        int exclude=0;
        //this will be running if we are including the coin
        if(amountToChange>=coins[index]){
            include=numberOfCoinsRequired(coins,amountToChange-coins[index],index);
        }
        //this will running if we will not be including coin
        exclude=numberOfCoinsRequired(coins,amountToChange,index+1);

        return include+exclude;
        }
}
 */

// Solution Using Dynamic Programming
class coinChangeProblem{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int amountToChange=sc.nextInt();
        int numberOfCoins=sc.nextInt();
        int []coins=new int[numberOfCoins];
        for (int i = 0; i <numberOfCoins ; i++) {
            coins[i]= sc.nextInt();
        }
        int [][]dynamicProgramming= new int[amountToChange+1][coins.length];
        for(int []arr: dynamicProgramming){
            Arrays.fill(arr,-1);
        }
        System.out.println(numberOfCoinsRequired(coins,amountToChange, 0, dynamicProgramming));
    } 

    private static int numberOfCoinsRequired(int[] coins, int amount, int index, int [][]dp) {
        if (amount == 0) {
            return 1;
        }
        if (index == coins.length) {
            return 0;
        }

        if (dp[amount][index] != -1) {
            return dp[amount][index];
        }
        int inc = 0;
        int exc = 0;

        if (amount >= coins[index]) {
            inc = numberOfCoinsRequired(coins, amount - coins[index], index, dp);
        }
        exc = numberOfCoinsRequired(coins, amount, index + 1, dp);
        return dp[amount][index] = inc + exc;
    }
}
