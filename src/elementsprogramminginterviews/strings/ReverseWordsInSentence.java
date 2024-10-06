package elementsprogramminginterviews.strings;

public class ReverseWordsInSentence {

    public static String reverseSentence(String stringToReverse) {
        String[] words = stringToReverse.split(" ");
        StringBuilder resultantString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            resultantString.append(words[i]);
            if (i > 0) {
                resultantString.append(" ");
            }
        }
        return resultantString.toString();
    }

    public static String reverseSentence2(String stringToReverse) {
        int index_1 = stringToReverse.length() - 1, index_wrd_rvrse_start, idx_temp;
        StringBuilder resultantString = new StringBuilder();
        while (index_1 >= 0) {
            index_wrd_rvrse_start = index_1;
            while (index_wrd_rvrse_start > 0 && stringToReverse.charAt(index_wrd_rvrse_start - 1) != ' ') {
                index_wrd_rvrse_start--;
            }
            idx_temp = index_wrd_rvrse_start;
            resultantString.append(reverseWord(stringToReverse, index_wrd_rvrse_start, index_1 + 1)).append(" ");
            index_1 = idx_temp;
            index_1 -= 2;
        }
        return resultantString.toString();
    }

    public static String reverseWord(String wordToReverse, int idx_begin, int idx_end) {
        return wordToReverse.substring(idx_begin, idx_end);
    }
}
