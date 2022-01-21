package stackPrograms;

import java.util.Stack;

/**
 * @author lenovo
 * @created 21/01/2022- 4:46 PM
 * @project DataStructuresJavaCode
 */
public class formMinimumNumberUsingGivenSequence {
    public static void main(String[] args) {

    }


    private static void form_minimum_number_using_stack(String string){
        Stack <Integer> stack = new Stack<>();
        //this will be running to the end of the string
        for (int i = 0; i <=string.length(); i++) {
            //pushing if we will be D at any index in String
            stack.push(i+1);
            //If, the length of the String is at the end and when we found I the we will make the stack empty
            if(i==string.length() || string.charAt(i)=='I'){
                while(stack.isEmpty()!=true){
                    System.out.println(stack.pop());
                }
            }
        }
    }
}
