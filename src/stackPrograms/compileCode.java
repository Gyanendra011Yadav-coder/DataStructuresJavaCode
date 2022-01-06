package stackPrograms;
/***
 * 3
 * <<>>
 * 4
 * 2
 * ><
 * 4
 * <>>>
 *
 * Output
 * 4
 * 0
 * 2
 */

import java.util.Scanner;
import java.util.Stack;

/**
 * @author lenovo
 * @created 04/01/2022- 5:12 PM
 * @project DataStructuresJavaCode
 */
public class compileCode {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase != 0) {
            int lengthBraces = scanner.nextInt();
            String st = scanner.next();
            System.out.println(countBraces(st));
            testCase--;
        }
    }

    private static int countBraces(String str) {
        int bracesCount = 0;
        Stack<Character> stack = new Stack<>();
        char[] array = str.toCharArray();
        for (char e : array) {
            if (e == '>') {
                if (stack.isEmpty() == false) {
                    if (stack.peek() == '<') {
                        bracesCount += 2;
                    } else {
                        while (stack.peek() != '<') {
                            stack.pop();
                        }
                    }
                }else{
                    return bracesCount;
                }
            }else{
                stack.push(e);
            }
        }
        return bracesCount;
    }
}
