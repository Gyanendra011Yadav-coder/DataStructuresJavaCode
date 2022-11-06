package Arrays;

import codingBlocksQuestions.reverseArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By: Gyanendra-Yadav on 2022-11-06,Nov,2022
 */
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int sizeOfArray=sc.nextInt();
            int []array=new int[sizeOfArray];
            for(int i=0;i<sizeOfArray;i++){
                array[i]=sc.nextInt();
            }
            reverseArray(array,sizeOfArray,0,sizeOfArray-1);
            printArray(array,sizeOfArray);
            System.out.println();
            testCases--;
        }
    }

    private static void printArray(int[] array, int sizeOfArray) {
        Arrays.stream(array).forEach(value -> System.out.print(value+" "));
    }

    //Reverse An array
    private static void reverseArray(int []array, int length,int start, int end){
        //base case
        if(end<start){
            return;
        }
        int temp;
        temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        reverseArray(array,length,start+1,end-1);
    }
}
