package Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-22,Nov,2022
 * in Project: DataStructuresJavaCode
 *
 * Minimum sum of subarray
 */
public class KadanesAlgorithm {
    //Main Method of the class
    public static void main(String[] args) {
        int []array={3,-1,-2};
        for (int i = 0; i < array.length; i++) {
            System.out.print(findMinSum(array, array.length,i, array.length));
        }
    }

    //method to find Minimum sum of subarray
    static int findMinSum(int[] array, int length, int startIndex, int endIndex) {
        int currentMinVal = Integer.MAX_VALUE;
        int overallMinVal = Integer.MAX_VALUE;
        for (int i = startIndex; i <endIndex ; i++) {
            if(currentMinVal<=0){
                currentMinVal+=array[i];
            }else{
                currentMinVal=array[i];
            }
            if(currentMinVal<overallMinVal){
                overallMinVal=currentMinVal;
            }
        }
        return overallMinVal;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int testCase = scanner.nextInt();
//        while(testCase!=0){
//            int length = scanner.nextInt();
//            int []array=new int[length];
//            for(int i = 0; i < length; i++){
//                array[i] = scanner.nextInt();
//            }
//            for (int i = 0; i < array.length; i++) {
//                System.out.print(findMinSum(array, array.length,i, array.length)+" "); // Providing Space area so that output must be with space separated values
//            }
//            System.out.println(); // This will change the  to the next line for the further testCases
//            testCase--;
//        }
//    }

    }
