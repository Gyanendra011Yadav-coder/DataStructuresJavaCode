package FirstPhaseLearning.codingNinjas.problemOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-19,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class NinjaGameWords {
    public static ArrayList<Integer> getFrequency(String str, ArrayList<String> words, int n) {
        ArrayList<Integer> frequencies = new ArrayList<>();

        for (String word : words) {
            int frequency = 0;
            int index = str.indexOf(word);
            while (index != -1) {
                frequency++;
                index = str.indexOf(word, index + 1);
            }
            frequencies.add(frequency);
        }

        return frequencies;
    }

    public static ArrayList<Integer> getFrequency2(String str, ArrayList<String> words, int n) {
        ArrayList<Integer> frequencies = new ArrayList<>();
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        // Split the input string into words and convert to lowercase
        String[] strWords = str.split(" ");

        // Update frequencies in the FirstPhaseLearning.HashMap
        for (String word : strWords) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        // Retrieve frequencies for each word in the 'words' list
        for (String word : words) {
            frequencies.add(wordFrequencyMap.getOrDefault(word, 0));
        }

        return frequencies;
    }


    public static void main(String[] args) {
        String str = "Hi i am ninja and i love coding";
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Ninja", "m"));
        int n = 3;

        ArrayList<Integer> result = getFrequency2(str, words, n);
        System.out.println(result); // Output: [1, 3, 1]
    }

}
