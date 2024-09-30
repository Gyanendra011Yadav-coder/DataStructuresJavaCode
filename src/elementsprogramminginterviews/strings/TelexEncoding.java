package elementsprogramminginterviews.strings;

/**
 * @author : Gyanendra_Yadav
 * input: ".?,"
 * output: DOT QUESTIONMARK COMMA
 */
public class TelexEncoding {
    public static String telexEncoding(String strToEncode) {
        StringBuilder encoded_str = new StringBuilder();
        if (strToEncode.isEmpty()) {
            return encoded_str.toString();
        }
        for (int i = 0; i < strToEncode.length(); i++) {
            char c = strToEncode.charAt(i);
            if (c == '.') {
                encoded_str.append("DOT" + " ");
            } else if (c == '#') {
                encoded_str.append("HASH-TAG" + " ");
            } else if (c == '?') {
                encoded_str.append("QUESTION-MARK" + " ");
            } else if (c == '!') {
                encoded_str.append("EXCLAMATION-MARK" + " ");
            } else if (c == ',') {
                encoded_str.append("COMMA" + " ");
            } else {
                encoded_str.append("UNKNOWN_MARK" + " ");
            }
        }

        return encoded_str.toString();
    }
}
