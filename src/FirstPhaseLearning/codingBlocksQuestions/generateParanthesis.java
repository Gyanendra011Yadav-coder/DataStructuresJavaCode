package FirstPhaseLearning.codingBlocksQuestions;

import java.util.Scanner;

public class generateParanthesis {

    public static void GenerateParanthesis(int n, int starting, int ending,String result){
        if (starting ==n && ending ==n){
            System.out.println(result);
            return;
        }
        if (ending < starting){
            GenerateParanthesis(n, starting, ending +1, result +")");
        }
        if (starting <n){
            GenerateParanthesis(n, starting +1, ending, result +"(");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GenerateParanthesis(n,0,0,"");
    }
}
