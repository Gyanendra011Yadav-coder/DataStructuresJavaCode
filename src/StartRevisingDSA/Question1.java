package StartRevisingDSA;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-19,Jun,2023
 * in Project: DataStructuresJavaCode
 *
 * Rotate Array in Java
 * You may have been using Java for a while. Do you think a simple Java array question
 * can be a challenge? Let’s use the following problem to test.
 * Problem: Rotate an array of n elements to the right by k steps. For example, with n
 * = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different
 * ways do you know to solve this problem?
 *
 */
public class Question1 {
    public static void main(String[] args) {
        int []qusArr={1,2,3,4,5,6,7};
        int[] answer1= solution1(qusArr,3);
        for (int val:answer1) {
            System.out.print("Soltuion1: "+val +" ,");
        }

        System.out.println();
        int[] answer2= solution2(qusArr,3);
        for (int val:answer2) {
            System.out.print("Soltuion2: "+val +" ,");
        }

        System.out.println();
        int []qusArr3={1,2,3,4,5,6,7};
        int[] answer3= solution3(qusArr3,3);
        for (int val:answer3) {
            System.out.print("Soltuion3: "+val +" ,");
        }
    }

    /**
     *
     * @param solution
     * @param moveNTime
     * @return
     *
     * In this, approach what I do is create another array that makes the Space Complexity to O(n)
     * Just, Place original index value into the newly created array's (currentIndex+moveNTime)th place
     * but if (currentIndex+moveNTime) is greater than arrays size then we do is place the element at
     * (currentIndex+moveNTime)-array's size length
     */
    private static int[] solution1(int[] solution, int moveNTime){
        int []tempArray =new int[solution.length];

        for (int i = 0; i < solution.length; i++) {
            if((i+moveNTime)<solution.length){
                tempArray[i+moveNTime]=solution[i];
            } else if ((i+moveNTime)>=solution.length) {
                tempArray[(i+moveNTime)-solution.length]=solution[i];
            }
        }
        return tempArray;
    }

    //Solving using bubble sort approach , Soltuion have TimeComplexity: O(n*k), space:O(1)
    private static int[] solution2(int[] arr, int moveNTime){
        for (int rotateTime = 0; rotateTime <moveNTime ; rotateTime++) { //this will roatate the array K time
            for (int arrIndex = arr.length-1;  arrIndex>0 ; arrIndex--) {
                int temp = arr[arrIndex]; // storing the last index in the temp variable
                arr[arrIndex] = arr[arrIndex-1]; // updating the last index value with the previous value
                arr[arrIndex-1] = temp; //storing the last value at the current index
            }
        }
        return arr;
    }

    //Now, looking for the third approach that will be reversing the array in two parts and then at last reversing the array whole
    private static int[] solution3(int[] arr, int moveNTime){
        if(moveNTime> arr.length){
            moveNTime=moveNTime%arr.length; //This is because when we reverse the array for array's length time we will get the same array
        }

        //the length of the first part is:
        int lenFirstPart=arr.length-moveNTime;
        reverseArray(arr, 0,lenFirstPart-1); //reversing the first part
        reverseArray(arr, lenFirstPart,arr.length-1); // reversing the second part
        reverseArray(arr, 0, arr.length-1);  // reversing the whole array

        return arr;
    }

    private static void reverseArray(int []arr, int startIndex, int endIndex){

        while(startIndex<endIndex){ //simple reversing the array
            int temp=arr[startIndex];
            arr[startIndex]=arr[endIndex];
            arr[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
    }
}
