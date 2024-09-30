package elementsprogramminginterviews.strings;

/**
 * @author : Gyanendra_Yadav
 * input: ".?,"
 * output: DOT QUESTIONMARK COMMA
 */
public class TelexEncoding {
    public static String telexEncoding(String str_to_encode) {
        String encoded_str = "";
        if (str_to_encode.isEmpty()) {
            return encoded_str;
        }
        for (int i = 0; i < str_to_encode.length(); i++) {
            char c = str_to_encode.charAt(i);
            if (c == '.') {
                encoded_str += "DOT" + " ";
            } else if (c == '#') {
                encoded_str += "HASH-TAG" + " ";
            } else if (c == '?') {
                encoded_str += "QUESTION-MARK" + " ";
            } else if (c == '!') {
                encoded_str += "EXCLAMATION-MARK" + " ";
            } else if (c == ',') {
                encoded_str += "COMMA" + " ";
            } else {
                encoded_str += "UNKNOWN_MARK" + " ";
            }
        }

        return encoded_str;
    }
}
