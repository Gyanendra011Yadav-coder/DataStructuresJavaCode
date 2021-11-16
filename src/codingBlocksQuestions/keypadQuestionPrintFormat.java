package codingBlocksQuestions;

import java.util.Scanner;

public class keypadQuestionPrintFormat {
    public static void printSTR(String inp, String out) {
        String s[] = {" ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (inp.length() == 0) {
            System.out.println(out);
            return;
        }
        char ch = inp.charAt(0);
        String ros = inp.substring(1); //doubt
        String str = s[ch - '0'];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            printSTR(ros, out + c);

        }
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        printSTR(str, "");
    }
    }

