package elementsprogramminginterviews.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// ForPhoneNumber
public class ComputeMnemonics {

    private static final Map<Character, String> mnemonicsMap = new HashMap<>();

    static {
        mnemonicsMap.putIfAbsent('2', "ABC");
        mnemonicsMap.putIfAbsent('3', "DEF");
        mnemonicsMap.putIfAbsent('4', "GHI");
        mnemonicsMap.putIfAbsent('5', "JKL");
        mnemonicsMap.putIfAbsent('6', "MNO");
        mnemonicsMap.putIfAbsent('7', "PQRS");
        mnemonicsMap.putIfAbsent('8', "TUV");
        mnemonicsMap.putIfAbsent('9', "WXYZ");
    }

    public static List<String> computeMnemonics(String mobileNumber) {
        List<String> mnemonicsResult = new ArrayList<>();
        if (mobileNumber.isEmpty() || mobileNumber.isBlank()) {
            return mnemonicsResult;
        }
        mnemonicsHelper(mobileNumber, 0, "", mnemonicsResult);

        return mnemonicsResult;
    }

    private static void mnemonicsHelper(String mobileNumber, int currentIndex, String current, List<String> result) {
        if (currentIndex == mobileNumber.length()) {
            result.add(current);
            return;
        }

        char digit = mobileNumber.charAt(currentIndex);
        String mnemonics = mnemonicsMap.get(digit);

        if (mnemonics != null) {
            /*
             for (char letter : letters.toCharArray()) {
                generateMnemonicsHelper(phoneNumber, index + 1, current + letter, result);
            }
            */
            mnemonics.chars().mapToObj(c -> (char) c).forEach(letter ->  mnemonicsHelper(mobileNumber, currentIndex + 1, current + letter, result));
        } else {
            mnemonicsHelper(mobileNumber, currentIndex + 1, (current + digit), result);
        }

    }


}
