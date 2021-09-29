package DivideAndConquer;

public class luckyNumber {
    public void findNumber(long lN1, long lN2, int k){
        long low=0;
         long high=Long.MAX_VALUE;
         long mid= (low+high)/2;

    }
    public static long gcd(long a , long b){
        if(b==0) {
            return a;
        }else{
            return gcd(a, a%b);
        }
    }
}
