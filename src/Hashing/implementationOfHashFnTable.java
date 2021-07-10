package Hashing;

public class implementationOfHashFnTable {
    static void hasFunction(int []array, int search){
        int []hashTable=new int[9];
        for (int i = 0; i < array.length ; i++) {
            hashTable[i]=-1;
            hashTable[array[i]%10]=array[i];
        }
        int index= search%10;
        if (hashTable[index]!=-1){
            System.out.println("FOUND SUCCESSFULLY:-"+hashTable[index]);
        }else {
            System.out.println("NOT FOUND.");
        }
    }

    public static void main(String[] args) {
        int array[]={123,456,245,10,658};
        hasFunction(array,902);

    }
}
