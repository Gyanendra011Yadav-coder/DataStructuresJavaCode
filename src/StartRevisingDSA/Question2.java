package StartRevisingDSA;

import java.util.Stack;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-19,Jun,2023
 * in Project: DataStructuresJavaCode
 *
 * Evaluate Reverse Polish Notation
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /. Each operand may be an integer or another expression. For
 * example:
 * ["2", "1", "+", "3",
 * "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class Question2 {
    public static void main(String[] args) {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens));

    }

    private static int evalRPN(String [] tokens){
        String operations="*/+-";
        Stack<String> stack=new Stack<>();

        for(String token:tokens){
            if(!operations.contains(token)){
                stack.push(token);
            }else{
                int a=Integer.parseInt(stack.pop());
                int b=Integer.parseInt(stack.pop());
                switch (token){
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a-b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a/b));
                        break;
                }
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
