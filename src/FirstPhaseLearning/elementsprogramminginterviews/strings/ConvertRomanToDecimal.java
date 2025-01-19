package FirstPhaseLearning.elementsprogramminginterviews.strings;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToDecimal {
    private static final Map<Character, Integer> romanNumberMap = new HashMap<>();

    static {
        romanNumberMap.put('I', 1);
        romanNumberMap.put('V', 5);
        romanNumberMap.put('X', 10);
        romanNumberMap.put('L', 50);
        romanNumberMap.put('C', 100);
        romanNumberMap.put('D', 500);
        romanNumberMap.put('M', 1000);
    }

    public static int convertRomanNumber(String romanNumber) {
        int result = 0;
        char[] romanChars = romanNumber.toCharArray();
        for (int i = romanChars.length - 2; i >= 0; i--) {
            if (romanNumberMap.get(romanChars[i]) < romanNumberMap.get(romanChars[i + 1])) {
                result -= romanNumberMap.get(romanChars[i]);
            } else {
                result += romanNumberMap.get(romanChars[i]);
            }
        }
        return result + romanNumberMap.get(romanChars[romanChars.length - 1]);
    }
}