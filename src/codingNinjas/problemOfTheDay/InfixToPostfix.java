package codingNinjas.problemOfTheDay;

import java.util.Stack;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-24,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class InfixToPostfix {
    public static void main(String[] args) {
        System.out.println(infixToPostfix("ab+c+d+e-"));
    }

    public static String infixToPostfix(String exp) {
        String num="";
        String symbol="";
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            if(exp.charAt(i)=='+' || exp.charAt(i)=='-' || exp.charAt(i)=='*' || exp.charAt(i)=='/' || exp.charAt(i)=='^'){
                stack.add(exp.charAt(i));
            }else{
                if(exp.charAt(i)=='(' || exp.charAt(i)==')'){
                   continue;
                }else {
                    num+=exp.charAt(i);
                }
            }
        }

        while (!stack.isEmpty()){
            num+=stack.pop();
        }
        return num;
    }
}
