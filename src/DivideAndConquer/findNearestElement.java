package DivideAndConquer;

import java.util.Scanner;

public class findNearestElement {
    public int findNearestElement(int []array, int elementCompare){
        int low=0, high=array.length-1;
        if (array[0]>elementCompare){
            return array[0];
        }
        else if(elementCompare>array[high]){
            return array[high];
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    }
}
