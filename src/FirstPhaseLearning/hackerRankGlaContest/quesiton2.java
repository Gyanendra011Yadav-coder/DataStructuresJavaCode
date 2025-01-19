package hackerRankGLAContest;

import java.util.Scanner;

/**
 * @author lenovo
 * @created 07/02/2022- 6:50 PM
 * @project DataStructuresJavaCode
 */
public class quesiton2 {

    private static boolean canBeChained(String []str, int n){
        boolean result=true;
        for(int i=0 ;i<str.length;i++ ){
            
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scannerObject = new Scanner(System.in);
        int size=scannerObject.nextInt();
        String[] stringArray = new String[size];
        for(int i=0; i<size;i++){
            stringArray[i]= scannerObject.next();
        }
        System.out.println((canBeChained(stringArray, size) ?"True" :"False"));
    }
}
