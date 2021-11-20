package codingBlocksQuestions;

import java.util.Scanner;

public class recursionSubSequnces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = subSequnces(str,"",0);
        System.out.print(" ");
        System.out.print(ans);
    }
    public static int subSequnces(String string, String rest, int index){
        if(index == string.length()) {
            System.out.print(rest + " ");
            return 1;
        }
        int c =0;
        char character = string.charAt(index);
        c+= subSequnces(string, rest, index +1);
        c+= subSequnces(string, rest + character, index +1);
        c+= subSequnces(string, rest +(int) character, index +1);
        return c;
    }
}
