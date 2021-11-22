package codingBlocksQuestions;

import java.util.Scanner;

/**
 * This is the Qus in which we will get an String as an input and we will
 * Have to replace all the Pi with 3.14.
 */
public class replacePiWithThreePointOneFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(replace(str));
    }

    private static String replace(String str) {
        String resultantSring = " ";
        int lenString= str.length();
        for (int i = 0; i <lenString; i++) {
            if (i + 1 < lenString && str.charAt(i) == 'p' && str.charAt(i + 1) == 'i') {
                resultantSring = resultantSring + "3.14";
                i++;
            }else{
                resultantSring=resultantSring+str.charAt(i);
            }
        }
        return resultantSring;
    }
}
