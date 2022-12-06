package Searching;

import java.util.Scanner;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-30,Nov,2022
 * in Project: DataStructuresJavaCode
 */
public class GeekAndMarks {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        int testCase=scannerObject.nextInt();
        while(testCase!=0){
            int numberOfStudents = scannerObject.nextInt();
            int studentNumber = scannerObject.nextInt();
            int []studentMarks = new int[numberOfStudents];
            for (int i = 0; i <numberOfStudents ; i++) {
                studentMarks[i] = scannerObject.nextInt();
            }
            System.out.println(totalNumber(studentMarks,numberOfStudents,studentNumber));
            testCase--;
        }
    }

    public static int totalNumber(int []array, int n, int x){
        int result = 0;
        for (int i = 0; i <n ; i++) {
            if(array[i]>x){
                result++;
            }
        }
        return result;
    }
}
