package DynamicProgramming;

import java.util.Scanner;

public class stairCaseProblem {
    //Fibonacci Number
    public static int fibonacciNumber(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
    }

    //Method that will be called to Find out Stairs Required
    public static int countStairs(int numberOfStairs) {
        return fibonacciNumber(numberOfStairs + 1);
    }

    //Main Method of The Class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stairs = sc.nextInt();
        System.out.println(countStairs(stairs));
    }
}
