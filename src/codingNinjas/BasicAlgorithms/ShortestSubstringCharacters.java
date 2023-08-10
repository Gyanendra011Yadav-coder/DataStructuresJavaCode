package codingNinjas.BasicAlgorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-07,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class ShortestSubstringCharacters {
    public static void main(String[] args) {
        System.out.println(shortestSubstring(""));
    }

    public static String shortestSubstring(String s) {
        Set<Character> createUniqueSet = new HashSet<Character>();
        StringBuilder reslt = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            createUniqueSet.add(s.charAt(i));
        }
        for (Character c : createUniqueSet) {
            reslt.append(c);
        }
        return String.valueOf(reslt);
    }
}
