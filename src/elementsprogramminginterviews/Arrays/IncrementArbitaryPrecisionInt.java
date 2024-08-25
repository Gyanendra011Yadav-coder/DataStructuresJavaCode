package elementsprogramminginterviews.Arrays;

public class IncrementArbitaryPrecisionInt {
    // if get array as [1,2,9] then return by adding 1 as 130
    public static void main(String[] args) {
        int [] array = {1, 2, 9};
        additionInArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static void additionInArray(int[] array) {
        int carry = 1;
        int index = (array.length) - 1;
        while (index >= 0) {
            if(carry==0) {
                break;
            }
            int sum = array[index] + carry;
            array[index]=sum%10;
            carry=sum/10;
            index--;
        }
    }

//    public static int carryDetermine(int num){
//
//    }

}
