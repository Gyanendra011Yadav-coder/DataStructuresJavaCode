package DynamicProgramming;

/**
 * @author lenovo
 * @created 17/01/2022- 5:11 PM
 * @project DataStructuresJavaCode
 */
public class uncrossedLines1035Leetcode {

    public static void main(String[] args) {

        /***
         * at this code normal code without dp gives tle
         * [1,2,4,1,4,4,3,5,5,1,4,4,4,1,4,3,4,2,4,2]
         * [2,4,1,1,3,5,2,1,5,1,2,3,3,2,1,4,1,2,5,5]
         */
        int arr1[]={1,4,2};
        int []arr2={1,2,4};
        System.out.println(countUncrossedLines(arr1,arr2,0,0));
    }

    public static int countUncrossedLines(int []num1, int []num2, int indexNum1, int indexNum2){
        int answer=0;
        //this is the base case of this question
        if(indexNum1==num1.length || indexNum2==num2.length){
            return 0;
        }
        if(num1[indexNum1]==num2[indexNum2]){
            answer=1+countUncrossedLines(num1,num2,indexNum1+1, indexNum2+1);
        }else{
            int ans2=countUncrossedLines(num1,num2,indexNum1,indexNum2+1);
            int ans3=countUncrossedLines(num1,num2,indexNum1+1, indexNum2);
            answer=Math.max(ans2,ans3);
        }
        return answer;
    }
}
