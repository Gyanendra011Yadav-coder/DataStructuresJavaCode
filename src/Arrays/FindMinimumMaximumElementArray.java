package Arrays;

import TreeDataStructure.binaryTreeImplementation;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-11,Nov,2022
 * in Project: DataStructuresJavaCode
 */
public class FindMinimumMaximumElementArray {
    public static void main(String[] args) {
        long []array={3, 2, 1, 56, 1000, 167};
        pair result =getMinMax(array,array.length);
        long first =result.getFirst();
        long second=result.getSecond();
        System.out.println(first+" "+second);
    }
    public static pair getMinMax(long a[], long n)
    {
        //Write your code here
        long minEle = 100000000;
        long maxEle=a[0];
        for (int i = 0; i <n ; i++) {
            if (a[i] > maxEle) {
                maxEle = a[i];
            } else {
                if(a[i]<minEle) {
                    minEle = a[i];
                }
            }
        }
        return new pair(minEle, maxEle);
    }
    static class pair
    {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }

        public long getFirst() {
            return first;
        }
        public long getSecond() {
            return second;
        }
    }
}
