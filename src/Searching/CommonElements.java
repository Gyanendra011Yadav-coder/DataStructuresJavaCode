package Searching;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-11,Mar,2023
 * in Project: DataStructuresJavaCode
 */
public class CommonElements {

    public static void main(String[] args) {

        int [] A = {1, 5, 10, 20, 40, 80};
        int [] B = {6, 7, 20, 80, 100};
        int [] C = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(commonElements(A, B, C, A.length, B.length, C.length));
    }
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> duplicates = new ArrayList<Integer>(); // will be using this to store the duplicate values in the arrays
        int cmnEle=0; //variable to store tempValue to compare in other arrays

        for (int i = 0; i <n1 ; i++) {
            cmnEle=A[i];
            for (int j = 0; j <n2; j++) {
                int finalCmnEle = cmnEle;
                if(IntStream.of(B).anyMatch(x -> x == finalCmnEle)){
                    for (int k = 0; k <n3 ; k++) {
                        int finalCmnEle1 = cmnEle;
                        if(IntStream.of(C).anyMatch(x -> x == finalCmnEle1)){
                            duplicates.add(cmnEle);
                        }
                    }
                }
            }
        }
        return duplicates;
    }

    static int maxInThree(int n1, int n2, int n3){
        int max =0;
        max = (n1>n2) ? n1 :  n2; //checking greater element among the two elements
        return Math.max(max,n3); // returning the final greater element
    }
}
