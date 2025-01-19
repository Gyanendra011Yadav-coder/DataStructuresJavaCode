package FirstPhaseLearning.Arrays;

public class productArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n)
    {
        long []ans= new long[n];
        long []left= new long[n];
        long []right=new long[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=nums[i-1]*left[i-1];
        }
        for(int j=n-2;j>=0;j--){
            right[j]=nums[j+1]*right[j+1];
        }
        for(int k=0; k<n;k++){
            ans[k]=left[k]*right[k];
        }
        return ans;
        // code here
        /**
        long []ansArray= new long[n];
        for(int i=0;i<n;i++){
            int multiply=1;
            for(int j=0;j<n;j++){
                if(j!=i) {
                    multiply=multiply*nums[j];
                }else{
                    continue;
                }
            }
            ansArray[i]=multiply;
        }
        return ansArray;
         */
    }
}
