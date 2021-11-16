package codingBlocksQuestions;

import java.util.Scanner;

/**
 * Take as input N, the size of array. Take N more inputs and store that in an array.
 * Take as input M, a number. Write a recursive function which returns an array containing
 * indices of all items in the array
 * which have value equal to M. Print all the values in the returned array.
 */
public class returnIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int []array=new int[arrayLength];
        for (int i = 0; i <arrayLength; i++) {
            array[i]=sc.nextInt();
        }
    }
}
