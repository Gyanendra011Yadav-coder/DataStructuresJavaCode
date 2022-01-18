package stackPrograms;

import java.util.Stack;

/**
 * @author Gyanendra Yadav
 * @created 09/01/2022- 2:02 PM
 * @project DataStructuresJavaCode
 */
public class calculateAreaofHistogram {
    public static void main(String[] args) {
        int []heights={2,1,5,6,2,3};
        System.out.println(calculateArea(heights));
    }

    private static int calculateArea(int[]heights){
        int maxArea=0;
        int []previousSmallerValues=calculatePreviousSmall(heights);
        int []nextSmallerValues=calculateNextSmall(heights);
        for (int i = 0; i <heights.length ; i++) {
            int current=(previousSmallerValues[i]-nextSmallerValues[i]-1)*heights[i];
            maxArea=Math.max(current,maxArea);
        }
        return maxArea;
    }



    private static int[] calculatePreviousSmall(int []array){
        int [] arrayPrevious=new int[array.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <array.length ; i++) {
            while (!stack.isEmpty() && array[stack.peek()]>=array[i]){
                stack.pop();
            }
            if(stack.isEmpty()==true){
                arrayPrevious[i]=-1;
            }else{
                arrayPrevious[i]=stack.peek();
            }
            stack.push(i);
        }
        return arrayPrevious;
    }
    private static int[] calculateNextSmall(int[] array) {
        int [] arrayNext=new int[array.length];
        Stack <Integer> stack = new Stack<>();
        for (int i = array.length-1; i>=0; i--) {
            while(!stack.isEmpty() && array[stack.pop()]<=array[i]){
                stack.pop();
            }
            if(stack.isEmpty()==true){
                arrayNext[i]=-1;
            }else{
                arrayNext[i]= stack.peek();
            }
                stack.push(i);
        }
        return arrayNext;
    }
}
