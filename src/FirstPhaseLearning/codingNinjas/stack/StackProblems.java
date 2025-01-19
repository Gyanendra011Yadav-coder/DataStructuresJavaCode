package FirstPhaseLearning.codingNinjas.stack;

import java.util.Stack;

public class StackProblems {
    public static boolean isValidParenthesis2(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValidParenthesis = false;
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')' || c == '}' || c == ']') {
                if (!stack.isEmpty() && isMatchingPair(stack.pop(), c)) {
                    isValidParenthesis= true;
                }
            }
        }
        return (stack.isEmpty()?isValidParenthesis:false);
    }
    public static boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValidParenthesis = false;
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')' || c == '}' || c == ']') {
                if (!stack.isEmpty() && isMatchingPair(stack.pop(), c)) {
//                    stack.pop();
                    isValidParenthesis= true;
                }
            }
        }
        return (stack.isEmpty()?isValidParenthesis:false);
    }


    //(a*b+(c/d))- No
    public static boolean findRedundantBrackets(String s)
    {
        Stack<Character> brackets = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')' && !brackets.isEmpty()) {
                // Pop characters until an opening bracket is encountered
                boolean hasOperator = false;
                while (!brackets.isEmpty() && brackets.peek() != '(') {
                    char top = brackets.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                }
                if (!hasOperator) {
                    return true;
                }
                // Remove the opening bracket from the stack
                brackets.pop();
            } else if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // Push opening brackets and operators onto the stack
                brackets.push(ch);
            }
        }
        return false;
    }

    private static boolean isMatchingPair(char openBracket, char closedBracket) {
        return ((openBracket == '(' && closedBracket == ')')
                || ((openBracket == '{' && closedBracket == '}'))
                || ((openBracket == '[' && closedBracket == ']')));
    }
}
