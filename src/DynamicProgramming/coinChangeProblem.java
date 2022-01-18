package DynamicProgramming;

/**
 * @author lenovo
 * @created 14/01/2022- 9:11 PM
 * @project DataStructuresJavaCode
 */
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
        int []coins={1,2,3};
        int amountToChange=10;
        int index=0;
        int [][]dynamicProgramming= new int[amountToChange+1][coins.length];
        System.out.println(numberOfCoinsRequired(coins,amountToChange, index));
    }

    private static int numberOfCoinsRequired(int[] coins, int amountToChange, int index) {


        return 0;
    }
}
