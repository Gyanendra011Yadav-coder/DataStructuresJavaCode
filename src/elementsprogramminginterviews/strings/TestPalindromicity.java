package elementsprogramminginterviews.strings;

public class TestPalindromicity {
    public static boolean isPalindromicity(String stringToCheck) {
        if (stringToCheck.isEmpty() || stringToCheck.isBlank()) {
            return false;
        }

        int idx_1 = 0, idx_2 = stringToCheck.length() - 1;
        while (idx_1 < idx_2) {
            while (idx_1 < idx_2 && (stringToCheck.charAt(idx_1) == ' ' || stringToCheck.charAt(idx_1) == ',')) {
                idx_1++;
            }
            while (idx_1 < idx_2 && (stringToCheck.charAt(idx_2) == ' ' || stringToCheck.charAt(idx_2) == ',')) {
                idx_2--;
            }

            if (Character.toLowerCase(stringToCheck.charAt(idx_1)) != Character.toLowerCase(stringToCheck.charAt(idx_2))) {
                return false;
            }
            idx_1++;
            idx_2--;
        }
        return true;
    }
}
