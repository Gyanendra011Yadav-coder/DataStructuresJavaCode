package elementsprogramminginterviews.strings;

public class ComputerSpreadSheetColumnEncoding {
    public static int encodeColumn(String columnNameToEncode) {
        int result = 0;
        for (int idx = 0; idx < columnNameToEncode.length(); idx++) {
            int value = columnNameToEncode.charAt(idx) - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}
