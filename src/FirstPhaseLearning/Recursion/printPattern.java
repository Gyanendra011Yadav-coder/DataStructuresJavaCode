package FirstPhaseLearning.Recursion;

import java.util.Scanner;

public class printPattern {
    public static int printPatterns(int N){
        int temp=N;
        while (N>0){
            return N-printPatterns(N-5);
        }
        while (N!=temp){
            return N+printPatterns(N+5);
        }

    return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print(printPatterns(N)+" ");
        /*
        int temp=N;
        System.out.print(temp+" ");
        while(N>0){
            //N-=5;
            N=N-5;
            System.out.print(N+" ");
        }
        while(N!=temp){
            N=N+5;
            System.out.print(N+" ");
        }
        //while(N!=16){}
        */

    }
}
