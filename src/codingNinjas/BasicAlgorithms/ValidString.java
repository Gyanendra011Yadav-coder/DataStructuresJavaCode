package codingNinjas.BasicAlgorithms;

import java.util.Stack;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-08,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class ValidString {

    public static void main(String[] args) {
        System.out.println(checkValidString("(())()*"));
    }

    public static boolean checkValidString(String s) {
        int low = 0, high = 0;
        for (char c : s.toCharArray()) {
            low += (c == '(') ? 1 : -1;
            high += (c != ')') ? 1 : -1;
            if (high < 0) break;
            low = Math.max(low, 0);
        }
        return low == 0;

    }

    public static boolean checkValidStringBrutt(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.startsWith(")")) return false;

        int index=1;
        stack.push(s.charAt(0));
        while (index<s.length() && stack.size()>0 ) {
            if(s.charAt(index)=='(' || s.charAt(index)=='*'){
                stack.push(s.charAt(index));
            } else if(s.charAt(index)==')'){
//                if(stack.peek()=='*' && stack.peek()=='('){
                    stack.pop();
//                }
            }
            index++;
        }

        return (!stack.isEmpty()?false:true);
    }

}
