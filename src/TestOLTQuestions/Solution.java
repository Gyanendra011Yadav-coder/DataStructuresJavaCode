package TestOLTQuestions;

public class Solution {
    public static void main(String[] args) {
       int num=12321;
        System.out.println(isPalindome(num));
    }

    private static boolean isPalindome(int num) {
        String temp= String.valueOf(num);
        int length=temp.length();
        int n=temp.length();

        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)==temp.charAt(length-1)){
                length--;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

// select * from student where row
}

