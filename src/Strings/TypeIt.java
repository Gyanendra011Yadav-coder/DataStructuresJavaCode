package Strings;

import static java.lang.Math.max;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-25,Jan,2023
 * in Project: DataStructuresJavaCode
 */
public class TypeIt {

    //Main Method
    public static void main(String[] args) {
        System.out.println(minOperation("abcabca"));
    }


    static int minOperation(String s) {
        // code here
        // int i=0;
        int j=0;
        int n=s.length();
        int ans=0;
        String curr="";
        // Since we are only allowed to concatenate the prefix once, if we have concateneted earlier we will eliminate it and add the current prefix now since it is longer and educes our operations. This caraible keeps track of the length of previously concatenated prefix to compensate it's operations now !
        int maxi=Integer.MAX_VALUE;
        while(j<n){
            String temp=s.substring(j,curr.length());
            // Matching prefix found
            if(curr.length()!=0 && temp==curr){
                // we already carried out the operation, now we have longer prefix, so compensate operations for the past one.
                if(maxi!=Integer.MAX_VALUE){
                    ans+=maxi-1;
                }
                // Current prefix operation
                ans++;
                maxi=curr.length();
                //   cout<<"concatenating "<<curr<<endl;
                j+=curr.length();
                curr+=curr;
            }

            else{
                ans++;
                curr+=s.charAt(j++);
            }
        }
        return ans;
    }

    //Method to solve the probelm of GFG
    static int minOperation2(String string) {
        // code here
        int lengthOfString = string.length();

        int max_len = 0;

        //Base Case
        if(lengthOfString == 1)
            return 1;

        for(int i = 0; i<= lengthOfString /2; i++)
        {
            String s1=string.substring(0,(i+1));
            String s2=string.substring(i+1,i+1);
            if( s1== s2) {
                max_len = max(max_len, i + 1);
            }
        }

        return (lengthOfString - max_len)+1;
    }
}
