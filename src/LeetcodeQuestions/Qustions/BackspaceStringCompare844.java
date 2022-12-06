package LeetcodeQuestions.Qustions;

import java.util.Stack;

//May-1|| Day-1
public class BackspaceStringCompare844 {

    //Method to solvethe problem
    public boolean backspaceCompare(String s, String t) {
        boolean result=false;
        Stack <Character> stack1=new Stack<Character>();
        Stack <Character> stack2=new Stack<Character>();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='#'){
                stack1.pop();
            }else{
                stack1.push(s.charAt(i));
            }
        }
        for (int i = 0; i <t.length() ; i++) {
            if(t.charAt(i)=='#'){
                stack2.pop();
            }else{
                stack2.push(s.charAt(i));
            }
        }
        String string1="";
        String string2="";
        while(!stack1.isEmpty()) {
            string1+=stack1.pop();
        }
        while (!stack2.isEmpty()){
            string2+=stack2.pop();
        }
        return string1.equals(string2);
    }
    public static void main(String[] args) {

    }
}
