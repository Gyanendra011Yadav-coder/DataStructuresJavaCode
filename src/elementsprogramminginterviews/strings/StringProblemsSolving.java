package elementsprogramminginterviews.strings;

public class StringProblemsSolving {
    static boolean isPalindrome(String string) {
        int back_track_idx = string.length() - 1;
        for (int front_track_idx = 0; front_track_idx < back_track_idx; ++front_track_idx, --back_track_idx) {
            if (string.charAt(front_track_idx) != string.charAt(back_track_idx)) {
                return false;
            }
        }
        return true;
    }
}

