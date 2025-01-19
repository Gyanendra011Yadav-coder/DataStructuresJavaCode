package FirstPhaseLearning.BasicPrograms;

import java.util.Scanner;

public class sumOfdigitsUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result =sumOfDigits(number);
        System.out.println(result);

    }

    public static  int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        int sum = 0;
        sum += number % 10 ;
        return sum+sumOfDigits(number/10);

    }
}
