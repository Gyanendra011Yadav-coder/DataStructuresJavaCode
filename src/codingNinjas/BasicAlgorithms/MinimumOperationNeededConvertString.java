package codingNinjas.BasicAlgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-10,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class MinimumOperationNeededConvertString {

    public static void main(String[] args) {
        System.out.println(minCostToGivenString("IFDfxPCdNvCNXPe","NFfPICxeCNDdXPv"));
    }

    static int minCostToGivenString(String str1, String str2) {
        if (str1.length() < str2.length()) return -1;
        int count = 0;
        int index1 = 0;
        int index2 = 0;
        while (index1 < str1.length() && index2 < str2.length()) {
            if (str1.charAt(index1) == str2.charAt(index2)) {
                index1++;
                index2++;
            } else {
                count++;
                index1++;
            }
        }
        return count;
    }

    public static int minCostToGivenStringBrutt(String str1, String str2) {

        //Base case
        if (str1.length() != str2.length()) {
            return 0;
        }

        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            charList.add(str1.charAt(i));
        }
//        List<Character> list = List.of(str1.toCharArray());
        int numOperations = 0;

        for (int i = 0; i < str2.length(); i++) {

            int index = charList.indexOf(str2.charAt(i));

            //1. If index is same then do nothing else change
            if (index != i) {
                Character temp = charList.get(index);
                charList.remove(index);
                charList.add(index, charList.get(i));
                charList.remove(i);
                charList.add(i, temp);
                numOperations++;
            }
        }
        return numOperations;
    }


}
