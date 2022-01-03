package stackPrograms;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Gyanendra Yadav
 * @created 03/01/2022- 7:52 PM
 * @project DataStructuresJavaCode
 */

public class redundantBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(countRedundantBraces(str));
    }

    private static int countRedundantBraces(String str) {
        int countRedundantBraces=0;
        int length=str.length();
        //Creating Stack
        Stack<Character> st= new Stack<>();


        //Array to store Characters of String
        char []character=str.toCharArray();
        //Applying for each loop
        for(char e: character){
            if(e==')'){
            //for Open braces
                if(st.peek()=='('){
                    countRedundantBraces++;
                }else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                }
            }else{
                st.push(e);
            }
        }
        return countRedundantBraces;
    }

}

