package codingBlocksQuestions;
import java.util.Scanner;
/***
 * Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number.
 * Write a recursive function which returns
 * the last index at which M is found in the array and -1 if M is not found anywhere. Print the value returned.
 */
public class lastIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sizeOfArray=sc.nextInt();
        int []array = new int[sizeOfArray];
        for (int i = 0; i <sizeOfArray ; i++) {
            array[i]=sc.nextInt();
        }
        int searchingNumber=sc.nextInt();
        int index=0;
        int resultingIndex=-1;
       while(index!=sizeOfArray) {
            if(array[index]==searchingNumber){
                resultingIndex=index;
            }
            index++;
        }
        System.out.println(resultingIndex);
    }
}
