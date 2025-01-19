package FirstPhaseLearning.Strings;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-09,Nov,2022
 * in Project: DataStructuresJavaCode
 */
public class PalindromeString {
    public void main(String[] args) {
       String strCheckFunction= "abba";
        System.out.println(isPalindrome(strCheckFunction));
    }
    int isPalindrome(String S) {
        // code here
        return isPalindromeUsingRecursion(S,0,S.length()-1);
    }

    private int isPalindromeUsingRecursion(String stringToCheckPalindro, int startIndex, int lastIndex) {
        //Base Case
        if(stringToCheckPalindro.length()<0 || startIndex<0 || lastIndex<0){
            return 0;
        }
        if(startIndex>=lastIndex){
            return 1;
        }
        if(stringToCheckPalindro.charAt(startIndex)==(stringToCheckPalindro.charAt(lastIndex))){
            return isPalindromeUsingRecursion(stringToCheckPalindro, startIndex+1,lastIndex-1);
        }
        return 0;
    }
}
