package CodeForcesContestQuestions;


import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {
        question1 qus = new question1();
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase != 0) {
            qus.excitment(3, 9);
        }
    }

    void excitment(int a, int b){
        int stepCount=0;
        if((a>2 && a!=b || b>2 && b!=a)&& a>b){
            a=a+1;
            b=b+1;
            stepCount++;
            int GCD=gcd(a, b);
           System.out.print(GCD+" ");
            System.out.print(stepCount);
        }else if ((a>2 && a!=b || b>2 && b!=a)&& b>a) {
                while (a!=0 || b!=0){
                    a=a-1;
                    b=b-1;
                    stepCount++;
                    break;
                }
            System.out.print(b+" ");
            System.out.print(stepCount);
        }else if (a==b){
            System.out.print(0+" ");
            System.out.print(0);
        }


    }
    int gcd(int a , int b){
        int gcd=1;
        for (int i = 2; i <= a && i<=b ; i++) {
            if (a%i==0 && b%i==0){
                gcd =i;
            }
        }
        return gcd;
    }

}
