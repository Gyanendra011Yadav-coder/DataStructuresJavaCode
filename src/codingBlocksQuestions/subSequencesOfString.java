package codingBlocksQuestions;

import java.util.Scanner;

public class subSequencesOfString {

    public static void main(String[] args) {
        subSequencesOfString sub = new subSequencesOfString();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sub.generate(str);
    }

    private void generate(String word) {
        int count=0;
        if (word.length() == 0) {
            System.out.println(word+" ");
            return;
        } else {
            count++;
            System.out.print(word+" ");
            generate(word.substring(0, word.length() - 1));
            generate(word.substring(1, word.length()));
        }

    }
}
