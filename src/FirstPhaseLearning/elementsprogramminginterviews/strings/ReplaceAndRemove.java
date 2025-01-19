package FirstPhaseLearning.elementsprogramminginterviews.strings;

public class ReplaceAndRemove {
    private static final char A_CHAR = 'a';
    private static final char B_CHAR = 'b';

    public ReplaceAndRemove() { } // constructor

    public static int replaceAndRemove(char[] arrayToUpdate, int charToUpdate) {
        int updatedChars;

        int write_idx = 0, a_count = 0;

        // Remove all the b characters from the array
        for (int idx = 0; idx < charToUpdate; idx++) {

            if (arrayToUpdate[idx] != B_CHAR) {
                arrayToUpdate[write_idx++] = arrayToUpdate[idx];
            }

            if (arrayToUpdate[idx] == (A_CHAR)) { // keep tracking of a count
                a_count++;
            }

        }

        // Here Replacing a with double ds
        int curr_indx = write_idx - 1;
        write_idx = write_idx + a_count - 1;
        updatedChars = write_idx + 1;
        while (curr_indx >= 0) {
            if (arrayToUpdate[curr_indx] == (A_CHAR)) {
                arrayToUpdate[write_idx--] = 'd'; //Adding first d
                arrayToUpdate[write_idx--] = 'd'; // Adding second d
            } else {
                arrayToUpdate[write_idx--] = arrayToUpdate[curr_indx];
            }

            curr_indx--;
        }

        return updatedChars;
    }
}
