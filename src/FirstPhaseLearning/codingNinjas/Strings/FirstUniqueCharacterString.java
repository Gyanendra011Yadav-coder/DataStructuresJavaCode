package FirstPhaseLearning.codingNinjas.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-01,Aug,2023
 * in Project: DataStructuresJavaCode
 */

public class FirstUniqueCharacterString {

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("bbabcbcb"));
    }

    public static char firstNonRepeating(String str) {
        // Write your code here
        char[] arr = str.toCharArray();
        ArrayList<Character> freqList = new ArrayList<>();

        for (Character ch : arr) freqList.add(ch);
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (Collections.frequency(freqList, ch) == 1) {
                return ch;
            } else {
                continue;
            }
        }
        return '#';
    }


    public static char firstNonRepeatingMap(String str) {
        LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (freqMap.containsKey(currChar)) {

                freqMap.put(currChar, freqMap.get(currChar) + 1);
            } else {
                freqMap.put(currChar, 1);
            }
        }
        int minCountVal = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> val : freqMap.entrySet()) {
            if (val.getValue() == 1) return val.getKey();

            minCountVal = Math.min(minCountVal, val.getValue());
        }

        return '#';
    }
}
