package elementsprogramminginterviews.strings;

public class InterconvertStringToInt {
    public static int convertStringToInt(String strContent) {
        int result = 0;
        int strLen = strContent.length();

        if (strContent.isBlank()) {
            return result;
        } else if (strContent.length() == 1) {
            return strContent.charAt(0);
        }

        // Handling negative numbers
        for (int idx_begin = strContent.charAt(0) == '-' ? 1 : 0; idx_begin < strLen; idx_begin++) {
            int digit = strContent.charAt(idx_begin) - '0';
            result = result * 10 + digit;
        }

        return strContent.charAt(0) == '-' ? -result : result;
    }

    public static String convertIntToString(int numberConvert) {
        boolean isNegative = false;
        String result = "";
        if (numberConvert < 0) {
            numberConvert *= -numberConvert;
            isNegative = true;
        }

        while (numberConvert != 0) {
            result += numberConvert % 10;
            numberConvert /= 10;
        }
        result= reverseString(result);
        return isNegative ? '-' + result : result;
    }
    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }


}
