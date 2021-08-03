package Recursion;

import java.util.Scanner;

public class printPattern {
    public void printPatterns(int N){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
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
    }
}
