package codingNinjas.BasicAlgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-10,Aug,2023
 * in Project: DataStructuresJavaCode
 *
 * 4
 * AE
 * BADE
 *
 * AB
 * AC
 *
 * CB
 * BCDE
 *
 * ABC
 * AHBDGC
 */
public class IsSubSequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("AVVVV","DVVVV"));
        System.out.println(isSubsequence("AE","BADE"));
    }
    public static String isSubsequenceBruttForce(String str1, String str2) {
        String result = "False";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i)==str2.charAt(j) && (j>=i)){
                    result="True";
                    break;
                }else if(str1.charAt(i)==str2.charAt(j) && (j<i)){
                    result="False";
                    return result;
                }
                else{
                    result ="False";
                }
            }
        }
        return result;
    }

    public static String isSubsequence(String str1, String str2) {
        int j = 0, n = str1.length();
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == str1.charAt(j)) j++;
            if (j == n) return "True";
        }

        return "False";

    }


}
