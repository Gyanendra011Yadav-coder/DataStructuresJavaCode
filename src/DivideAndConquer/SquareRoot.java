package DivideAndConquer;

import java.util.Scanner;

public class SquareRoot {

    public static int findSquareRoot(int number){
        int index=1;
        while(index<number/2){
            if(index * index == number){
                return index;
            }else{
                continue;
            }
        }
        return 0;
    }

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int numberFindSquareRoot = sc.nextInt();
    }
}
