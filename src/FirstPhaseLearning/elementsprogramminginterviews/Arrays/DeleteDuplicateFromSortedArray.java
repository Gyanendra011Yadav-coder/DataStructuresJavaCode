package FirstPhaseLearning.elementsprogramminginterviews.Arrays;

public class DeleteDuplicateFromSortedArray {
    public static void main(String[] args) {
        int [] array = {2,3,5,5,7,11,11,11,13};
        int [] result = deleteDuplicateElements2(array);
    }

    public static int[] deleteDuplicateElements2(int[] elements) {
        if (elements.length <= 0) return elements;
        int write_index = 1;
        for (int i = 1; i < elements.length; i++) {
            if( elements[write_index-1] != elements[i]){
                int indexT=write_index++;
                elements[indexT] = elements[i];
            }
        }
        return elements;
    }

        public static int[] deleteDuplicateElements(int[] elements){
        if(elements.length<=0) return elements;
        int sizeElementArray = elements.length;
        for (int i = 0; i < sizeElementArray; i++) {
            int secondIndex = i + 1;
            if (elements[i] == elements[secondIndex] && (elements[i] != 0 || elements[secondIndex]!=0)) {
                while (secondIndex<sizeElementArray && elements[i] == elements[secondIndex]) {
                    elements[secondIndex] = 0;
                    secondIndex++;
                }
            }
        }
        // now we will put all zeroes to end
        for (int i = 0; i < sizeElementArray; i++) {

        }
        return elements;
    }
}
