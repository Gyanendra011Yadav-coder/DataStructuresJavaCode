package FirstPhaseLearning.SemisterFifthLabAssignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gyanendra Yadav
 * @created 09/12/2021- 1:51 PM
 * @project DataStructuresJavaCode
 */
public class activitySelectionProblem {
    //Method to Perform ActivitySelection In The Class
    public static void activitySelect( int[] startTime, int[] finishTime,int length) {
        Arrays.sort(finishTime);
        int i,j;
        i=0;
        System.out.println(i);
        for (j = 1; j < length; j++) {
            if (startTime[j]>=finishTime[i]){
                System.out.println(j);
                i=j;
            }
        }
    }
//Main Method of The Class
    public static void main(String[] args) {
        System.out.println("Name:" + "Gyanendra Yadav");
        System.out.println("Roll Number:" + "191500309(61)");
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter The Number Of Ativites You Want To Enter:-");
        int length = scannerObject.nextInt();
        int[] startTime = new int[length];
        int[] finishTime = new int[length];
        System.out.println("Enter The Starting Time Of The Activities:-");
        for (int j = 0; j < length; j++) {
            startTime[j] = scannerObject.nextInt();
        }
        System.out.println("Enter The Finishing Time Of The activities:-");
        for (int k = 0; k < length; k++) {
            finishTime[k] = scannerObject.nextInt();
        }
        activitySelect( startTime, finishTime, length);

    }
}
