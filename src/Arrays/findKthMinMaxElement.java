package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays Qus No-03 **LOve BABBAR BHAIIYA SHEET**
 */
public class findKthMinMaxElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kthElementFind=sc.nextInt();
         int []array={9,8,6,7,1,2,3};
         findElement(array,kthElementFind);
    }

    private static void findElement(int[] array,int position){
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
        System.out.println("Minimum Element is"+","+array[position-1]+" ");
        int temp= 0;
        int len= array.length;
        while(temp!=position){
            len--;
            temp++;
        }
        System.out.println("Maximum Element is"+","+array[len]);

    }
}
