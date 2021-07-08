package stackPrograms;

import java.util.Scanner;
import java.util.Stack;

public class redudantBracketProblem {

    static boolean isRedundant(String str) {
        int countBraces=0, countOperator=0;
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)=='(') && str.charAt(i+1)==')' ){
                return true;
            }
            if (str.charAt(i)=='*' ||
                    (str.charAt(i)=='/')||
                    (str.charAt(i)=='+') ||
                    (str.charAt(i)=='-')){
                countOperator++;
            }
            if (str.charAt(i)=='(')
                countBraces++;

        }
        if (countBraces>countOperator)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nam=      "((a+b)/(a-b)*(x+y)+(x))";       //"((a+b)*(a-b)*(a*b)*(a/b))" ; //sc.next();

        if (isRedundant(nam))
            System.out.println("1");
        else
            System.out.println("0");

    }
}

