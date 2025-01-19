package FirstPhaseLearning.codingBlocksQuestions;
import java.util.Scanner;

/**
 * Take as input N, the size of array. Take N more inputs and
 * store that in an array. Write a recursive function which
 * returns true if the array is sorted and false otherwise.
 * Print the value returned.
 */

public class isArraySorted {
    public boolean checkSorted(int []array){
        for (int i = 0; i < array.length ; i++) {
            int temp=array[i];
            for (int j =i+1; j <array.length ; j++) {
                if (array[j]<temp){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        isArraySorted sort=new isArraySorted();
        Scanner sc =  new Scanner(System.in);
        int arraySize=sc.nextInt();
        int []array= new int[arraySize];
        for (int i = 0; i <arraySize ; i++) {
            array[i]= sc.nextInt();
        }
        boolean result=sort.checkSorted(array);
        System.out.println(result);
    }
}
