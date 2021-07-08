package stackPrograms;

import java.util.Scanner;
import java.util.Stack;

public class angularBracketCheck {
    static int angularBracket(String str) {
        int count = 0;
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                stack.push(str.charAt(i));
            } else if (!stack.isEmpty() && str.charAt(i) == '>' && stack.peek().equals('<')) {
                count += 2;
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }
        return count;
//        if (stack.isEmpty()) {
//            return count;
//        } else
//            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase != 0) {
            int length = sc.nextInt();
            String str = sc.next();
            if (str.length()==length) {
                System.out.println(angularBracket(str));
            }
        testCase--;
        }
    }
}