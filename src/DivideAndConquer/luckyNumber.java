package DivideAndConquer;

public class luckyNumber {
    public void findNumber(long lN1, long lN2, int k){
        long low=0;
         long high=Long.MAX_VALUE;

         long answer;
        while(low<high){
            long mid= (low+high)/2;
            answer=mid/lN1+mid/lN2-mid/gcd(lN1,lN2);
            if(answer<k){
                low=mid+1;
            }else{
                high=mid;
            }
            System.out.println(low);
        }

    }
    public static long gcd(long a , long b){
        if(b==0) {
            return a;
        }else{
            return gcd(a, a%b);
        }
    }
}
