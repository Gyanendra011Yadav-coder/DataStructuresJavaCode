package FirstPhaseLearning.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-23,Nov,2022
 * in Project: DataStructuresJavaCode
 *
 *****************************************************************
 * Given a string w, integer array b,  character array x and an integer n. n is the size of array b and
 * array x. Find a substring which has the sum of the ASCII values of its every character, as maximum.
 * ASCII values of some characters are redefined.
 *
 * Input:
 * W = abcde
 * N = 1
 * X[] = { 'c' }
 * B[] = { -1000 }
 * Output:
 *
 * Explanation:
 * Substring "de" has the
 * maximum sum of ascii value,
 * including c decreases the sum value
 *****************************************************************
 */
public class SaveYourLife {
    public static void main(String[] args) {
//        String W = "abcde" ;
//        int N = 1;
//        char X[] = { 'c' };
//        int B[] = { -1000 };
//        System.out.println(maxSum(W,X,B,N));

//        String W = "oK" ;
//        int N = 2;
//        char X[] = { 'K' ,'o' };
//        int B[] = { -880 ,53 };
//        System.out.println(maxSum(W,X,B,N));

        String W = "Tmb" ;
        int N = 2;
        char X[] = { 'm','b' };
        int B[] = { -746,-631 };
        System.out.println(maxSum(W,X,B,N));

    }


    static String maxSum(String w,char x[],int b[], int n){
        //code here
        String currentResult ="";
        String overallResult="";
        //Try to solve
        int currentMax = Integer.MIN_VALUE;
        int overallMax=Integer.MIN_VALUE;
        for (int i = 0; i <w.length() ; i++) {
            int index=-12;
            index=Arrays.binarySearch(x,w.charAt(i));
                if (currentMax >= 0) {
                    if(index>=0) {
                        currentResult += String.valueOf(w.charAt(i));
                        currentMax += b[index];
                    }else{
                        currentResult += String.valueOf(w.charAt(i));
                        currentMax += (int) w.charAt(i);
                    }
                }else{
                    if(index>=0) {
                        currentResult = String.valueOf(w.charAt(i));
                        currentMax = b[index];
                    }else{
                        currentResult = String.valueOf(w.charAt(i));
                        currentMax = (int) w.charAt(i);
                    }
                }
                if(currentMax>overallMax){
                    overallMax = currentMax;
                    overallResult=currentResult;
                }
            }
        return overallResult;
    }

    static String maxSum2(String w, char X[], int B[], int n) {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            map.put(X[i], B[i]);
        }
        char ch = w.charAt(0);
        int maxSum = map.containsKey(ch) ? map.get(ch) : Integer.valueOf(ch);
        int sum = maxSum;
        String str = ch + "";
        String finalStr = ch + "";
        for (int i = 1; i < w.length(); i++) {
            ch = w.charAt(i);
            if (sum < 0) {
                sum = map.containsKey(ch) ? map.get(ch) : Integer.valueOf(ch);
                str = ch + "";
            } else {
                sum = sum + (map.containsKey(ch) ? map.get(ch) : Integer.valueOf(ch));
                str = str + ch;
            }
            if (sum > maxSum) {
                maxSum = sum;
                finalStr = str;
            }
        }
        return finalStr;

    }

}
