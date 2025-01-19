package FirstPhaseLearning.Strings;

import java.util.ArrayList;

public class longestSubstringWithoutRepeatingCharactersQuestionThree {
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        ArrayList<Character> list= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            while(list.contains(s.charAt(i))){
                list.remove(s.charAt(i));
            }
            list.add(s.charAt(i));
            result=Math.max(result,list.size());
        }

return result;
       /**
        Stack<Character> stack = new Stack<>();
        String overallString="";
        String currString="";
        int i=0;
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        while (i!=s.length()-1){
            stack.push(s.charAt(i));
            i++;
        }
        while(stack.isEmpty()!=true) {
            char checkChar=stack.pop();
            if(checkContains(currString,checkChar)==true){
                currString="";
                currString=currString+checkChar;
            }else{
                currString=currString+checkChar;
            }
            if (currString.length() > overallString.length()) {
                overallString = currString;
            }
        }
        return overallString.length();
    }

    private static boolean checkContains(String str, char ch){
        int i=0;
        while(i!=str.length()){
            if(str.charAt(i)==ch){
                return true;
            }
            i++;
        }
        return false;
    }
    */
}
}
