package FirstPhaseLearning.codingNinjas.windowSliding;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-26,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class AnagramSubstringSearch {

    public static void main(String[] args) {
        System.out.println(findAnagramsIndices("BACDGABCDA", "ABCD", 11, 3));
    }

    public static ArrayList<Integer> findAnagramsIndices(String str, String ptn, int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0,Integer.MAX_VALUE);
        result.add(1,0);
        for (int i = 0; i < str.length()-ptn.length(); i++) {
            String subString=str.substring(i, (i+ptn.length()));
            boolean isAnagram=areAnagrams(subString,ptn);
            if (isAnagram) {
                if (i < result.get(0)) {
                    result.remove(0);
                    result.add(0, i);
                }
                //Updating second index
                if (result.get(1) == 0) {
                    result.remove(1);
                    result.add(1, ptn.length()-1);
                } else {
                    result.remove(1);
                    result.add(1, i );
                }
            }
//            while (j<str.length() && j<i+ptn.length()) {
//                j++;
//            }
        }
        return result;
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
