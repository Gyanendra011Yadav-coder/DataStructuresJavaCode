package TestOLTQuestions;

import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * @author lenovo
 * @created 14/12/2021- 11:44 PM
 * @project DataStructuresJavaCode
 */
public class Prime {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long len =1;
        long previous=0;
        while(true){
            long current = (long) ((long) previous+pow(4,len));
            if(previous<n && current>=n){
                break;
            }
            len++;
            previous=current;
            for(int i=0; i<=len;i++){
                for(int j=1;j<=4;j++){
                    if(previous+pow(4,len-i)<n){
                        previous= (long) (previous+pow(4,len-i));
                    }else{
                        if(j==1){
                            System.out.println("2");
                        }else if(j==2){
                            System.out.println("3");
                        }else if(j==3){
                            System.out.println("5");
                        }else if(j==4){
                            System.out.println("7");
                        }else{
                            break;
                        }
                    }
                }
            }
        }
    }
}
