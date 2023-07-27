package codingNinjas.Strings;

import java.util.Stack;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-26,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class MinimumParentheses {

    public static void main(String[] args) {
        System.out.println(minimumParentheses("((((("));
    }
    public static int minimumParentheses(String pattern) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();

            stack.push(pattern.charAt(0));
            for (int i = 1; i < pattern.length() ; i++) {
                if (pattern.charAt(i)==')' && !stack.empty() && stack.peek()== '('){
                    stack.pop();
                } else{
                    stack.push(pattern.charAt(i));
                }
            }
        return stack.size();
    }


}
