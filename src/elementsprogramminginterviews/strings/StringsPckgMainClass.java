package elementsprogramminginterviews.strings;

public class StringsPckgMainClass {
    private static char[] charArray = {'a', 'b', 'a', 'c', ' '};
    private static char[] charArray_2 = {'a', 'c', 'a', 'a', ' ', ' ', ' '};

    public static void main(String[] args) {
        System.out.println("isPalindrome: " + StringProblemsSolving.isPalindrome(" hsgsvghsvgsvsgvsgsvghsv bbshbhssh "));
        System.out.println("Convert String to integer: " + InterconvertStringToInt.convertStringToInt("123"));
        System.out.println("Convert String to integer: " + InterconvertStringToInt.convertIntToString(123));
        System.out.println("Convert String to integer: " + ComputerSpreadSheetColumnEncoding.encodeColumn("AAA"));
        System.out.println("Updated Characters in array is: " + ReplaceAndRemove.replaceAndRemove(charArray_2, 4));
        System.out.println("Updated Characters in array is: " + TelexEncoding.telexEncoding(".?#,?."));
    }
}