package FirstPhaseLearning.Arrays;

public class largeFactorial {
    public long[] factorial(long a[], int n) {
        long []ans = new long[n];
        long max=0;
        for (int i = 0; i <n ; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        long []fact=new long[n];
        fact[0]=1;
        for (int j=1;j<n;j++){
            fact[j]=fact[j]*fact[j-1]%1000000007;
        }
        for(int k=0;k<n;k++){
            ans[k]=fact[k];
        }
        return ans;
    }


    /*
    public long[] factorial(long a[], int n) {
        // code here
        long []result= new long[n];
        for(int i=0;i<n;i++){
            if(a[i]==0 || a[i]==1){
                result[i]=1;
            }
            result[i]=factorial(i);
        }
        return result;
    }

    public int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

     */
}
