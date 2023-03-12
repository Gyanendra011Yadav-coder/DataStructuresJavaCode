package prepByteQuestions.Searching;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-12,Mar,2023
 * in Project: DataStructuresJavaCode
 *---------------------------------------------------------
 * Input:
 * First-line contains N
 * The second line contains N space-separated integers.
 * The third line contains K
 *--------------------------------------------------------
 * Output
 * Print the smallest number in the array which occurs exactly K times in an array.
 */
public class SmallestNumber {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //Taking inputs from user
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        int numTimesSearch = scanner.nextInt();

        //Start solving the problem
        Arrays.sort(array);
        Map<Integer, Integer> valOccur = findOccurrence(array);
        for (Map.Entry<Integer, Integer> entry : valOccur.entrySet()) {
            if (entry.getValue() >= numTimesSearch) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    private static Map<Integer, Integer> findOccurrence(int[] array) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (result.containsKey(array[i])) {
                result.put(array[i], result.get(array[i]) + 1);
            } else {
                result.put(array[i], 1);
            }
        }
        return result;
    }
}
