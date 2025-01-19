package hackerRankGLAContest;

import java.util.Scanner;

/**
 * @author lenovo
 * @created 07/02/2022- 5:18 PM
 * @project DataStructuresJavaCode
 *
 * Write a program for the given integers P and X,
 * that display the positive integer pairs (i, j) with satisfy the following conditions.
 */
public class question1 {
    public static void main(String[] args) {
       Scanner scannerObject= new Scanner(System.in);
       int p=scannerObject.nextInt();
       int x= scannerObject.nextInt();
        int mid=p/2;
        int firstNum=mid;
        int secondNum=mid;
        while(myXOR(firstNum,secondNum)!=x){
            firstNum=firstNum;
            secondNum=secondNum-1;
        }
        if(myXOR(firstNum,secondNum)==x){
            System.out.println(firstNum);
            System.out.println(secondNum);
        }else{
            System.out.println("Not Found..");
        }
    }
    public static int myXOR(int x, int y)
    {
        int res = 0;
        for(int i = 31; i >= 0; i--)
        {
            int b1 = ((x & (1 << i)) == 0 ) ? 0 : 1;
            int b2 = ((y & (1 << i)) == 0 ) ? 0 : 1;
            int xoredBit = ((b1 & b2) != 0) ? 0 : (b1 | b2);
            res <<= 1;
            res |= xoredBit;
        }
        return res;
    }
}
