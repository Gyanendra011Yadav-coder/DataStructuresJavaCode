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
        System.out.println("Enter The Name Of The Activities:-");
        System.out.println("Ativities Name Should Be Different with each other\n"+
                "Try Not Forget To Specify 1,2.... After The Activity Name.");
        for (int i = 0; i <length; i++) {
            activityName[i]=scannerObject.nextInt();
        }
        System.out.println("Now,Enter The Starting Time Of The Activities:-");
        for (int j = 0; j <length ; j++) {
            startTime[j]= scannerObject.nextInt();
        }
        System.out.println("Enter The Finishing Time Of The activities:-");
        for (int k = 0; k <length ; k++) {
            finishTime[k]=scannerObject.nextInt();
        }
        activitySelect(activityName,startTime,finishTime);
        System.out.println("Name:"+"Gyanendra Yadav");
        System.out.println("Roll Number:"+"191500309(61)");
    }
}
