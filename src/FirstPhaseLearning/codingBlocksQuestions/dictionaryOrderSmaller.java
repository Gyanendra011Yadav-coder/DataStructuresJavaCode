package FirstPhaseLearning.codingBlocksQuestions;

/**
 * Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the characters of this string which are in dictionary order smaller than the given string.
 * The output strings must be lexicographically sorted.
 *
 * Sample Input:-
 * cab
 * Sample Output:-
 * abc
 * acb
 * bac
 * bca
 */

public class dictionaryOrderSmaller{
    private static void printSubstrings(String inp, String out) {
        if(inp.length()==0){
            System.out.println(out);
            return;
        }
        printSubstrings(inp, out);
    }
    public static void main(String[] args) {
        printSubstrings("abc", "");
    }
}
