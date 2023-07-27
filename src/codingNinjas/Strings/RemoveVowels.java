package codingNinjas.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-26,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class RemoveVowels {

    public static void main(String[] args) {
        System.out.println(removeVowels("CoOOdingNinjas"));
    }

    public static String removeVowelsBruttForce(String str) {
        String finalStr = "";
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        List<Character> vowelsList = new ArrayList<>();
        vowelsList.add('a');
        vowelsList.add('e');
        vowelsList.add('i');
        vowelsList.add('o');
        vowelsList.add('u');
        vowelsList.add('A');
        vowelsList.add('E');
        vowelsList.add('I');
        vowelsList.add('O');
        vowelsList.add('U');

        ArrayList<Character> listChars = addStrList(str);
        listChars.removeAll(vowelsList);



        for (int i = 0; i < listChars.size(); i++) {
            finalStr += listChars.get(i);
        }

        return finalStr;
    }

    public static ArrayList<Character> addStrList(String str) {
        ArrayList<Character> listChars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            listChars.add(str.charAt(i));
        }
        return listChars;
    }

    public static String removeVowels(String str) {
        StringBuilder finalStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!isVowel(currentChar)) {
                finalStr.append(currentChar);
            }
        }

        return finalStr.toString();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}
