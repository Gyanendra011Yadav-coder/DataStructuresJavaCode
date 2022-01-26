package stackPrograms;

import java.util.Stack;

/**
 * @author Gyanendra Yadav
 * @created 27/01/2022- 2:19 AM
 * @project DataStructuresJavaCode
 */
public class basicCalculatorLeetcodeQueNumber224 {
    public static void main(String[] args) {
        String str=" 2-1 + 2 ";
        System.out.println(calculate(str));
    }

    private static int calculate(String s) {
        int sum=0;
        int sign=+1;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            //first condition that says if we will get digit then
            if(Character.isDigit(ch)){
                int value=0;
                while( i<s.length() && Character.isDigit(s.charAt(i))){
                    value=value*10 + (s.charAt(i)-'0');
                    i++;
                }
                //Decreasing it's soze as it will go the next sign which is not digit
                i--;
                value*=sign;
                sum+=value;

            }
            //Second condition says if we will get opening braces then
            else if(ch=='('){
                stack.push(sum);
                stack.push(sign);
                sign=1;
                sum=0;
            }
            //third condiotion says if we will get Closing braces then
            else if(ch==')'){
                sum*=stack.pop();
                sum+=stack.pop();
            }
            // fourth condition says if we will get negative or subtraction sign
            else if(ch=='-'){
                sign*=-1;
            }
        }
        return sum;
    }
}
