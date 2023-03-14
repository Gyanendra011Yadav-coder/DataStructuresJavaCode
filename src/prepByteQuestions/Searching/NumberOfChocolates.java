package prepByteQuestions.Searching;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-14,Mar,2023
 * in Project: DataStructuresJavaCode
 */
public class NumberOfChocolates {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int lenArr = scanner.nextInt();
        int[] chocPrice = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            chocPrice[i] = scanner.nextInt();
        }
        int numRuppe = scanner.nextInt();
        //1. Firstly, Sorting the Array
        Arrays.sort(chocPrice);
        while (numRuppe != 0) {
            int moneyHaveBuyChoc = scanner.nextInt();
            System.out.println(findNumChocBuy(chocPrice, moneyHaveBuyChoc));
            numRuppe--;
        }
    }

    private static int findNumChocBuy(int[] choclPrice, int moneyHaveBuyChoc) {
        int numOfChocBuy = 0;
        for (int i = 0; i < choclPrice.length; i++) {
            if (choclPrice[i] > moneyHaveBuyChoc) {
                return numOfChocBuy;
            } else {
                numOfChocBuy++;
            }
        }
        return numOfChocBuy;
    }

    //2. Not sorting iterating for each amount to count
    private static int findNumChocBuy2(int[] choclPrice, int moneyHaveBuyChoc) {
        System.out.println("Getting Array=");
        for(int ele:choclPrice) System.out.print(","+ele);
        System.out.println();
        int numOfChocBuy = 0;
        for (int i = 0; i < choclPrice.length; i++) {
            if (choclPrice[i]<=moneyHaveBuyChoc) {
                numOfChocBuy++;
            }
        }
        return numOfChocBuy;
    }
}
