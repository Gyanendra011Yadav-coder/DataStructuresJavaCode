package gfgProblemOfTheDay;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-21,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class NonRepeatingCharacter21072023 {

    public static void main(String[] args) {
        String testCase = "hello";
        System.out.println(nonrepeatingCharacter2(testCase));
    }

    static char nonrepeatingCharacter(String S) {
        char result = '$';
        int leastFoundChar = Integer.MAX_VALUE;
        Map<Character, Integer> countCharMap = new HashMap<>();
        for (int index = 0; index < S.length(); index++) {
            if (countCharMap.containsKey(S.charAt(index))) {
                countCharMap.put(S.charAt(index), (countCharMap.get(S.charAt(index))) + 1);
            } else {
                countCharMap.put(S.charAt(index), 1);
            }
        }
        for (int i = 0; i < countCharMap.size(); i++) {
            if (countCharMap.get(S.charAt(i)) < leastFoundChar) {
                leastFoundChar = countCharMap.get(S.charAt(i));

            }
        }
        return result;
    }

    static char nonrepeatingCharacter2(String S)
    {
        char result = '$';
        int leastFoundChar = Integer.MAX_VALUE;
        int[] charCount = new int[256]; // Assuming ASCII characters
        for (int i = 0; i < S.length(); i++) {
            charCount[S.charAt(i)]++;
        } //charCount[(int)S.charAt(i)]
        for (int i = 0; i < S.length(); i++) {
            if (charCount[S.charAt(i)] == 1 && charCount[(int)S.charAt(i)] < leastFoundChar) {
                leastFoundChar = charCount[(int)S.charAt(i)];
                result = S.charAt(i);
            }
        }
        return result;
    }
}

