package Strings;

import java.util.Stack;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-23,Jan,2023
 * in Project: DataStructuresJavaCode
 */
public class GeeksAndString {
    public static void main(String[] args) {
        System.out.println(removePair("aaabbaaccd"));
    }

    public static String removePair(String a) {
        Stack<Character> stack = new Stack<>();
        String ans="";
        for(int i =0; i<a.length(); i++){
            if(stack.size()==0) stack.add(a.charAt(i));
            else if(stack.peek()==a.charAt(i)) stack.pop();
            else stack.add(a.charAt(i));
        }
        if(stack.size()==0) return "-1";
        while(stack.size()>0){
            ans= stack.pop()+ans;
        }
        return ans;
    }
}
