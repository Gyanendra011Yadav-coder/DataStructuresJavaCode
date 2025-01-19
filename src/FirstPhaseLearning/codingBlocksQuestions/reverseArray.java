package FirstPhaseLearning.codingBlocksQuestions;

import java.util.Scanner;

//Take as input N, a number. Take N more inputs and store that in an array.
// Write a recursive function which reverses the array. Print the values of reversed array.
public class reverseArray {

    public static int returnIndex(int[] array, int startingIndex, int serachKey) {
        int length = array.length;
        if (startingIndex > length && startingIndex < 0) {
            return -1;
        }

        if (array[startingIndex] == serachKey) {
            System.out.println(startingIndex);
        }
        return returnIndex(array, startingIndex++, serachKey);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextInt();
        }
        int searchingKey = sc.nextInt();
        returnIndex(array, 0, searchingKey);
    }
}

