package SemisterFifthLabAssignment;

import java.util.Scanner;

/**
 * @author Gyanendra Yadav
 * @created 09/12/2021- 1:51 PM
 * @project DataStructuresJavaCode
 */
public class activitySelectionProblem {


    public static void activitySelect(int []activityName, int[]startTime, int []finishTime){

    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int length =scannerObject.nextInt();
        int []activityName=new int[length];
        int []startTime=new int[length];
        int []finishTime= new int[length];
        activitySelect(activityName,startTime,finishTime);
        System.out.println("Name:"+"Gyanendra Yadav");
        System.out.println("Roll Number:"+"191500309(61)");
    }
}
