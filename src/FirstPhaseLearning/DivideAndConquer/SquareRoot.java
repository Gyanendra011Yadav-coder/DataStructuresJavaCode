package FirstPhaseLearning.DivideAndConquer;

import java.util.Scanner;

public class SquareRoot {

//this is the optimised approach, that we wil be using to Find,Square root Using, Binary Search ny dividiing it

    public static long findSquareRoot(long number) {
        if (number == 0 || number == 1) {
            return number;
        }
        long begin = 1;
        long end = number/2;
        long answer=0;
        while (begin <= end) {
            long mid = ((begin+end )/ 2);
            if (mid * mid == number) {
                return mid;
            }
             if (mid * mid < number) {
                answer=mid;
                begin=mid+1;
            }else{
                end=mid-1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number=sc.nextLong();
        long result=  findSquareRoot(number);
        System.out.println(result);
    }

}




    /*

    public static int findSquareRoot(int number){
        if (number== 0) {
            return 0;
        }
        if (number==1){
            return 1;
        }
        int index=1;
        while(index<number/2){
            if(index * index == number){
                return index;

            }else{
                index++;
            }
        }
        return 0;
    }

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int numberFindSquareRoot = sc.nextInt();
        int result=findSquareRoot(numberFindSquareRoot);
        System.out.println("The Square Root Of The"+numberFindSquareRoot+",is:"+(result));
    }
}

     */
