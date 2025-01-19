package FirstPhaseLearning.Hashing;

import java.util.Scanner;

public class closedAddressingTypeHashing {
    /*LINKED LIST TO STORE THE VALUES */
    static class LinkedHash{
        int key;
        int value;
        LinkedHash next;
        public LinkedHash(int key, int value){
            this.key=key;
            this.value=value;
            this.next=null;
        }
    }

    /*HASH TABLE */
    static class hashTable{
        private int TABLE_SIZE; // THIS IS THE LENGTH OF THE TABLE
        private int size;
        private LinkedHash []table ;
        public hashTable(int capacity){
            TABLE_SIZE=capacity;
            table= new LinkedHash[TABLE_SIZE];
            /*MAKING THE TABLE NULL*/
            for (int i = 0; i <TABLE_SIZE ; i++) {
                table[i]=null;
            }
        }
        /*This method will return the size of the Hash_Table*/
        public int getSize(){
            return  size;
        }

        /*THIS FUNCTION WILL CLEAR THE HASH TABLE*/
    void clearHashTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }
    }
        /*THIS METHOD WILL INSERT THE KEY AND THE VALUES AT THE SPECIFIED POSITION*/
     void insertHashTable(int key, int value){
         /*FINDING OUT THE HASH VALUE*/
         int hash=(key%TABLE_SIZE);
         /*CHECKING THE CONDITION IF IT IS NULL*/
         if (table==null){
             table[hash]=new LinkedHash(key,value);
         }else {
             LinkedHash temp=table[hash];
             while (temp.next!=null && !(temp.key==key)){
                 temp=temp.next;
             }
             if (temp.next==null){
                 temp.next=new LinkedHash(key,value);
             }else {
                 temp.value=value;
                 //or we can simply sout("IT IS DUPLCATE ELEMENT")
             }
         }
     }
     /*THIS, METHOD WILL PRINT THE HASH TABLE*/
        public void  printHashTable(){
            if (table==null){
                System.out.println("-1");;
            }else {
                for (int i = 0; i <TABLE_SIZE ; i++) {
                    System.out.println("\n BUCKET :"+i+1 +" ");
                    LinkedHash temp=table[0];
                    while (temp.next!=null){
                        System.out.println("KEY:"+ temp.key + "\n"+
                                "VALUE:" + temp.value);
                    }
                }
            }
        }
        /*THIS METHOD WILL FIND THE VALUE IN THE HASH TABLE*/
     int getValue(int key){
            int hash=(key%TABLE_SIZE);
            if (table[hash]==null){
                return -1;
            }else {
                LinkedHash temp=table[hash];
                while (temp.next!=null && !(temp.key==key)){
                    temp=temp.next;
                }
                if (temp.key==key){
                    return key;
                }else {
                    return -1;
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size_Of_Table= sc.nextInt();
            hashTable hashTable= new  hashTable(size_Of_Table);
            for (int i = 0; i <size_Of_Table ; i++) {
                int key= sc.nextInt();
                int value= sc.nextInt();
                hashTable.insertHashTable(key,value);
            }
            hashTable.printHashTable();
            System.out.println(hashTable.getValue(289));
            System.out.println(hashTable.getSize());
            hashTable.clearHashTable();
            hashTable.printHashTable();

        }
    }



}
